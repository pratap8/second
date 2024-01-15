package com.springboot.AndFrontend.SBwithFrontEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fileprog {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String phone;
	private String firstname;
	private String lastname;
	private String passc;
	
	public Fileprog(String phone, String firstname, String lastname, String passc) {
		super();
		this.phone = phone;
		this.firstname = firstname;
		this.lastname = lastname;
		this.passc = passc;
	}

	public Fileprog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassc() {
		return passc;
	}

	public void setPassc(String passc) {
		this.passc = passc;
	}
	


}
