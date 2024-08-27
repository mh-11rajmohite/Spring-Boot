package com.pack.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Village {

	private Integer id;
	private String name;
	private Integer population;
	
	@Autowired
	private District district;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	
	@Override
	public String toString() {
		return "Village [id=" + id + ", name=" + name + ", population=" + population + ", district=" + district.getName() + "]";
	}
	
}
