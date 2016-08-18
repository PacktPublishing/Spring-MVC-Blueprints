package org.packt.hotel.portal.model.data;

import java.io.Serializable;
import java.util.Date;

public class HmsFreeBooking implements Serializable{
	
	private Integer id;
	private String name;
	private String mobile;
	private String email;
	private Integer length;
	private Integer heads;
	private Date arrivalDate;
	private String comment;
		
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer lenght) {
		this.length = lenght;
	}
	public Integer getHeads() {
		return heads;
	}
	public void setHeads(Integer heads) {
		this.heads = heads;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
