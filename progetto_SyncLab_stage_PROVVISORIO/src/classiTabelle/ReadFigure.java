package classiTabelle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadFigure {
	
	public static void main(String arg[]) {
	
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
					
					Figure tempFigure = session.get(Figure.class, "MCRSP759V");
					
					Figure tempFigure2 = session.get(Figure.class, "TG4897D9V");
					
					System.out.println(tempFigure);
					System.out.println(tempFigure2);
					
					System.out.println("done");
					
					session.getTransaction().commit();
				}
				finally {
					factory.close();
				}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
