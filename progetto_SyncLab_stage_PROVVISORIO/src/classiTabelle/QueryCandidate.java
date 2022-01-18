package classiTabelle;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryCandidate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create session factory
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Figure.class)
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Candidate.class)
				.buildSessionFactory();
	
	//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			List<Figure> candidates = session.createQuery("FROM Figure E WHERE E.candidate is not null ORDER BY E.candidate.id").getResultList();
			
			for(Figure cand: candidates) {
				System.out.println(cand);
			}
			
			session.getTransaction().commit();
			
			System.out.println("done");
		}
		finally {
			factory.close();
		
		}
	}

}
