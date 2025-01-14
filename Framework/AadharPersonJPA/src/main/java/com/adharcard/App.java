package com.adharcard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("AADHAR_PERSON_JPA");
        EntityManager em= emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Aadhar aadhar1= new Aadhar();
        aadhar1.setAadharNumber("4568 0128 8547");
        
        Aadhar aadhar2= new Aadhar();
        aadhar2.setAadharNumber("5874 9658 5793");
        
        Aadhar aadhar3= new Aadhar();
        aadhar3.setAadharNumber("4854 6957 5941");
        
        Person person1 = new Person("Akash Sharma", "Pune , Maharashtra","08-11-2001",aadhar1);
        Person person2 = new Person("Kavita Thakur", "Mumbai , Maharashtra","22-02-2000",aadhar3);
        Person person3 = new Person("Nilima Parmar", "Jaipur , Rajasthan","17-05-2002",aadhar2);
        
        em.persist(aadhar1);
        em.persist(aadhar2);
        em.persist(aadhar3);
        
        em.persist(person1);
        em.persist(person2);
        em.persist(person3);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        }
}
