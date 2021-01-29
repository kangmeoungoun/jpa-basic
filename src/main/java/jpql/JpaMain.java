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
                Member member1 = new Member();
                member1.setUsername("관리자1");
                em.persist(member1);
                Member member2 = new Member();
                member2.setUsername("관리자2");
                em.persist(member2);
                em.flush();
                em.clear();
                /*String sql = "select " +
                            " case when m.age <=10 then '학생요금'" +
                            "      when m.age >=60 then '경로요금'" +
                            "      else '일반요금' end as str" +
                            " from Member m";


                String sql = "select coalesce(m.username,'이름 없는 회원') as username from Member m";
                */

                String sql = "select group_concat(m.username) as username from Member m";
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
