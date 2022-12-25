package com.bla.bla.backend.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bla.bla.backend.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	
	@Query("select e from User e where e.isDeleted = 0 and e.id=:id")
	User findOne(@Param("id") Integer id);
	
	
	@Transactional
	@Modifying
	@Query("update User e set e.isDeleted = 1, e.updatedDate = now() where e.id=:id")
	int markAsDeleted(@Param("id") Integer id);
	
}
