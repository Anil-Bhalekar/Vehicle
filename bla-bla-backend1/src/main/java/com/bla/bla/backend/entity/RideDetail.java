package com.bla.bla.backend.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ride_detail database table.
 * 
 */
@Entity
@Table(name="ride_detail")
@NamedQuery(name="RideDetail.findAll", query="SELECT r FROM RideDetail r")
public class RideDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="is_deleted")
	private int isDeleted;

	@Column(name="no_of_passenger")
	private int noOfPassenger;

	@Column(name="total_amount")
	private double totalAmount;

	@Column(name="transaction_id")
	private String transactionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to BookingPassengerDetail
	@OneToMany(mappedBy="rideDetail")
	private List<BookingPassengerDetail> bookingPassengerDetails;

	//bi-directional many-to-one association to Feedback
	@OneToMany(mappedBy="rideDetail")
	private List<Feedback> feedbacks;

	//bi-directional many-to-one association to PaymentType
	@ManyToOne
	@JoinColumn(name="payment_type_id")
	private PaymentType paymentType;

	//bi-directional many-to-one association to PublishRide
	@ManyToOne
	@JoinColumn(name="publish_ride_id")
	private PublishRide publishRide;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="booked_by_user_id")
	private User user;

	public RideDetail() {
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

	public int getNoOfPassenger() {
		return this.noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<BookingPassengerDetail> getBookingPassengerDetails() {
		return this.bookingPassengerDetails;
	}

	public void setBookingPassengerDetails(List<BookingPassengerDetail> bookingPassengerDetails) {
		this.bookingPassengerDetails = bookingPassengerDetails;
	}

	public BookingPassengerDetail addBookingPassengerDetail(BookingPassengerDetail bookingPassengerDetail) {
		getBookingPassengerDetails().add(bookingPassengerDetail);
		bookingPassengerDetail.setRideDetail(this);

		return bookingPassengerDetail;
	}

	public BookingPassengerDetail removeBookingPassengerDetail(BookingPassengerDetail bookingPassengerDetail) {
		getBookingPassengerDetails().remove(bookingPassengerDetail);
		bookingPassengerDetail.setRideDetail(null);

		return bookingPassengerDetail;
	}

	public List<Feedback> getFeedbacks() {
		return this.feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Feedback addFeedback(Feedback feedback) {
		getFeedbacks().add(feedback);
		feedback.setRideDetail(this);

		return feedback;
	}

	public Feedback removeFeedback(Feedback feedback) {
		getFeedbacks().remove(feedback);
		feedback.setRideDetail(null);

		return feedback;
	}

	public PaymentType getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public PublishRide getPublishRide() {
		return this.publishRide;
	}

	public void setPublishRide(PublishRide publishRide) {
		this.publishRide = publishRide;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}