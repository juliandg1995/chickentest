package com.retooling.chickentestbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

import com.retooling.chickentestbackend.model.*;

public interface FarmRepository extends CrudRepository<Farm, Integer>{

	public double getMoney();
	
	public int getMaxStock();
	
	public Optional<List<Egg>> getEggs();
	
	public Iterable<Egg> getHatchedEggs();
	
	public Optional<List<Chicken>> getChickens();
	
	public boolean addChickens(int amount);
	
	public boolean addEggs(int amount);
	
	public boolean deleteChickens(int amount);
	
	public boolean deleteEggs(int amount);
	
	public void spendMoney(double amount);
	
	public void earnMoney(double amount);
	
	
}
