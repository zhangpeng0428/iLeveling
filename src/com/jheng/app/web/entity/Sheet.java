package com.jheng.app.web.entity;
// Generated 2015-7-27 23:04:23 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.jheng.app.foundation.entity.BaseEntity;

/**
 * Sheet generated by hbm2java
 */
@Entity
@Table(name = "sheet", catalog = "mylevel")
public class Sheet extends BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = 4518579092402093200L;
	private Member memberByTrainerId;
	private Member memberByMemberId;
	private Sheettype sheettype;

	private String sheetNumber;
	private Integer sheetStatus;
	private Date startTime;
	private String endTime;
	private String description;
	private BigDecimal memberPayment;



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trainerId")
	public Member getMemberByTrainerId() {
		return this.memberByTrainerId;
	}

	public void setMemberByTrainerId(Member memberByTrainerId) {
		this.memberByTrainerId = memberByTrainerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memberId")
	public Member getMemberByMemberId() {
		return this.memberByMemberId;
	}

	public void setMemberByMemberId(Member memberByMemberId) {
		this.memberByMemberId = memberByMemberId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeId")
	public Sheettype getSheettype() {
		return this.sheettype;
	}

	public void setSheettype(Sheettype sheettype) {
		this.sheettype = sheettype;
	}

	@Column(name = "sheetNumber")
	public String getSheetNumber() {
		return this.sheetNumber;
	}

	public void setSheetNumber(String sheetNumber) {
		this.sheetNumber = sheetNumber;
	}

	@Column(name = "sheetStatus")
	public Integer getSheetStatus() {
		return this.sheetStatus;
	}

	public void setSheetStatus(Integer sheetStatus) {
		this.sheetStatus = sheetStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startTime", length = 19)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Column(name = "endTime")
	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "memberPayment", precision = 11)
	public BigDecimal getMemberPayment() {
		return this.memberPayment;
	}

	public void setMemberPayment(BigDecimal memberPayment) {
		this.memberPayment = memberPayment;
	}

}
