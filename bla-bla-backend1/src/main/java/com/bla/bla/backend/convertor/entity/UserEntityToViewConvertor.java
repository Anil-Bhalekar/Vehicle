package com.bla.bla.backend.convertor.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bla.bla.backend.entity.City;
import com.bla.bla.backend.entity.Feedback;
import com.bla.bla.backend.entity.PublishRide;
import com.bla.bla.backend.entity.User;
import com.bla.bla.backend.resp.view.CityResponseView;
import com.bla.bla.backend.resp.view.UserResponseView;

@Component
public class UserEntityToViewConvertor {

	public UserResponseView findOneConvertor(User user) {
		UserResponseView destination = new UserResponseView();
		destination.setId(user.getId());
		destination.setFirstName(user.getFirstName());
		destination.setLastName(user.getLastName());
		destination.setEmail(user.getEmail());
		destination.setMobileNumber(user.getMobileNumber());
		destination.setBio(user.getBio());
		destination.setDob(user.getDob());
		destination.setHouseNo(user.getHouseNo());
		destination.setGender(user.getGender());

		CityResponseView cityResponseView = new CityResponseView();
		cityResponseView.setId(user.getCity().getId());
		cityResponseView.setName(user.getCity().getName());
		cityResponseView.setCreatedDate(user.getCity().getCreatedDate());
		cityResponseView.setUpdatedDate(user.getCity().getUpdatedDate());
		cityResponseView.setIsDeleted(user.getCity().getIsDeleted());
		cityResponseView.setStateId(user.getCity().getState().getId());
		cityResponseView.setStateName(user.getCity().getState().getName());

		destination.setCity(cityResponseView);

		destination.setCreatedDate(user.getCreatedDate());
		destination.setUpdatedDate(user.getUpdatedDate());
		destination.setIsDeleted(user.getIsDeleted());

		return destination;
	}

}
