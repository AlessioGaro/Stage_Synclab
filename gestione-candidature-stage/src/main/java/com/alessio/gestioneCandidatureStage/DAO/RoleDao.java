package com.alessio.gestioneCandidatureStage.DAO;

import java.util.List;

import com.alessio.gestioneCandidatureStage.entity.Role;

public interface RoleDao {
	
	List<Role> findAll();
    
    Role findByType(String name);
     
    Role findById(int id);
}
