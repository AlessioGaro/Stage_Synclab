package com.alessio.gestioneCandidatureStage.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="employee_id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name ="fiscal_code", referencedColumnName="fiscal_code")
	Figure figure;
	
	@Column(name = "username", unique=true)
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name="enabled")
	private boolean enabled = true;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinTable(name = "user_role", 
	joinColumns = @JoinColumn(name = "employee_id"), 
	inverseJoinColumns = @JoinColumn(name = "id"))
	private Set<Role> roles = new HashSet<Role>();
	 
	 public Employee() {
		 
	 }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Figure getFigure() {
		return figure;
	}

	public void setFigure(Figure figure) {
		this.figure = figure;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false; }
		else if (!id.equals(other.id))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
	}

	

	

	
	 
	 
}
