package com.vaibhav.Entity;

import javax.persistence.Entity;

import lombok.Data;
@Entity
@Data
public class batchRunDtls {
	Integer batchRunSeq;
	String batchName;
	String batchRunStatus;
	String endDate;
	Integer instanceNum;
	String startDate;

}
