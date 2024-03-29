package com.tcs.bigfish.hibernate;

// Generated 24/10/2013 2:22:29 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Defectentry generated by hbm2java
 */
@Entity
@Table(name = "defectentry", catalog = "bigfish")
public class Defectentry implements java.io.Serializable {

	private int defectId;
	private String description;
	private int severityId;
	private Integer resolutionId;
	private int typeId;
	private String assignedTo;
	private String closedBy;
	private Integer verifiedBy;
	private Date verifiedDate;
	private Date closedDate;
	private String serviceRequestId;
	private String changeId;

	public Defectentry() {
	}

	public Defectentry(int defectId, String description, int severityId,
			int typeId, String assignedTo, String closedBy,
			String serviceRequestId, String changeId) {
		this.defectId = defectId;
		this.description = description;
		this.severityId = severityId;
		this.typeId = typeId;
		this.assignedTo = assignedTo;
		this.closedBy = closedBy;
		this.serviceRequestId = serviceRequestId;
		this.changeId = changeId;
	}

	public Defectentry(int defectId, String description, int severityId,
			Integer resolutionId, int typeId, String assignedTo,
			String closedBy, Integer verifiedBy, Date verifiedDate,
			Date closedDate, String serviceRequestId, String changeId) {
		this.defectId = defectId;
		this.description = description;
		this.severityId = severityId;
		this.resolutionId = resolutionId;
		this.typeId = typeId;
		this.assignedTo = assignedTo;
		this.closedBy = closedBy;
		this.verifiedBy = verifiedBy;
		this.verifiedDate = verifiedDate;
		this.closedDate = closedDate;
		this.serviceRequestId = serviceRequestId;
		this.changeId = changeId;
	}

	@Id
	@Column(name = "defectId", unique = true, nullable = false)
	public int getDefectId() {
		return this.defectId;
	}

	public void setDefectId(int defectId) {
		this.defectId = defectId;
	}

	@Column(name = "description", nullable = false, length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "severityId", nullable = false)
	public int getSeverityId() {
		return this.severityId;
	}

	public void setSeverityId(int severityId) {
		this.severityId = severityId;
	}

	@Column(name = "resolutionId")
	public Integer getResolutionId() {
		return this.resolutionId;
	}

	public void setResolutionId(Integer resolutionId) {
		this.resolutionId = resolutionId;
	}

	@Column(name = "typeId", nullable = false)
	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	@Column(name = "assignedTo", nullable = false, length = 50)
	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	@Column(name = "closedBy", nullable = false, length = 50)
	public String getClosedBy() {
		return this.closedBy;
	}

	public void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}

	@Column(name = "verifiedBy")
	public Integer getVerifiedBy() {
		return this.verifiedBy;
	}

	public void setVerifiedBy(Integer verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "verifiedDate", length = 10)
	public Date getVerifiedDate() {
		return this.verifiedDate;
	}

	public void setVerifiedDate(Date verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "closedDate", length = 10)
	public Date getClosedDate() {
		return this.closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	@Column(name = "serviceRequestId", nullable = false, length = 50)
	public String getServiceRequestId() {
		return this.serviceRequestId;
	}

	public void setServiceRequestId(String serviceRequestId) {
		this.serviceRequestId = serviceRequestId;
	}

	@Column(name = "changeId", nullable = false, length = 50)
	public String getChangeId() {
		return this.changeId;
	}

	public void setChangeId(String changeId) {
		this.changeId = changeId;
	}

}
