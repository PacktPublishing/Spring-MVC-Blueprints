package org.packt.bus.portal.model.form;

public class TripForm {
	
	private Integer id;
	private String name;
	private Integer nsights;
	private Integer dayTrip;
	private Integer nightTrip;
	private String typeTrip;
	private String otherTranspo;
	private String language;
	private Double adultPrice;
	private Double kidPrice;
	private Integer stationId;
	
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
	public Integer getNsights() {
		return nsights;
	}
	public void setNsights(Integer nsights) {
		this.nsights = nsights;
	}
	public Integer getDayTrip() {
		return dayTrip;
	}
	public void setDayTrip(Integer dayTrip) {
		this.dayTrip = dayTrip;
	}
	public Integer getNightTrip() {
		return nightTrip;
	}
	public void setNightTrip(Integer nightTrip) {
		this.nightTrip = nightTrip;
	}
	public String getTypeTrip() {
		return typeTrip;
	}
	public void setTypeTrip(String typeTrip) {
		this.typeTrip = typeTrip;
	}
	public String getOtherTranspo() {
		return otherTranspo;
	}
	public void setOtherTranspo(String otherTranspo) {
		this.otherTranspo = otherTranspo;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Double getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(Double adultPrice) {
		this.adultPrice = adultPrice;
	}
	public Double getKidPrice() {
		return kidPrice;
	}
	public void setKidPrice(Double kidPrice) {
		this.kidPrice = kidPrice;
	}
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	
	
	
	

}
