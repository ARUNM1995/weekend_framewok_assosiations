package com.am.association.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "STATE")
public class State implements Serializable{
	@Id
	@GenericGenerator(name = "s_id", strategy = "increment")
	@GeneratedValue(generator = "s_id")
	private Long id;
	private String name;
	private Long population;
	private String area;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id")
	private ChiefMinister chiefMinister;
	
	public State() {
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

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public ChiefMinister getChiefMinister() {
		return chiefMinister;
	}

	public void setChiefMinister(ChiefMinister chiefMinister) {
		this.chiefMinister = chiefMinister;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", population=" + population + ", area=" + area
				+ ", chiefMinister=" + chiefMinister + "]";
	}
	
	
}
