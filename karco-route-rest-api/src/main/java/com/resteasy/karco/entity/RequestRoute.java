package com.resteasy.karco.entity;

import java.util.Date;
import java.util.List;

public class RequestRoute {

	private Long idRequest;
	
	private String origin;
	
	private String destination;
	
	private String mode;
	
	private List<Address> listGeoPoint;
	
	private String units;
	
	private Date departure_time;


	public Long getIdRequest() {
		return idRequest;
	}

	public void setIdRequest(Long idRequest) {
		this.idRequest = idRequest;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public List<Address> getListGeoPoint() {
		return listGeoPoint;
	}

	public void setListGeoPoint(List<Address> listGeoPoint) {
		this.listGeoPoint = listGeoPoint;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public Date getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(Date departure_time) {
		this.departure_time = departure_time;
	}
	
}