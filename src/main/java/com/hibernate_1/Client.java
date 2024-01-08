package com.hibernate_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		App obj = new App();
		obj.setId(233);
		obj.setName("abc");
		obj.setEmail("xyz@gmail.com");
		obj.setMarks(500);

		Configuration cfg = new Configuration();
		cfg.configure("./hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		s.save(obj);

		s.beginTransaction().commit();

		s.evict(obj);
	}
}
