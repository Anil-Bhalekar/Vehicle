package com.bla.bla.backend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-09T11:27:24.645+0530")
@StaticMetamodel(Via.class)
public class Via_ {
	public static volatile SingularAttribute<Via, Integer> id;
	public static volatile SingularAttribute<Via, Date> createdDate;
	public static volatile SingularAttribute<Via, Integer> isDeleted;
	public static volatile SingularAttribute<Via, Integer> publishRideId;
	public static volatile SingularAttribute<Via, Date> updatedDate;
	public static volatile SingularAttribute<Via, City> city;
	public static volatile SingularAttribute<Via, State> state;
}
