package ticketbooking;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ConfigClass {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("./ticketbooking/hibernate.cfg.xml").buildSessionFactory();
 		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		 
		POJO_Booking obj=new POJO_Booking();
//		obj.setId(2);
		obj.setName("Jacks");
		obj.setShowTime("9PM");
		obj.setSeats(5);
		
		session.save(obj);
		t.commit();
		session.close();
		sf.close();
	}
}
