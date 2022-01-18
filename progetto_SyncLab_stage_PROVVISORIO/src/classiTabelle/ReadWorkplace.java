package classiTabelle;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadWorkplace {

	@SuppressWarnings("deprecation")
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Workplace.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		 List<Workplace> listOfWorkplace = new ArrayList<Workplace>();
		
		 listOfWorkplace = session.createCriteria(Workplace.class).list();
		 
		
		  for(Workplace workplace : listOfWorkplace) {
			 System.out.println(workplace.toString());
		 }
	}

}
