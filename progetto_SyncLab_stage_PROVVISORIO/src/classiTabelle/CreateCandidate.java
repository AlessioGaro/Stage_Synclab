package classiTabelle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCandidate {

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
			
			// Employee's ID start at 2000
			// Candidate's ID starts at 1000
			
			Figure tempFigure = new Figure("GLB5603FR", "Giulio", "Bianchi");
			
			Candidate tempCandidate = new Candidate("giul777", "myPassword");
			
			
			tempFigure.setEmployee(null);
			tempFigure.setCandidate(tempCandidate);
			
			
			
			session.beginTransaction();
			
			
			
			session.save(tempFigure);
			
		
			
			session.getTransaction().commit();
			
			System.out.println("done");
		}
		finally {
			factory.close();
		}


	}

}
