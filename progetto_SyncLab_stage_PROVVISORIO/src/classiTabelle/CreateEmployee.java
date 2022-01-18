package classiTabelle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateEmployee {

	public static void main(String[] args) {
		
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
					
					Figure tempFigure = new Figure("MRPGN355G65", "Marta", "Pagani");
					
					Employee tempEmployee = new Employee("mapaga", "martapass");
					
					// Employee's ID start at 1000
					// Candidate's ID starts at 2000
					
					tempFigure.setEmployee(tempEmployee);
					tempFigure.setCandidate(null);
					
					
					
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
