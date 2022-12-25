package com.bla.bla.backend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-19T10:13:40.468+0530")
@StaticMetamodel(PublishRide.class)
public class PublishRide_ {
	public static volatile SingularAttribute<PublishRide, Integer> id;
	public static volatile SingularAttribute<PublishRide, Integer> availableSeat;
	public static volatile SingularAttribute<PublishRide, Date> createdDate;
	public static volatile SingularAttribute<PublishRide, Date> date;
	public static volatile SingularAttribute<PublishRide, String> dropOff;
	public static volatile SingularAttribute<PublishRide, String> insurance;
	public static volatile SingularAttribute<PublishRide, Integer> isDeleted;
	public static volatile SingularAttribute<PublishRide, String> license;
	public static volatile SingularAttribute<PublishRide, Integer> noOfSeat;
	public static volatile SingularAttribute<PublishRide, String> pickUp;
	public static volatile SingularAttribute<PublishRide, Double> pricePerSeat;
	public static volatile SingularAttribute<PublishRide, String> reachTime;
	public static volatile SingularAttribute<PublishRide, String> registrationCardPath;
	public static volatile SingularAttribute<PublishRide, String> time;
	public static volatile SingularAttribute<PublishRide, Date> updatedDate;
	public static volatile SingularAttribute<PublishRide, String> vehicleName;
	public static volatile SingularAttribute<PublishRide, String> vehiclePhoto;
	public static volatile SingularAttribute<PublishRide, String> vehicleRegistrationNo;
	public static volatile ListAttribute<PublishRide, Feedback> feedbacks;
	public static volatile SingularAttribute<PublishRide, User> user;
	public static volatile ListAttribute<PublishRide, RideDetail> rideDetails;
}
