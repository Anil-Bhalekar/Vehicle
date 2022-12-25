package com.bla.bla.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bla.bla.backend.entity.State;

public interface StateRepo extends JpaRepository<State, Integer> {
	
	@Query("select e from State e where e.isDeleted = 0 and e.id=:id")
	State findOne(@Param("id") Integer id);

}
