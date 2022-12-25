package com.bla.bla.backend.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the publish_ride database table.
 * 
 */
@Entity
@Table(name="publish_ride")
@NamedQuery(name="PublishRide.findAll", query="SELECT p FROM PublishRide p")
public class PublishRide implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="available_seat")
	private int availableSeat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name="drop_off")
	private String dropOff;

	private String insurance;

	@Column(name="is_deleted")
	private int isDeleted;

	private String license;

	@Column(name="no_of_seat")
	private int noOfSeat;

	@Column(name="pick_up")
	private String pickUp;

	@Column(name="price_per_seat")
	private double pricePerSeat;

	@Column(name="reach_time")
	private String reachTime;

	@Column(name="registration_card_path")
	private String registrationCardPath;

	private String time;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="vehicle_name")
	private String vehicleName;

	@Column(name="vehicle_photo")
	private String vehiclePhoto;

	@Column(name="vehicle_registration_no")
	private String vehicleRegistrationNo;

	//bi-directional many-to-one association to Feedback
	@OneToMany(mappedBy="publishRide")
	private List<Feedback> feedbacks;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="publish_user_id")
	private User user;

	//bi-directional many-to-one association to RideDetail
	@OneToMany(mappedBy="publishRide")
	private List<RideDetail> rideDetails;

	public PublishRide() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAvailableSeat() {
		return this.availableSeat;
	}

	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDropOff() {
		return this.dropOff;
	}

	public void setDropOff(String dropOff) {
		this.dropOff = dropOff;
	}

	public String getInsurance() {
		return this.insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public int getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public int getNoOfSeat() {
		return this.noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}

	public String getPickUp() {
		return this.pickUp;
	}

	public void setPickUp(String pickUp) {
		this.pickUp = pickUp;
	}

	public double getPricePerSeat() {
		return this.pricePerSeat;
	}

	public void setPricePerSeat(double pricePerSeat) {
		this.pricePerSeat = pricePerSeat;
	}

	public String getReachTime() {
		return this.reachTime;
	}

	public void setReachTime(String reachTime) {
		this.reachTime = reachTime;
	}

	public String getRegistrationCardPath() {
		return this.registrationCardPath;
	}

	public void setRegistrationCardPath(String registrationCardPath) {
		this.registrationCardPath = registrationCardPath;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getVehicleName() {
		return this.vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehiclePhoto() {
		return this.vehiclePhoto;
	}

	public void setVehiclePhoto(String vehiclePhoto) {
		this.vehiclePhoto = vehiclePhoto;
	}

	public String getVehicleRegistrationNo() {
		return this.vehicleRegistrationNo;
	}

	public void setVehicleRegistrationNo(String vehicleRegistrationNo) {
		this.vehicleRegistrationNo = vehicleRegistrationNo;
	}

	public List<Feedback> getFeedbacks() {
		return this.feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Feedback addFeedback(Feedback feedback) {
		getFeedbacks().add(feedback);
		feedback.setPublishRide(this);

		return feedback;
	}

	public Feedback removeFeedback(Feedback feedback) {
		getFeedbacks().remove(feedback);
		feedback.setPublishRide(null);

		return feedback;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<RideDetail> getRideDetails() {
		return this.rideDetails;
	}

	public void setRideDetails(List<RideDetail> rideDetails) {
		this.rideDetails = rideDetails;
	}

	public RideDetail addRideDetail(RideDetail rideDetail) {
		getRideDetails().add(rideDetail);
		rideDetail.setPublishRide(this);

		return rideDetail;
	}

	public RideDetail removeRideDetail(RideDetail rideDetail) {
		getRideDetails().remove(rideDetail);
		rideDetail.setPublishRide(null);

		return rideDetail;
	}

}