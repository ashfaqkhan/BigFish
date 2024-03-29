package com.tcs.bigfish.hibernate;

// Generated 24/10/2013 2:22:29 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Complexity generated by hbm2java
 */
@Entity
@Table(name = "complexity", catalog = "bigfish")
public class Complexity implements java.io.Serializable {

	private int complexityId;
	private String name;

	public Complexity() {
	}

	public Complexity(int complexityId, String name) {
		this.complexityId = complexityId;
		this.name = name;
	}

	@Id
	@Column(name = "complexityId", unique = true, nullable = false)
	public int getComplexityId() {
		return this.complexityId;
	}

	public void setComplexityId(int complexityId) {
		this.complexityId = complexityId;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
