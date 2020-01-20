package com.am.association.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "CHIEF_MINISTER")
public class ChiefMinister implements Serializable{

	@Id
	@GenericGenerator(name = "c_id", strategy = "increment")
	@GeneratedValue(generator = "c_id")
	private Long id;
	private String name;
	private Long contact;
	private Long age;
	private String address;
	
	public ChiefMinister() {
		// TODO Auto-generated constructor stub
	}

	
	public ChiefMinister( String name, Long contact, Long age, String address) {
		super();
		
		this.name = name;
		this.contact = contact;
		this.age = age;
		this.address = address;
	}


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

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
