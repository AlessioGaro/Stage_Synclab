package com.alessio.gestioneCandidatureStage.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.alessio.gestioneCandidatureStage.entity.Role;

@Repository("roleDao")
public class RoleDaoImpl extends AbstractDao<Integer, Role>implements RoleDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findAll() {
		Criteria crit = createEntityCriteria();
        crit.addOrder(Order.asc("name"));
        return (List<Role>)crit.list();
	}

	@Override
	public Role findByType(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (Role) crit.uniqueResult();
	}

	@Override
	public Role findById(int id) {
		return getByKey(id);
	}
	
	
	

}
