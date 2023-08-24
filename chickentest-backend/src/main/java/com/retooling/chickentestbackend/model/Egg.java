package com.retooling.chickentestbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "eggs")
public class Egg extends Product {
	
	@Column(name="days_to_eclode")
	private static int daysToEclode = 10;

	@Column(name="countdown")
	private int chickenCountdown;
	
	@Column(name="isHatched")
	private boolean isHatched;
	
	@Column(name="farmOwner")
	private Farm farmOwner;
	
	@Column(name="ageInDays")
	private int ageInDays;

	
	public Egg(float sellPrice, int parentId) {
		super(sellPrice);
		this.chickenCountdown= daysToEclode;
		isHatched = false;
		ageInDays = 0;
	}

	public int getDaysToEclode() {
		return daysToEclode;
	}
	
	public int getAgeInDays() {
		return this.ageInDays;
	}

	public void hatch() {
		this.isHatched = true;
	}
	
	public boolean isHatched() {
		return this.isHatched;
	}

	@Override
	public void passADay() {
		this.ageInDays++;
		if (isHatched) {
			this.chickenCountdown-- ;
			if (chickenCountdown == 0) {
				this.eclode();
			}
		}
	}
	
	@Override
	public boolean isDiscountMaterial() {
		if (isHatched || this.getAgeInDays() < 15) {
			return false;
		}
		return true;
	}
	
	@Override
	public void setDiscount() {
		this.setSellPrice(getSellPrice() * 0.5);
	}
	
	// Este metodo lo llama la granja
	private void eclode() {
		farmOwner.eggToChicken(this);
	}
	

}
