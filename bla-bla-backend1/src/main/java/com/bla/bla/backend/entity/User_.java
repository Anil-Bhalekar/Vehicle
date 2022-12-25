package com.bla.bla.backend.entity;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-29T12:00:24.658+0530")
@StaticMetamodel(User.class)
public class User_ {
	public static volatile SingularAttribute<User, Integer> id;
	public static volatile SingularAttribute<User, String> bio;
	public static volatile SingularAttribute<User, Date> createdDate;
	public static volatile SingularAttribute<User, Date> dob;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> firstName;
	public static volatile SingularAttribute<User, String> gender;
	public static volatile SingularAttribute<User, String> houseNo;
	public static volatile SingularAttribute<User, Integer> isDeleted;
	public static volatile SingularAttribute<User, String> lastName;
	public static volatile SingularAttribute<User, BigInteger> mobileNumber;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> photoPath;
	public static volatile SingularAttribute<User, Date> updatedDate;
	public static volatile ListAttribute<User, PublishRide> publishRides;
	public static volatile ListAttribute<User, RideDetail> rideDetails;
	public static volatile SingularAttribute<User, City> city;
	public static volatile SingularAttribute<User, State> state;
}
