package com.retooling.chickentestbackend.services;

import jakarta.transaction.Transactional;
import com.retooling.chickentestbackend.model.*;

public class ChickenService {
	
	@Transactional
	public Chicken createChicken(double sell_price, int age) {
		return new Chicken(sell_price, age);
	}

}
