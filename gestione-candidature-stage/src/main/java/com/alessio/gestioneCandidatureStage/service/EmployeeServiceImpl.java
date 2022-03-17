package com.alessio.gestioneCandidatureStage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alessio.gestioneCandidatureStage.DAO.EmployeeDao;
import com.alessio.gestioneCandidatureStage.entity.Employee;
import com.alessio.gestioneCandidatureStage.entity.Figure;

@Service("userService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
    public EmployeeDao dao;
 
    @Autowired
    private PasswordEncoder passwordEncoder;
	
	
	@Override
	public Employee findById(int id) {
		
			return dao.findById(id);
	}

	@Override
	public Employee findByUsername(String username) {
		return dao.findByUsername(username);
	}

	@Override
	public void saveUser(Employee employee, Figure figure) {
		employee.setPassword(passwordEncoder.encode(employee.getPassword()));
		
		System.out.println("saveUser di employeeService");
		System.out.println(employee.getUsername());
        System.out.println(employee.getFigure().getFiscalCode());
        System.out.println(figure.getFiscalCode());
        System.out.println(figure.getFirstName());
        
        
        dao.save(employee, figure);
        
        System.out.println("saveUser di employeService dopo le due classi dao");
        System.out.println(employee.getUsername());
        System.out.println(employee.getFigure().getFiscalCode());
        System.out.println(figure.getFiscalCode());
        System.out.println(figure.getFirstName());
	}

	@Override
	public void updateUser(Employee employee, Figure figure) {
		
		
		
		
		Employee entity = dao.findById(employee.getId());
        if(entity!=null){
            entity.setUsername(employee.getUsername());
            if(!employee.getPassword().equals(entity.getPassword())){
                entity.setPassword(passwordEncoder.encode(employee.getPassword()));
            }
            
           // entity.getFigure().setFiscalCode(employee.getFigure().getFiscalCode());
            entity.getFigure().setFirstName(figure.getFirstName());
           // entity.setFigure(employee.getFigure());
            entity.setRoles(employee.getRoles());
        }
		
	}

	@Override
	public void deleteUserByUsername(String username) {
		dao.deleteByUsername(username);
		
	}

	@Override
	public List<Employee> findAllUsers() {
		return dao.findAllUsers();
	}

	@Override
	public void updateUserPermissions(Employee employee) {
		System.out.println(employee.getId() + " " + employee.getUsername());
		Employee entity = dao.findById(employee.getId());
		
		//if(entity!=null){
        //    entity.setUsername(employee.getUsername());
        //    if(!employee.getPassword().equals(entity.getPassword())){
        //        entity.setPassword(passwordEncoder.encode(employee.getPassword()));
       //     }
		entity.setEnabled(employee.isEnabled());
	//}
	}
	
	//public boolean isUserSSOUnique(Integer id, String sso) {
    //    User user = findBySSO(sso);
    //    return ( user == null || ((id != null) && (user.getId() == id)));
    //}

}
