package com.vaibhav.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class batchSummary {
	Integer summaryId;
	String batchName;
	Integer failureTrigrCnt;
	Integer successTrigrCnt;
	Integer totalTrigrProcessed;
	
	

}
