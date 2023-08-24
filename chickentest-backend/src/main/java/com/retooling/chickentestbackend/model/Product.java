package com.retooling.chickentestbackend.model;

import javax.persistence.*;

@Entity
public abstract class Product {
	
	@Id
	private int id;
	
    @Column
    private float sell_price;
    
/****** Constructor ******/
	public Product(float sell_price) {
		this.sell_price = sell_price;
	}

/****** Getters / Setters ******/
    
	public int getId() {
		return id;
	}
    
	public float getSell_price() {
		return sell_price;
	}

	public void setSell_price(float sell_price) {
		this.sell_price = sell_price;
	}
	
	public abstract void passADay();

}
