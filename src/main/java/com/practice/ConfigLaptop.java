package com.practice;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ConfigLaptop {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("configuration/hibernate.cfg.xml");
		
		SessionFactory sf= config.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t = s.beginTransaction();
		
		Laptop laptop=new Laptop();
		laptop.setSlNo(12);
		laptop.setTeamName("RealMadrid15");
		laptop.setCountry("Portugol");
		
		s.save(laptop);
//		Transaction gt = s.getTransaction();
		t.commit();
		s.evict(laptop);
		s.close();
		sf.close();
		

	}
}
