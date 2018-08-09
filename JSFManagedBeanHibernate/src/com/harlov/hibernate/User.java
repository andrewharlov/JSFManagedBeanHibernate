package com.harlov.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SVV_USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "USERNAME")
	private String name;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "FULL_NAME")
	private String fullName;
	
	@OneToOne
	@JoinColumn(name = "ROLE_ID")
	private Role role;
	
	@Column(name = "MAIN_ASSIGNEE_GROUP_ID")
	private int mainAssigneeGroupId;
	
	@Column(name = "COMPANY")
	private String company;
	
	@OneToOne
	@JoinColumn(name = "TIMEZONE_ID")
	private TimeZone timeZone;
	
	@Column(name = "LOCKED")
	private int locked;
	
	@OneToOne(mappedBy = "user")
	private UserConfig userConfig;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getCountry() {
		return country;
	}

	public String getFullName() {
		return fullName;
	}
	
	public int getMainAssigneeGroupId() {
		return mainAssigneeGroupId;
	}

	public Role getRole() {
		return role;
	}

	public String getCompany() {
		return company;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public int getLocked() {
		return locked;
	}

	public UserConfig getUserConfig() {
		return userConfig;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", country="
				+ country + ", fullName=" + fullName + ", role=" + role + ", mainAssigneeGroupId=" + mainAssigneeGroupId
				+ ", company=" + company + ", timeZone=" + timeZone + ", locked=" + locked + ", userConfig="
				+ userConfig + "]";
	}
	
}
