package com.retooling.chickentestbackend.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 100)
	private String name;
	@Column(name = "age")
	private int age;
	
	public Animal(String aName, int anAge) {
		this.name = aName; this.age = anAge;
	}
	
	
	public void setName(String aName) {
		name = aName;
	}
	
	public String getName() {
		return name;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int anAge) {
		this.age = anAge;
	}
	
}
