package com.alessio.gestioneCandidatureStage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Entity
//@Table (name= "candidate")
public class Candidate {
	
	/*
	
	@Id
	@Column( name ="fiscal_code")
	private String fiscalCode;
	@Column( name ="reference_manager")
	private String referenceManager;
	@Column( name ="application_status")
	private String applicationStatus;
	
	 @OneToOne
	 @MapsId
	 @JoinColumn(name = "fiscal_code")
	 private Figure figure2;
	 
	 public Candidate() {
		 
	 }

	public Candidate(String referenceManager, String applicationStatus) {
		this.referenceManager = referenceManager;
		this.applicationStatus = applicationStatus;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public String getReferenceManager() {
		return referenceManager;
	}

	public void setReferenceManager(String referenceManager) {
		this.referenceManager = referenceManager;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public Figure getFigure2() {
		return figure2;
	}

	public void setFigure2(Figure figure2) {
		this.figure2 = figure2;
	}
	 
	 */
	 
}
