package com.alessio.gestioneCandidatureStage.service;

import java.util.List;

import com.alessio.gestioneCandidatureStage.entity.Role;

public interface RoleService {
	
	Role findById(int id);
	 
    Role findByName(String type);
     
    List<Role> findAll();

}
