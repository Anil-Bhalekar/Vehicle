package com.bla.bla.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bla.bla.backend.entity.City;
import com.bla.bla.backend.entity.User;

public interface CityRepo extends JpaRepository<City, Integer>{

	
	@Query("select e from City e where e.isDeleted = 0 and e.id=:id")
	City findOne(@Param("id") Integer id);
	
}
