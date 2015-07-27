package com.jheng.app.web.entity;
// Generated 2015-7-27 23:04:23 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.jheng.app.foundation.entity.BaseEntity;

/**
 * Sheettype generated by hbm2java
 */
@Entity
@Table(name = "sheettype", catalog = "mylevel")
public class Sheettype extends BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1334049566834654550L;
	private String typeName;
	private BigDecimal price;
	private Set<Sheet> sheets = new HashSet<Sheet>(0);


	@Column(name = "typeName", length = 50)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Column(name = "price", precision = 11)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sheettype")
	public Set<Sheet> getSheets() {
		return this.sheets;
	}

	public void setSheets(Set<Sheet> sheets) {
		this.sheets = sheets;
	}

}