package org.packt.bus.portal.model.form;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class BookingForm {
	
	private Integer id;
	private Integer tripId;
	private Integer userId;
	private Integer kids;
	private Integer adults;
	private String booked;
	private Double total;
	private String status;
	
	
	public BookingForm() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BookingForm(Integer id, Integer tripId, Integer userId,
			Integer kids, Integer adults, String booked, Double total,
			String status) {
		super();
		this.id = id;
		this.tripId = tripId;
		this.userId = userId;
		this.kids = kids;
		this.adults = adults;
		this.booked = booked;
		this.total = total;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTripId() {
		return tripId;
	}
	public void setTripId(Integer tripId) {
		this.tripId = tripId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getKids() {
		return kids;
	}
	public void setKids(Integer kids) {
		this.kids = kids;
	}
	public Integer getAdults() {
		return adults;
	}
	public void setAdults(Integer adults) {
		this.adults = adults;
	}
	public String getBooked() {
		return booked;
	}
	public void setBooked(String booked) {
		this.booked = booked;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	

}
