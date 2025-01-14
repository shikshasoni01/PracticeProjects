package com.basicjpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("PRODUCT_JPA");
       EntityManager em= emf.createEntityManager();
       
       em.getTransaction().begin();
       
       Product product1= new Product("Foundation",4000,"Lakme");
       Product product2= new Product("Badminton Racket",5000,"Yonex");
       Product product3= new Product("Microwave Oven",9000,"Godrej");
       Product product4= new Product("Smart watch",3000,"Fireboult");
       Product product5= new Product("Monaco Biscuit",50,"Parle");
       
       em.persist(product1);
       em.persist(product2);
       em.persist(product3);
       em.persist(product4);
       em.persist(product5);
       
       em.getTransaction().commit();
       
      // Query query= em.createQuery("select p from Product p where p.brand ='Parle'");
       Query query= em.createQuery("select p from Product p where p.price>=5000");
       List<Product> products= query.getResultList();
       
       for(Product p :products)
       {
    	   System.out.println(p.toString());
       }
       em.close();
       emf.close();
       
    }
}
