package com.carinfo;

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
    	
    	Car car1= new Car("Suzuki", "Maruti",10000.00);
    	Car car2= new Car("i10", "Maruti",50000.00);
    	
    	ss.save(car1);
    	ss.save(car2);
    	
    	ss.getTransaction().commit();
    	ss.close();
    	sf.close();
    	
    }
}
