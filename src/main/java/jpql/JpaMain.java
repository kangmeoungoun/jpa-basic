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
                Team team = new Team();
                team.setName("teamA");
                em.persist(team);
                Member member =new Member();
                member.setUsername("관리자");
                member.setAge(10);
                member.setTeam(team);
                member.setType(MemberType.ADMIN);
                em.persist(member);
                em.flush();
                em.clear();
                /*String sql = "select " +
                            " case when m.age <=10 then '학생요금'" +
                            "      when m.age >=60 then '경로요금'" +
                            "      else '일반요금' end as str" +
                            " from Member m";


                String sql = "select coalesce(m.username,'이름 없는 회원') as username from Member m";
                */
                String sql = "select nullif(m.username,'관리자') as username from Member m";
            List<String> resultList = em.createQuery(sql , String.class).getResultList();
            for (String s : resultList) {
                System.out.println("s = " + s);
            }
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
