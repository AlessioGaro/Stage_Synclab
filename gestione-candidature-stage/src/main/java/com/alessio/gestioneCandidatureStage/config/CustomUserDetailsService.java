package com.alessio.gestioneCandidatureStage.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alessio.gestioneCandidatureStage.entity.Employee;
import com.alessio.gestioneCandidatureStage.entity.Role;
import com.alessio.gestioneCandidatureStage.service.EmployeeService;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	
	 @Autowired
	 private EmployeeService employeeService;
	
	 @Transactional(readOnly=true)
	    public UserDetails loadUserByUsername(String username)
	            throws UsernameNotFoundException {
	        Employee employee = employeeService.findByUsername(username);
	       
	        if(employee==null){
	           throw new UsernameNotFoundException("Username not found");
	        }
	            return new org.springframework.security.core.userdetails.User(employee.getUsername(), employee.getPassword(), 
	                 employee.isEnabled(), true, true, true, getGrantedAuthorities(employee));
	    }
	 
	 private List<GrantedAuthority> getGrantedAuthorities(Employee employee){
	        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	         
	        for(Role role : employee.getRoles()){
	           
	            authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getName()));
	        }
	        return authorities;
	    }

}
