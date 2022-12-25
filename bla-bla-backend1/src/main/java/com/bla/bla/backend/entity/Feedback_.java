package com.bla.bla.backend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-09T11:27:24.641+0530")
@StaticMetamodel(Feedback.class)
public class Feedback_ {
	public static volatile SingularAttribute<Feedback, Integer> id;
	public static volatile SingularAttribute<Feedback, Date> createdDate;
	public static volatile SingularAttribute<Feedback, String> feedback;
	public static volatile SingularAttribute<Feedback, Integer> isDeleted;
	public static volatile SingularAttribute<Feedback, Integer> rating;
	public static volatile SingularAttribute<Feedback, Date> updatedDate;
	public static volatile SingularAttribute<Feedback, PublishRide> publishRide;
	public static volatile SingularAttribute<Feedback, RideDetail> rideDetail;
}
