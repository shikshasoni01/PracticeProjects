package com.brandAmbassador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("COMPANY_AMBASSADOR_JPA");
        EntityManager em= emf.createEntityManager();
        
        em.getTransaction().begin();
        
        BrandAmbassador bm1= new BrandAmbassador("Virat Kohli",1000000,9.0);
        BrandAmbassador bm2= new BrandAmbassador("Alia Bhatt",100000,8.0);
        BrandAmbassador bm3= new BrandAmbassador("Sonam Kapoor",90000,6.2);
        BrandAmbassador bm4= new BrandAmbassador("Anushka Sharma",100000,7.5);
        BrandAmbassador bm5= new BrandAmbassador("Anil Kapoor",70000,5.9);
        BrandAmbassador bm6= new BrandAmbassador("Ananya Pandey",700000,7.3);
        BrandAmbassador bm7= new BrandAmbassador("Akshay Kumar",500000,7.1);
        BrandAmbassador bm8= new BrandAmbassador("Aamir Khan",400000,6.5);
        BrandAmbassador bm9= new BrandAmbassador("Varun Dhawan",390000,8.1);
        BrandAmbassador bm10= new BrandAmbassador("Diljit Dosanjh",87000,7.2);
      
        Company company1= new Company("Puma" ,"Sports Wear",20000000,bm1);
        Company company2= new Company("Gucci" ,"Clothing",30000000,bm2);
        Company company3= new Company("Vogue" ,"Modelling Magazine",500000,bm3);
        Company company4= new Company("BoAt Speakers" ,"Music Products",900000,bm10);
        Company company5= new Company("Maruti" ,"Vehicle",90000000,bm9);
        Company company6= new Company("Policy Bazaar" ,"Loans",300000,bm7);
        Company company7= new Company("Malabar Gold and Diamonds" ,"Jewellery",60000000,bm5);
        Company company8= new Company("Godrej Consumer Products" ,"Electronics",9000000,bm4);
        Company company9= new Company("Lakme" ,"Makeup Products",60000000,bm6);
        Company company10= new Company("Phone Pe" ,"Payment",900000,bm8);
        
        em.persist(company1);
        em.persist(company2);
        em.persist(company3);
        em.persist(company4);
        em.persist(company5);
        em.persist(company6);
        em.persist(company7);
        em.persist(company8);
        em.persist(company9);
        em.persist(company10);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
}
