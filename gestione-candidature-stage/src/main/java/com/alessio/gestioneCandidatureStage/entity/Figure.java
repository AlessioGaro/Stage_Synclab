package com.alessio.gestioneCandidatureStage.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table (name= "figure")
public class Figure {
	
	@Id
	@Column(name="fiscal_code")
	private String fiscalCode;
	
	
	@Column(name="first_name")
	private String firstName;
	
	//@OneToOne(mappedBy = "figure")
    //private Employee employee;
	
	public Figure() {
	
	}

	public String getFiscalCode() {
		return fiscalCode;
	}


	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	

	
	


	
	
	
	
	

}
