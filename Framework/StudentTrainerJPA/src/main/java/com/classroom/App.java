package com.classroom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("STUDENT_TRAINER_JPA");
        EntityManager em= emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Trainer trainer1= new Trainer("Ritesh Jadhav","Core Java",80000);
        Trainer trainer2= new Trainer("Sidhart Soni","Advance Java",50000);
        Trainer trainer3= new Trainer("Nilesh Magar","Frontend",50000);
        
        Student student1= new Student("Ayush Pandey","CSJ001","03-07-2002",trainer1);
        Student student2= new Student("Tejas Jadhav","CSJ004","29-09-2003",trainer3);
        Student student3= new Student("Vaishanvi Nalawade","CSJ008","15-12-2002",trainer2);
        Student student4= new Student("Kajal Pawar","CSJ002","20-02-2000",trainer3);
        Student student5= new Student("Somnath Sarangle","CSJ007","04-06-2001",trainer1);
        Student student6= new Student("Sandesh Dhingre","CSJ009","23-03-2003",trainer2);
        
        // when only trainer persisted student will not be persist even after cascading
//        em.persist(trainer1);
//        em.persist(trainer2);
//        em.persist(trainer3);
        //when only student persisted ,trainer also persisted because of cascading
        em.persist(student1);
        em.persist(student2);
        em.persist(student3);
        em.persist(student4);
        em.persist(student5);
        em.persist(student6);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
}
