package com.tcs.bigfish.hibernate;

// Generated 24/10/2013 2:22:29 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Deploystage generated by hbm2java
 */
@Entity
@Table(name = "deploystage", catalog = "bigfish")
public class Deploystage implements java.io.Serializable {

	private int deployStageId;
	private String stageName;

	public Deploystage() {
	}

	public Deploystage(int deployStageId, String stageName) {
		this.deployStageId = deployStageId;
		this.stageName = stageName;
	}

	@Id
	@Column(name = "deployStageId", unique = true, nullable = false)
	public int getDeployStageId() {
		return this.deployStageId;
	}

	public void setDeployStageId(int deployStageId) {
		this.deployStageId = deployStageId;
	}

	@Column(name = "stageName", nullable = false, length = 100)
	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

}