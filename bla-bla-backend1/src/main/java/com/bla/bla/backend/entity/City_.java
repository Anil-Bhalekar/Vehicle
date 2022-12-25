package com.bla.bla.backend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-09T11:27:24.640+0530")
@StaticMetamodel(City.class)
public class City_ {
	public static volatile SingularAttribute<City, Integer> id;
	public static volatile SingularAttribute<City, Date> createdDate;
	public static volatile SingularAttribute<City, Integer> isDeleted;
	public static volatile SingularAttribute<City, String> name;
	public static volatile SingularAttribute<City, Date> updatedDate;
	public static volatile SingularAttribute<City, State> state;
	public static volatile ListAttribute<City, User> users;
	public static volatile ListAttribute<City, Via> vias;
}
