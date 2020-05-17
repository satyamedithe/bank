package com.springbootbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_INFORMATION")
public class CustomerEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name",  length = 128, nullable = false)
	private String firstname;
		
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private long phone;
	
	@Column(name="socialsecurity")
	private long socialsecurity;

	public long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddress() {
		return address;
	}

	public long getPhone() {
		return phone;
	}

	public long getSocialsecurity() {
		return socialsecurity;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setSocialsecurity(long socialsecurity) {
		this.socialsecurity = socialsecurity;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + ", phone=" + phone + ", socialsecurity=" + socialsecurity + "]";
	}

}
