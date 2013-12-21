package com.tcs.bigfish.hibernate;

// Generated 24/10/2013 2:22:29 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Taskstatus generated by hbm2java
 */
@Entity
@Table(name = "taskstatus", catalog = "bigfish")
public class Taskstatus implements java.io.Serializable {

	private int taskStatusId;
	private String taskName;

	public Taskstatus() {
	}

	public Taskstatus(int taskStatusId, String taskName) {
		this.taskStatusId = taskStatusId;
		this.taskName = taskName;
	}

	@Id
	@Column(name = "taskStatusId", unique = true, nullable = false)
	public int getTaskStatusId() {
		return this.taskStatusId;
	}

	public void setTaskStatusId(int taskStatusId) {
		this.taskStatusId = taskStatusId;
	}

	@Column(name = "taskName", nullable = false, length = 100)
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
