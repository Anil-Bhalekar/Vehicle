package com.bla.bla.backend.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the booking_passenger_detail database table.
 * 
 */
@Entity
@Table(name="booking_passenger_detail")
@NamedQuery(name="BookingPassengerDetail.findAll", query="SELECT b FROM BookingPassengerDetail b")
public class BookingPassengerDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int age;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String gender;

	@Column(name="identity_proof_no")
	private String identityProofNo;

	@Column(name="identity_proof_photo_path")
	private String identityProofPhotoPath;

	@Column(name="is_deleted")
	private int isDeleted;

	@Column(name="passenger_name")
	private String passengerName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to IdentityProofType
	@ManyToOne
	@JoinColumn(name="identity_proof_type_id")
	private IdentityProofType identityProofType;

	//bi-directional many-to-one association to RideDetail
	@ManyToOne
	@JoinColumn(name="ride_detail_id")
	private RideDetail rideDetail;

	public BookingPassengerDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdentityProofNo() {
		return this.identityProofNo;
	}

	public void setIdentityProofNo(String identityProofNo) {
		this.identityProofNo = identityProofNo;
	}

	public String getIdentityProofPhotoPath() {
		return this.identityProofPhotoPath;
	}

	public void setIdentityProofPhotoPath(String identityProofPhotoPath) {
		this.identityProofPhotoPath = identityProofPhotoPath;
	}

	public int getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getPassengerName() {
		return this.passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public IdentityProofType getIdentityProofType() {
		return this.identityProofType;
	}

	public void setIdentityProofType(IdentityProofType identityProofType) {
		this.identityProofType = identityProofType;
	}

	public RideDetail getRideDetail() {
		return this.rideDetail;
	}

	public void setRideDetail(RideDetail rideDetail) {
		this.rideDetail = rideDetail;
	}

}