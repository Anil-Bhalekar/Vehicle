package com.bla.bla.backend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-09T11:27:25.081+0530")
@StaticMetamodel(RideDetail.class)
public class RideDetail_ {
	public static volatile SingularAttribute<RideDetail, Integer> id;
	public static volatile SingularAttribute<RideDetail, Date> createdDate;
	public static volatile SingularAttribute<RideDetail, Integer> isDeleted;
	public static volatile SingularAttribute<RideDetail, Integer> noOfPassenger;
	public static volatile SingularAttribute<RideDetail, Double> totalAmount;
	public static volatile SingularAttribute<RideDetail, String> transactionId;
	public static volatile SingularAttribute<RideDetail, Date> updatedDate;
	public static volatile ListAttribute<RideDetail, BookingPassengerDetail> bookingPassengerDetails;
	public static volatile ListAttribute<RideDetail, Feedback> feedbacks;
	public static volatile SingularAttribute<RideDetail, PaymentType> paymentType;
	public static volatile SingularAttribute<RideDetail, PublishRide> publishRide;
	public static volatile SingularAttribute<RideDetail, User> user;
}
