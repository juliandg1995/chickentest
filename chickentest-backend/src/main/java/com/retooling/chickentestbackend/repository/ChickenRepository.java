package com.retooling.chickentestbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

import com.retooling.chickentestbackend.model.*;

public interface ChickenRepository extends CrudRepository<Chicken, Integer>{

}
