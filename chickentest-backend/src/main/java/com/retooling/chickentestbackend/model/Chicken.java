package com.retooling.chickentestbackend.model;

import javax.persistence.*;

import java.util.*;

@Entity
@Table(name = "chickens")
public class Chicken extends Product {
	
    @Column
	private String name;
    
    @Column
    private int parent_id;
    
    @Column
    private int days_to_eggs_countdown;
    
    @Column
    private static int days_to_put_eggs = 15;
    
    @Column
    private int age;
    
	/** Constructor **/
	public Chicken(double sell_price,  int age) {
		super(sell_price);
		this.days_to_eggs_countdown = days_to_put_eggs;
		this.age = age;
	}
	
	/** Getters - Setters **/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getDaysToPutEggs() {
		return days_to_put_eggs;
	}

	public int getDaysToEggsCountdown() {
		return days_to_eggs_countdown;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void passADay() {
		this.days_to_eggs_countdown++;
	}
	
	public void hatchEggs(List<Egg> eggs) {
		for(Egg egg: eggs) {
			egg.hatch();
		}
	}
	
	@Override
	public boolean isDiscountMaterial() {
		if (age < 4 || getDaysToPutEggs() <= 5) {
			return false;
		}
		return true;
	}
	
	@Override
	public void setDiscount() {
		this.setSellPrice(getSellPrice() * 0.7);
	}

	
    

}
