package POJO_Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapConfig {
	public static void main(String[] args) {
		 Configuration configuration = new Configuration();
		 configuration.configure("./src/main/java/POJO_Student/hib.xml");
		 SessionFactory sessionFactory = configuration.buildSessionFactory();
		 Session session = sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 
		 Student s1=new Student();
		 s1.setSid(1);
		 s1.setName("MAX");
		 s1.setAge(24);

		 Department d1=new Department();
		 d1.setDept_Id(10);
		 d1.setDept_name("CSE");
		 d1.setStd(s1);
		 s1.setDept(d1);
		 session.persist(s1);
		 
		 transaction.commit();
	}
}
