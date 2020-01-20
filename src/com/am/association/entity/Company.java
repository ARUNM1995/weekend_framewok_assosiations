package com.am.association.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "company")
public class Company implements Serializable{

	@Id
	@GenericGenerator(name = "c_id", strategy = "increment")
	@GeneratedValue(generator = "c_id")
	private Long id;
	private String name;
	private String url;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "p_id")
	private List<Product> productList;
	
	
	public Company() {
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


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	@Override
	public String toString() {
		return "Comapany [id=" + id + ", name=" + name + ", url=" + url + ", location=" + location + ", productList="
				+ productList + "]";
	}
	
	
	
	


	
}
