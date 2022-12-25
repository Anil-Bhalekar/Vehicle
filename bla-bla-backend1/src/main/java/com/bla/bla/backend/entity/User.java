package com.bla.bla.backend.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String bio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String email;

	@Column(name="first_name")
	private String firstName;

	private String gender;

	@Column(name="house_no")
	private String houseNo;

	@Column(name="is_deleted")
	private int isDeleted;

	@Column(name="last_name")
	private String lastName;

	@Column(name="mobile_number")
	private BigInteger mobileNumber;

	private String password;

	@Lob
	@Column(name="photo_path")
	private String photoPath;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to PublishRide
	@OneToMany(mappedBy="user")
	private List<PublishRide> publishRides;

	//bi-directional many-to-one association to RideDetail
	@OneToMany(mappedBy="user")
	private List<RideDetail> rideDetails;

	//bi-directional many-to-one association to City
	@ManyToOne
	private City city;

	//bi-directional many-to-one association to State
	@ManyToOne
	private State state;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBio() {
		return this.bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHouseNo() {
		return this.houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public int getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigInteger getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<PublishRide> getPublishRides() {
		return this.publishRides;
	}

	public void setPublishRides(List<PublishRide> publishRides) {
		this.publishRides = publishRides;
	}

	public PublishRide addPublishRide(PublishRide publishRide) {
		getPublishRides().add(publishRide);
		publishRide.setUser(this);

		return publishRide;
	}

	public PublishRide removePublishRide(PublishRide publishRide) {
		getPublishRides().remove(publishRide);
		publishRide.setUser(null);

		return publishRide;
	}

	public List<RideDetail> getRideDetails() {
		return this.rideDetails;
	}

	public void setRideDetails(List<RideDetail> rideDetails) {
		this.rideDetails = rideDetails;
	}

	public RideDetail addRideDetail(RideDetail rideDetail) {
		getRideDetails().add(rideDetail);
		rideDetail.setUser(this);

		return rideDetail;
	}

	public RideDetail removeRideDetail(RideDetail rideDetail) {
		getRideDetails().remove(rideDetail);
		rideDetail.setUser(null);

		return rideDetail;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

}