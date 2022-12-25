package com.bla.bla.backend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bla.bla.backend.convertor.entity.UserEntityToViewConvertor;
import com.bla.bla.backend.convertor.view.UserViewToEntityConvertor;
import com.bla.bla.backend.entity.User;
import com.bla.bla.backend.repo.UserRepo;
import com.bla.bla.backend.req.view.UserRequstView;
import com.bla.bla.backend.resp.view.UserResponseView;
import com.bla.bla.backend.util.DateHelper;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private UserEntityToViewConvertor userEntityToViewConvertor;

	@Autowired
	private UserViewToEntityConvertor userViewToEntityConvertor;

	public UserResponseView save(UserRequstView userRequstView) throws Exception {

		User user = userViewToEntityConvertor.saveConvertor(userRequstView);
		System.out.println("user isDeleted: " + user.getIsDeleted());

		User savedUser = userRepo.save(user);
		System.out.println("savedUser isDeleted: " + savedUser.getIsDeleted());

		return userEntityToViewConvertor.findOneConvertor(savedUser);

	}

	public UserResponseView findById(Integer id) throws Exception {
		System.out.println("Id: " + id);

		User user = userRepo.findOne(id);
		if (user == null) {
			System.out.println("User not found");
			throw new Exception("User not found");
		}

		return userEntityToViewConvertor.findOneConvertor(user);

	}

	public long deleteById(Integer id) throws Exception {
		User user = userRepo.findOne(id);
		if (user == null) {
			System.out.println("User not found");
			throw new Exception("User not found");
		}
		
		
		if(user.getIsDeleted() == 1) {
			System.out.println("User already deleted");
			throw new Exception("User already deleted");

		}

		user.setIsDeleted(1);
		user.setUpdatedDate(DateHelper.getCUrrentDate());

		User updatedUser = userRepo.save(user);
		
		// email
		// sms send
		// notification
		
		return 1;
	}
	
	
	
	
	public long deleteById(List<Integer> ids) throws Exception {
		
		for (Integer id : ids) {
			User user = userRepo.findOne(id);
			if (user == null) {
				System.out.println("User not found");
				throw new Exception("User not found");
			}
			
			
			if(user.getIsDeleted() == 1) {
				System.out.println("User already deleted");
				throw new Exception("User already deleted");

			}

			user.setIsDeleted(1);
			user.setUpdatedDate(DateHelper.getCUrrentDate());

			User updatedUser = userRepo.save(user);
			
			// email
			// sms send
			// notification
			
		}
		
		return 2;
		
		
	}
	
	

	public long deleteById2(Integer id) throws Exception {
		return userRepo.markAsDeleted(id);
	}

//	public long deleteById1(Integer id) throws Exception {
//		userRepo.delete(id);
//		return 1;
//	}

}
