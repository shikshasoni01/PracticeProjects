package com.bollywood;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("MOVIES_ACTORS_JPA");
        EntityManager em= emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Actors actor1= new Actors("Ranbir Kapoor",42,"Married");
        Actors actor2= new Actors("Ranveer Singh",38,"Married");
        Actors actor3= new Actors("Kartik Aryan",35,"Single");
        Actors actor4= new Actors("Sidhart khurana",32,"Married");
        Actors actor5= new Actors("Varun Dhawan",32,"Married");
        Actors actor6= new Actors("Alia Bhatt",32,"Married");
        Actors actor7= new Actors("Shardha Kapoor",42,"Single");
        Actors actor8= new Actors("Dipika Padukone",43,"Married");
        Actors actor9= new Actors("kiara Advani",30,"Married");
        Actors actor10= new Actors("Priyanka Chopra",45,"Married");
        
        Movies movie1= new Movies("Bajirao Mastani","Sanjay Leela Bhansali",7.5);
        Movies movie2= new Movies("Tu Jhoothi Mai Makkar","Luv Raajan",5.0);
        Movies movie3= new Movies("Student of the Year","Karan Johar",7.0);
        Movies movie4= new Movies("Bhool Bhulaiya 2","Priyadharshani",6.8);
        Movies movie5= new Movies("Sheersha","Vishnu Vardhan",8.5);
        
        movie1.getActors().add(actor2);
        movie1.getActors().add(actor8);
        movie1.getActors().add(actor10);
        
        movie2.getActors().add(actor1);
        movie2.getActors().add(actor7);
        movie2.getActors().add(actor3);
        
        movie3.getActors().add(actor4);
        movie3.getActors().add(actor5);
        movie3.getActors().add(actor6);
        
        movie4.getActors().add(actor3);        
        movie4.getActors().add(actor9);
        
        movie5.getActors().add(actor4);
        movie5.getActors().add(actor9);
        
        //em.persist(actor1);
        em.persist(movie1);
        em.persist(movie2);
        em.persist(movie3);
        em.persist(movie4);
        em.persist(movie5);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
}
