package com.am.association.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TEAM")
public class Team implements Serializable{

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SIZE")
	private Long size;
	
	@OneToOne(cascade =CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "C_ID")
	private Captain captain;
	
	public Team() {
		// TODO Auto-generated constructor stub
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
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public Captain getCaptain() {
		return captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", size=" + size + ", captain=" + captain + "]";
	}
	
	
	
}
