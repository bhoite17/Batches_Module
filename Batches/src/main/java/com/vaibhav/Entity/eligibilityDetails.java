package com.vaibhav.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class eligibilityDetails {
	String edTraceId;
	Integer benefitAmt;
	Long caseNum;
	String createDt;
	String denialReson;
	String endDt;
	String planeName;
	String planStartDt;
	String planStatus;
	String updateDt;
	

}
