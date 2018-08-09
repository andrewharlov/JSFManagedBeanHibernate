package com.harlov.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "SVV_ROLES")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "ROLE_NAME")
	private String roleName;
	
	@Column(name = "DESCRIPTION")
	private String description;

	public int getId() {
		return id;
	}

	public String getRoleName() {
		return roleName;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Role [Id=" + id + ", roleName=" + roleName + ", description=" + description + "]";
	}
	
	
}
