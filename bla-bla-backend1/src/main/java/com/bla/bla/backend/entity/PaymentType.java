package com.bla.bla.backend.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the payment_type database table.
 * 
 */
@Entity
@Table(name="payment_type")
@NamedQuery(name="PaymentType.findAll", query="SELECT p FROM PaymentType p")
public class PaymentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="is_deleted")
	private int isDeleted;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to RideDetail
	@OneToMany(mappedBy="paymentType")
	private List<RideDetail> rideDetails;

	public PaymentType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<RideDetail> getRideDetails() {
		return this.rideDetails;
	}

	public void setRideDetails(List<RideDetail> rideDetails) {
		this.rideDetails = rideDetails;
	}

	public RideDetail addRideDetail(RideDetail rideDetail) {
		getRideDetails().add(rideDetail);
		rideDetail.setPaymentType(this);

		return rideDetail;
	}

	public RideDetail removeRideDetail(RideDetail rideDetail) {
		getRideDetails().remove(rideDetail);
		rideDetail.setPaymentType(null);

		return rideDetail;
	}

}