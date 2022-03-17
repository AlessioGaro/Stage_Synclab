package com.alessio.gestioneCandidatureStage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alessio.gestioneCandidatureStage.DAO.RoleDao;
import com.alessio.gestioneCandidatureStage.entity.Role;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
    RoleDao dao;
	
	
	
	@Override
	public Role findById(int id) {
		return dao.findById(id);
		
	}

	@Override
	public Role findByName(String name) {
		return dao.findByType(name);
	}

	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}

}
