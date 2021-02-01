package com.vaibhav.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class coPdfs {
	Integer coPdfId;
	String planStatus;
	String caseNum;
	String pdfDoc;
	String planName;

}
