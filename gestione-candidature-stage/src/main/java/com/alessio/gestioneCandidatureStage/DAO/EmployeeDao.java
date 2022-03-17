package com.alessio.gestioneCandidatureStage.DAO;

import java.util.List;

import com.alessio.gestioneCandidatureStage.entity.Employee;
import com.alessio.gestioneCandidatureStage.entity.Figure;

public interface EmployeeDao {
	
	Employee findById(int id);
    
    Employee findByUsername(String username);
     
    void save(Employee employee, Figure figure);
     
    void deleteByUsername(String username);
     
    List<Employee> findAllUsers();

}
