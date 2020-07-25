package com.ams.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * Entity Class for Attendance Table
 * 
 * 
 * @author ABHISHEK
 *
 */
@Entity
@Table(name = "ATTENDANCE")
public class Attendance {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@Column(name = "EMP_ID")
	private Long empId;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "DATE")
	private Date date;

	@Column(name = "IN_TIME")
	private Date inTime;

	@Column(name = "OUT_TIME")
	private Date outTime;

	@Column(name = "LATITUDE")
	private Double latitude;

	@Column(name = "LONGITUDE")
	private Double longitude;

	@Column(name = "MANGR_ID")
	private Long managerId;

	@Column(name = "APPROVED_BY")
	private String approvedBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @return the empId
	 */
	public Long getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the inTime
	 */
	public Date getInTime() {
		return inTime;
	}

	/**
	 * @param inTime the inTime to set
	 */
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	/**
	 * @return the outTime
	 */
	public Date getOutTime() {
		return outTime;
	}

	/**
	 * @param outTime the outTime to set
	 */
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the managerId
	 */
	public Long getManagerId() {
		return managerId;
	}

	/**
	 * @param managerId the managerId to set
	 */
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	/**
	 * @return the approvedBy
	 */
	public String getApprovedBy() {
		return approvedBy;
	}

	/**
	 * @param approvedBy the approvedBy to set
	 */
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
