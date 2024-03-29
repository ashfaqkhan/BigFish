package com.tcs.bigfish.hibernate;

// Generated 24/10/2013 2:22:29 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Deployrequestitemmap generated by hbm2java
 */
@Entity
@Table(name = "deployrequestitemmap", catalog = "bigfish")
public class Deployrequestitemmap implements java.io.Serializable {

	private DeployrequestitemmapId id;

	public Deployrequestitemmap() {
	}

	public Deployrequestitemmap(DeployrequestitemmapId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "deployItemTypId", column = @Column(name = "deployItemTypId", nullable = false)),
			@AttributeOverride(name = "deployRequestId", column = @Column(name = "deployRequestId", nullable = false, length = 50)) })
	public DeployrequestitemmapId getId() {
		return this.id;
	}

	public void setId(DeployrequestitemmapId id) {
		this.id = id;
	}

}
