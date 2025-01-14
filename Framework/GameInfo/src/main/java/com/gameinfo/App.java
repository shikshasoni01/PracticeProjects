package com.gameinfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
	  public static void main( String[] args )
	    {
	        
	    	Configuration config = new Configuration().configure("hibernate.cfg.xml");
	    	SessionFactory sf= config.buildSessionFactory() ;
	    	Session ss= sf.openSession();
	    	
	    	ss.beginTransaction();
	    	
	    	Game game1= new Game("Pub-G","Tencent","Online",4);
	    	Game game2= new Game("Lodu King","Gametion","Online/Offline",5);
	    	Game game3= new Game("Dr Driving","Unity","Online",3);
	    	
	    	ss.save(game1);
	    	ss.save(game2);
	    	ss.save(game3);
	    	
	    	ss.getTransaction().commit();
	    	ss.close();
	    	sf.close();
	    	
	    }
	}