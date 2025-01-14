package com.IplAuction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("IPL_AUCTION_JPA");
       EntityManager em= emf.createEntityManager();
       
       em.getTransaction().begin();
       
//       Auction player1= new Auction("Rishab Pant","Delhi Capitals",20000,"RCB",80000);
//       Auction player2= new Auction("K L Rahul","Lucknow SuperGiants",20000,"RCB",30000);
//       Auction player3= new Auction("Joes Buttler","Rajasthan Royal",20000,"CSK",50000);
//       Auction player4= new Auction("Decock","Lucknow SuperGiants",20000,"CSK",50000);
//       Auction player5= new Auction("Maxwell","RCB",20000,"CSK",40000);
//       Auction player6= new Auction("Rachindra Ravinder","CSK",20000,"CSK",20000);
//       Auction player7= new Auction("Arshdeep","PBK",10000,"Mumbai Indians",20000);
//       Auction player8= new Auction("m Siraj","RCB",20000,"RCB",30000);
//       
       //saving the records
//       em.persist(player1);
//       em.persist(player2);
//       em.persist(player3);
//       em.persist(player4);
//       em.persist(player5);
//       em.persist(player6);
//       em.persist(player7);
//       em.persist(player8);
      //searching the record by id 
//       Auction player =  em.find(Auction.class, 1);
//       System.out.println(player.toString());
//       
       //updating the record by id
//       	Auction player =  em.find(Auction.class, 1);
//       	player.setNewTeam("CSK");
//        System.out.println(player.toString());
       
       Auction player =  em.find(Auction.class, 8);
       em.remove(player);
       	
       em.getTransaction().commit();
       em.close();
       emf.close();
    }
}
