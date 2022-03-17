package com.alessio.gestioneCandidatureStage.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.alessio.gestioneCandidatureStage.entity.Employee;
import com.alessio.gestioneCandidatureStage.entity.Figure;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {
	
	 public Employee findById(int id) {
	        Employee employee = getByKey(id);
	        if(employee!=null){
	            Hibernate.initialize(employee.getRoles());
	        }
	        return employee;
	    }

	@Override
	public Employee findByUsername(String username) {
		 Criteria crit = createEntityCriteria();
	        crit.add(Restrictions.eq("username", username));
	        Employee employee = (Employee)crit.uniqueResult();
	        if(employee!=null){
	            Hibernate.initialize(employee.getRoles());
	        }
	        return employee;
	}

	@Override
	public void save(Employee employee, Figure figure) {
		
		System.out.println("save di employeeDao");
		System.out.println(employee.getUsername());
        System.out.println(employee.getFigure().getFiscalCode());
        System.out.println(figure.getFiscalCode());
        System.out.println(figure.getFirstName());
        
         
		 persist(employee, figure);
		
	}

	@Override
	public void deleteByUsername(String username) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("username", username));
        Employee employee = (Employee)crit.uniqueResult();
        delete(employee);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllUsers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.desc("enabled"));
		criteria.addOrder(Order.asc("figure.fiscalCode"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        
		List<Employee> employees = (List<Employee>) criteria.list();
         
        // No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
        // Uncomment below lines for eagerly fetching of userProfiles if you want.
        
        for(Employee employee : employees){
            Hibernate.initialize(employee.getFigure());
        }
        return employees;
	}
	
	

}
