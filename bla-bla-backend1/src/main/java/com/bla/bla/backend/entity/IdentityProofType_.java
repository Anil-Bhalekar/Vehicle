package com.bla.bla.backend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-09T11:27:24.642+0530")
@StaticMetamodel(IdentityProofType.class)
public class IdentityProofType_ {
	public static volatile SingularAttribute<IdentityProofType, Integer> id;
	public static volatile SingularAttribute<IdentityProofType, Date> createdDate;
	public static volatile SingularAttribute<IdentityProofType, Integer> isDeleted;
	public static volatile SingularAttribute<IdentityProofType, String> name;
	public static volatile SingularAttribute<IdentityProofType, Date> updatedDate;
	public static volatile ListAttribute<IdentityProofType, BookingPassengerDetail> bookingPassengerDetails;
}
