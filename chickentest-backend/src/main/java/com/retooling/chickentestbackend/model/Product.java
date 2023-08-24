package com.retooling.chickentestbackend.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
    @Column(name="sell_price")
    private double sell_price;
    
/****** Constructor ******/
	public Product(double sell_price) {
		this.sell_price = sell_price;
	}

/****** Getters / Setters ******/
    
	public int getId() {
		return id;
	}
    
	public double getSellPrice() {
		return sell_price;
	}

	public void setSellPrice(double sell_price) {
		this.sell_price = sell_price;
	}
	
	public abstract void passADay();
	
	public abstract boolean isDiscountMaterial();
	
	public abstract void setDiscount();

}
