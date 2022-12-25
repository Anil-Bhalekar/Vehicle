package com.bla.bla.backend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-19T10:13:40.250+0530")
@StaticMetamodel(BookingPassengerDetail.class)
public class BookingPassengerDetail_ {
	public static volatile SingularAttribute<BookingPassengerDetail, Integer> id;
	public static volatile SingularAttribute<BookingPassengerDetail, Integer> age;
	public static volatile SingularAttribute<BookingPassengerDetail, Date> createdDate;
	public static volatile SingularAttribute<BookingPassengerDetail, String> gender;
	public static volatile SingularAttribute<BookingPassengerDetail, String> identityProofNo;
	public static volatile SingularAttribute<BookingPassengerDetail, String> identityProofPhotoPath;
	public static volatile SingularAttribute<BookingPassengerDetail, Integer> isDeleted;
	public static volatile SingularAttribute<BookingPassengerDetail, String> passengerName;
	public static volatile SingularAttribute<BookingPassengerDetail, Date> updatedDate;
	public static volatile SingularAttribute<BookingPassengerDetail, IdentityProofType> identityProofType;
	public static volatile SingularAttribute<BookingPassengerDetail, RideDetail> rideDetail;
}
