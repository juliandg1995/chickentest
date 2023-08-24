package com.retooling.chickentestbackend.model;

import java.util.*;
import javax.persistence.*;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="farm")
public class Farm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Egg> eggs;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Chicken> chickens;
	
	@Column(name="money")
	private double money;
	
	@Column(name="maxChickenStock")
	private static int maxChickenStock = 500;
	
	@Column(name="maxEggStock")
	private static int maxEggStock = 50000;
	
	
	public Farm(String name, double money) {
		super();
		this.name = name;
		this.money = money;
		chickens = new ArrayList<Chicken>();
		eggs = new ArrayList<Egg>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String aName) {
		name = aName;
	}
	
	public double getMoney(){
		return money;
	}
	
	public static int getMaxStockOfChickens() {
		return maxChickenStock;
	}
	
	public static int getMaxStockOfEggs() {
		return maxEggStock;
	}
	
	public void passADay(){
		
	}
	
	public void eggToChicken(Egg anEgg) {
		
	}
	
	
	
	
	
	

	
	
	

}
