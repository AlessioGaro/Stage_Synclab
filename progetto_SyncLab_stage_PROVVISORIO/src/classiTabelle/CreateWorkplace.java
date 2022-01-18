package classiTabelle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateWorkplace {

	public static void main(String args[]) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Workplace.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Workplace tempWorkplace = new Workplace("Roma");
			
			session.beginTransaction();
			
			session.save(tempWorkplace);
			
			session.getTransaction().commit();
			
			System.out.println("done");
		}
		
		finally {
				factory.close();
		}
	}
}
