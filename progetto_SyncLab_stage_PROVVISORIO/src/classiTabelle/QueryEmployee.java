package classiTabelle;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryEmployee {

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
			
			List<Figure> employees = session.createQuery("FROM Figure E WHERE E.employee is not null ORDER BY E.employee.id").getResultList();
			
			for(Figure emp: employees) {
				System.out.println(emp);
			}
			
			session.getTransaction().commit();
			
			System.out.println("done");
		}
		finally {
			factory.close();
		
		}
	}

}
