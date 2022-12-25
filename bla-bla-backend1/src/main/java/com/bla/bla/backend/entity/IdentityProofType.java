package com.bla.bla.backend.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the identity_proof_type database table.
 * 
 */
@Entity
@Table(name="identity_docuement")
@NamedQuery(name="IdentityProofType.findAll", query="SELECT i FROM IdentityProofType i")
public class IdentityProofType implements Serializable {
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

	//bi-directional many-to-one association to BookingPassengerDetail
	@OneToMany(mappedBy="identityProofType")
	private List<BookingPassengerDetail> bookingPassengerDetails;

	public IdentityProofType() {
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

	public List<BookingPassengerDetail> getBookingPassengerDetails() {
		return this.bookingPassengerDetails;
	}

	public void setBookingPassengerDetails(List<BookingPassengerDetail> bookingPassengerDetails) {
		this.bookingPassengerDetails = bookingPassengerDetails;
	}

	public BookingPassengerDetail addBookingPassengerDetail(BookingPassengerDetail bookingPassengerDetail) {
		getBookingPassengerDetails().add(bookingPassengerDetail);
		bookingPassengerDetail.setIdentityProofType(this);

		return bookingPassengerDetail;
	}

	public BookingPassengerDetail removeBookingPassengerDetail(BookingPassengerDetail bookingPassengerDetail) {
		getBookingPassengerDetails().remove(bookingPassengerDetail);
		bookingPassengerDetail.setIdentityProofType(null);

		return bookingPassengerDetail;
	}

}