package com.bla.bla.backend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-09T11:27:24.642+0530")
@StaticMetamodel(PaymentType.class)
public class PaymentType_ {
	public static volatile SingularAttribute<PaymentType, Integer> id;
	public static volatile SingularAttribute<PaymentType, Date> createdDate;
	public static volatile SingularAttribute<PaymentType, Integer> isDeleted;
	public static volatile SingularAttribute<PaymentType, String> name;
	public static volatile SingularAttribute<PaymentType, Date> updatedDate;
	public static volatile ListAttribute<PaymentType, RideDetail> rideDetails;
}
