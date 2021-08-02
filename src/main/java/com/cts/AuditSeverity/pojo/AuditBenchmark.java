package com.cts.AuditSeverity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 *AuditBenchMark POJO Class
 *
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuditBenchmark {
	
	/**
	 * Stores Type of Audit
	 */
	private String auditType;
	/**
	 * Stores the number of NO answers	
	 */
	private int accNoAnswers;

	
}

