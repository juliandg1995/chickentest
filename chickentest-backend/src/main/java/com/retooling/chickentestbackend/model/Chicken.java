package com.retooling.chickentestbackend.model;

import javax.persistence.*;

@Entity
public class Chicken extends Product {
	
    @Column
	private String name;
    
    @Column
    private int parent_id;
    
    @Column
    private int days_to_put_eggs;
    
    @Column
    private int age;

	/** Constructor **/
	public Chicken(float sell_price, int parent_id, int days_to_put_eggs, int age) {
		super(sell_price);
		this.parent_id = parent_id;
		this.days_to_put_eggs = days_to_put_eggs;
		this.age = age;
	}
	
	/** Getters - Setters **/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentId() {
		return parent_id;
	}

	public int getDaysToPutEggs() {
		return days_to_put_eggs;
	}

	public void setDaysToPutEggs(int days_to_put_eggs) {
		this.days_to_put_eggs = days_to_put_eggs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void passADay() {
		
	}


	
    

}
