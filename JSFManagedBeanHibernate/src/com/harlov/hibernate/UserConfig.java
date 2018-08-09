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
@Table(name = "SVV_USER_CONFIG")
public class UserConfig {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "FILTER_COCKPIT_ENABLED")
	private int filterCockpitEnabled;
	
	@Column(name = "GROUP_COCKPIT_ENABLED")
	private int groupCockpitEnabled;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFilterCockpitEnabled() {
		return filterCockpitEnabled;
	}

	public int getGroupCockpitEnabled() {
		return groupCockpitEnabled;
	}

	public User getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "UserConfig [id=" + id + ", userId=" + user.getId() + ", name=" + name + ", filterCockpitEnabled="
				+ filterCockpitEnabled + ", groupCockpitEnabled=" + groupCockpitEnabled + "]";
	}
}
