package jpql;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class JpaMain{


    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try{
            Member member =new Member();
            member.setUsername("member1");
            em.persist(member);
            //엔티티 프로젝션
            //List<Team> result = em.createQuery("select m.team from Member m join m.team t",Team.class)
            //                .getResultList();
            //임베디드 타입 프로젝션
            //List<Address> result1 = em.createQuery("select o.address from Order o",Address.class)
            //        .getResultList();

            //스칼라 타입 프로젝션
            //List<Object[]> resultList = em.createQuery("select distinct m.username,m.age from Member m").getResultList();
            //Object[] objects = resultList.get(0);
            List<MemberDTO> resultList = em.createQuery("select new jpql.MemberDTO(m.username,m.age) from Member m" , MemberDTO.class).getResultList();
            MemberDTO memberDTO = resultList.get(0);
            System.out.println("memberDTO.getUsername() = " + memberDTO.getUsername());
            System.out.println("memberDTO.getAge() = " + memberDTO.getAge());
            tx.commit();
        }catch (Exception e){
            tx.rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
        emf.close();



    }


}
