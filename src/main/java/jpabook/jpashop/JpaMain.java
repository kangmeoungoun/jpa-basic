package jpabook.jpashop;

import org.hibernate.Hibernate;
import org.hibernate.jpa.internal.PersistenceUnitUtilImpl;

import javax.persistence.*;
import java.util.List;

public class JpaMain{
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try{
            Address address = new Address("city" , "street" , "10");

            Member member1  = new Member();
            member1.setUsername("member1");
            member1.setHomeAddress(address);
            em.persist(member1);
            Address newAddress = new Address("newCity" , address.getStreet() , address.getZipcode());
            member1.setHomeAddress(newAddress);

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
