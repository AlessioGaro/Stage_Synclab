package com.alessio.gestioneCandidatureStage.service;

import java.util.List;

import javax.validation.Valid;

import com.alessio.gestioneCandidatureStage.entity.Employee;
import com.alessio.gestioneCandidatureStage.entity.Figure;

public interface EmployeeService {
	
	Employee findById(int id);
    
    Employee findByUsername(String username);
     
    void saveUser(Employee employee, Figure figure);
     
    void updateUser(Employee employee, Figure figure);
     
    void deleteUserByUsername(String username);
 
    List<Employee> findAllUsers();

	void updateUserPermissions(Employee employee); 
     
    // boolean isUserSSOUnique(Integer id, String username);
	
	

}
