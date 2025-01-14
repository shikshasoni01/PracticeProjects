package com.hotelevent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {

    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("HOTEL_EVENT_JPA");
        EntityManager em= emf.createEntityManager();
        
        em.getTransaction().begin();
        
        
        Hotel hotel1 = new Hotel("Grand Empire","Bilaspur");
        Hotel hotel2 = new Hotel("Royal place","Raipur");
        Hotel hotel3 = new Hotel("J W Marriot","Pune");

        Event event1= new Event("BirthDay Celebration","23-11-2024");
        Event event2= new Event("Marriage Celebration","23-12-2024");
        Event event3= new Event("Baby Shower Celebration","01-01-2025");
        Event event4= new Event("Marriage Celebration","03-12-2024");
        Event event5= new Event("BirthDay Celebration","21-11-2024");
        
        hotel1.getEvents().add(event5);
        hotel1.getEvents().add(event3);
        hotel1.getEvents().add(event2);
        
        hotel2.getEvents().add(event4);
        hotel2.getEvents().add(event1);
        
        hotel3.getEvents().add(event3);
        
        em.persist(hotel1);
        em.persist(hotel2);
        em.persist(hotel3);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
    }
}
