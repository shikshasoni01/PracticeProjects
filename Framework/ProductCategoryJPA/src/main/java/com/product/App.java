package com.product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("PRODUCT_CATEGORY_JPA");
        EntityManager em= emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Category category1= new Category("Makeup");
        Category category2= new Category("Vehicle");
        Category category3= new Category("Electronic");
        Category category4= new Category("Kitchen");
        Category category5= new Category("Clothes");
        
        Product product1= new Product("Ball Gown Dress",500000,"Manish Malhotra",category5);
        Product product2= new Product("Microwave",15000,"Godrej",category3);
        Product product3= new Product("Datsun Go",550000,"Nissan",category2);
        Product product4= new Product("Dinning Set",4000,"Cello",category4);
        Product product5= new Product("Foundation",3500,"Blue Havean",category1);
        Product product6= new Product("Smart Led TV",30000,"LG",category3);
        Product product7= new Product("Cookware set of 3",2500,"WonderChef",category4);
        Product product8= new Product("Coord Set",5000,"Raymond",category5);
        Product product9= new Product("Lipstick",3000,"Lakme",category1);
        Product product10= new Product("Grand i10",800000,"Maruti Suzuki ",category2);
        
        em.persist(product1);
        em.persist(product2);
        em.persist(product3);
        em.persist(product4);
        em.persist(product5);
        em.persist(product6);
        em.persist(product7);
        em.persist(product8);
        em.persist(product9);
        em.persist(product10);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
}
