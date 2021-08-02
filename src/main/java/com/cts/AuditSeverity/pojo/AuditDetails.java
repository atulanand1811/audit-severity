package com.cts.AuditSeverity.pojo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * 
 AuditDetails POJO Class
 *
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuditDetails {
	/**
	 * Stores type of Audit
	 */
	private String auditType;
	/**
	 * Stores audit date
	 */
	private Date auditDate;
	
	private List<QuestionsEntity> questionsList;
		
}
