package com.tcs.bigfish.hibernate;

// Generated 24/10/2013 2:22:29 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Deploytype generated by hbm2java
 */
@Entity
@Table(name = "deploytype", catalog = "bigfish")
public class Deploytype implements java.io.Serializable {

	private int deployTypeId;
	private String deployName;

	public Deploytype() {
	}

	public Deploytype(int deployTypeId, String deployName) {
		this.deployTypeId = deployTypeId;
		this.deployName = deployName;
	}

	@Id
	@Column(name = "deployTypeId", unique = true, nullable = false)
	public int getDeployTypeId() {
		return this.deployTypeId;
	}

	public void setDeployTypeId(int deployTypeId) {
		this.deployTypeId = deployTypeId;
	}

	@Column(name = "deployName", nullable = false, length = 100)
	public String getDeployName() {
		return this.deployName;
	}

	public void setDeployName(String deployName) {
		this.deployName = deployName;
	}

}
