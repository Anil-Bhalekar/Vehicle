package com.bla.bla.backend.convertor.view;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bla.bla.backend.entity.City;
import com.bla.bla.backend.entity.Feedback;
import com.bla.bla.backend.entity.PublishRide;
import com.bla.bla.backend.entity.State;
import com.bla.bla.backend.entity.User;
import com.bla.bla.backend.repo.CityRepo;
import com.bla.bla.backend.repo.StateRepo;
import com.bla.bla.backend.req.view.UserRequstView;
import com.bla.bla.backend.resp.view.CityResponseView;
import com.bla.bla.backend.resp.view.UserResponseView;
import com.bla.bla.backend.util.DateHelper;

@Component
public class UserViewToEntityConvertor {

	@Autowired
	private CityRepo cityRepo;
	
	@Autowired
	private StateRepo stateRepo;

	public User saveConvertor(UserRequstView source) throws Exception {
		User destination = new User();

		destination.setFirstName(source.getFirstName());
		destination.setLastName(source.getLastName());
		destination.setEmail(source.getEmail());
		destination.setMobileNumber(source.getMobileNumber());
		destination.setBio(source.getBio());
		destination.setDob(source.getDob());
		destination.setHouseNo(source.getHouseNo());
		destination.setGender(source.getGender());
		destination.setCreatedDate(DateHelper.getCUrrentDate());
		
		destination.setPassword(source.getPassword());
		
		
		
		System.out.println("Fetching city by city Id: " + source.getCityId());
		City city = cityRepo.findOne(source.getCityId());
		if(city == null) {
			System.out.println("City not found");
			throw new Exception("City not found");
		}
		System.out.println("Fetched city city name: " + city.getName());
		
		
		System.out.println("Fetching state by state Id: " + source.getStateId());
		State state = stateRepo.findOne(source.getStateId());
		if(state == null) {
			System.out.println("State not found");
			throw new Exception("State not found");
		}
		System.out.println("Fetched state state name: " + state.getName());
		

		destination.setCity(city);
		destination.setState(state);

		return destination;
	}

}
