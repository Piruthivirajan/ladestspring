package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String event;
	
	@Column
	private String clgname;
	
	public String getClgname() {
		return clgname;
	}

	public void setClgname(String clgname) {
		this.clgname = clgname;
	}

	@Column
	private String pname1;

	@Column
	private Long contact1;
	
	@Column
	private String dept1;
	
	@Column
	private String email1;
	
	@Column
	private String pname2;

	@Column
	private Long contact2;
	
	@Column
	private String dept2;
	
	@Column
	private String email2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getPname1() {
		return pname1;
	}

	public void setPname1(String pname1) {
		this.pname1 = pname1;
	}


	public String getDept1() {
		return dept1;
	}

	public void setDept1(String dept1) {
		this.dept1 = dept1;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getPname2() {
		return pname2;
	}

	public void setPname2(String pname2) {
		this.pname2 = pname2;
	}

	public String getDept2() {
		return dept2;
	}

	public Long getContact1() {
		return contact1;
	}

	public void setContact1(Long contact1) {
		this.contact1 = contact1;
	}

	public Long getContact2() {
		return contact2;
	}

	public void setContact2(Long contact2) {
		this.contact2 = contact2;
	}

	public void setDept2(String dept2) {
		this.dept2 = dept2;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	
}
