package com.retooling.chickentestbackend.model;

import javax.persistence.*;

@Entity
public class Egg extends Product {
	
	@Column
	private int parent_id;
	
	@Column
	private int days_to_eclode;

	/**
	 * @param id
	 * @param sell_price
	 * @param parent_id
	 * @param days_to_eclode
	 */
	public Egg(float sell_price, int parent_id, int days_to_eclode) {
		super(sell_price);
		this.parent_id = parent_id;
		this.days_to_eclode = days_to_eclode;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public int getDays_to_eclode() {
		return days_to_eclode;
	}

	@Override
	public void passADay(){
		this.days_to_eclode = days_to_eclode - 1;
		if ( days_to_eclode == 0 ){
			this.eclode(this);
		}
	}
	
	private void eclode(Egg thisEgg) {
		// Acá necesito acceder a la base de datos para buscar el precio y pasarselo al pollo
		// También necesito definir una constante y acceder a ella (archivo application.properties?)
		float value = 25.235f;
		Chicken new_born_chicken = new Chicken(value, thisEgg.getParent_id(), 15, 0);
	}
	
	
	

}
