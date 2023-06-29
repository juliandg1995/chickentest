package com.retooling.chickentestbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.retooling.chickentestbackend.model.Animal;

@SpringBootApplication
public class ChickentestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChickentestBackendApplication.class, args);
		
		 Animal unAnimal = new Animal("Pollito Pío", 20);
		 System.out.print("Nombre: " + unAnimal.getName());
	}
	

}
