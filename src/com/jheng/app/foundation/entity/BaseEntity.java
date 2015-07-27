package com.jheng.app.foundation.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.jheng.app.common.annotation.ProtectForm;

@MappedSuperclass
public class BaseEntity implements Serializable
{
	private static final long serialVersionUID = -8462075855709437984L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;
	private Date addTime;
	@ProtectForm
	private boolean deleteStatus;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Date getAddTime()
	{
		return addTime;
	}

	public void setAddTime(Date addTime)
	{
		this.addTime = addTime;
	}

	public boolean isDeleteStatus()
	{
		return deleteStatus;
	}

	public void setDeleteStatus(boolean deleteStatus)
	{
		this.deleteStatus = deleteStatus;
	}
}
