package com.alessio.gestioneCandidatureStage.entity;

import java.io.Serializable;

public enum UserRole implements Serializable {
	
	HR("HR"),
    MANAGER("MANAGER"),
    ADMIN("ADMIN");
	
	String userRole;
	
	 private UserRole(String userRole){
	        this.userRole = userRole;
	    }
	     
	    public String getUserRole(){
	        return userRole;
	    }
	     

}
