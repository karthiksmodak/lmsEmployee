package com.lmsEmployee.entity;

import javax.persistence.*;
//import jakarta.persistence.*;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "emp_name", nullable = false, length = 50)
	private String name;
	@Column(name = "emp_email", nullable = false, length = 50,unique = true)
	private String email;
	@Column(name = "emp_mobile", nullable = false, length = 50,unique=true)
	private String mobile;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}