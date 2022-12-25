package com.bla.bla.backend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-08-09T11:27:24.644+0530")
@StaticMetamodel(State.class)
public class State_ {
	public static volatile SingularAttribute<State, Integer> id;
	public static volatile SingularAttribute<State, Date> createdDate;
	public static volatile SingularAttribute<State, Integer> isDeleted;
	public static volatile SingularAttribute<State, String> name;
	public static volatile SingularAttribute<State, Date> updatedDate;
	public static volatile ListAttribute<State, City> cities;
	public static volatile ListAttribute<State, User> users;
	public static volatile ListAttribute<State, Via> vias;
}
