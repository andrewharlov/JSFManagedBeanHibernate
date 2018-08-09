package com.harlov.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SVV_TZONE")
public class TimeZone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TZ_ID")
	private int id;
	
	@Column(name = "UTC_OFFSET")
	private int utcOffset;
	
	@Column(name = "UTC_DST_OFFSET")
	private int utcDstOffset;
	
	@Column(name = "TZ_NAME")
	private String name;

	public int getId() {
		return id;
	}

	public int getUtcOffset() {
		return utcOffset;
	}

	public int getUtcDstOffset() {
		return utcDstOffset;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "TimeZone [id=" + id + ", utcOffset=" + utcOffset + ", utcDstOffset=" + utcDstOffset + ", name=" + name
				+ "]";
	}

	
	
}
