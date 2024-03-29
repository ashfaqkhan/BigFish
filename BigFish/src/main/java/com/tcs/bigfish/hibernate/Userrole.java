package com.tcs.bigfish.hibernate;

// Generated 24/10/2013 2:22:29 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Userrole generated by hbm2java
 */
@Entity
@Table(name = "userrole", catalog = "bigfish")
public class Userrole implements java.io.Serializable {

	private int roleId;
	private Bigfishuser bigfishuser;
	private String roleName;

	public Userrole() {
	}

	public Userrole(int roleId, Bigfishuser bigfishuser, String roleName) {
		this.roleId = roleId;
		this.bigfishuser = bigfishuser;
		this.roleName = roleName;
	}

	@Id
	@Column(name = "RoleId", unique = true, nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	public Bigfishuser getBigfishuser() {
		return this.bigfishuser;
	}

	public void setBigfishuser(Bigfishuser bigfishuser) {
		this.bigfishuser = bigfishuser;
	}

	@Column(name = "RoleName", nullable = false, length = 100)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
