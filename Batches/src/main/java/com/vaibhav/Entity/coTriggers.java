package com.vaibhav.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class coTriggers {
	Integer trgId;
	Long caseNum;
	String createDt;
	String trgStatus;
	String updateDt;
	
	

}
