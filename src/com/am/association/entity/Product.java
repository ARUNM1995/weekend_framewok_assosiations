package com.am.association.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "product")
public class Product implements Serializable{
	
	@Id
	@GenericGenerator(name = "p_id", strategy = "increment")
	@GeneratedValue(generator = "p_id")
	private Long id;
	private String name;
	private Double price;
	private String type;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String name, Double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
