package com.resteasy.karco.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Route {

	private Long id;
	private String status;
	private String startAddress;
	private String endAddress;
	private String routeJson;
	
	public Route(){
	}

	public Route(Long id, String status, String startAddress, String endAddress, String routeJson) {
		super();
		this.id = id;
		this.status = status;
		this.startAddress = startAddress;
		this.endAddress = endAddress;
		this.routeJson = routeJson;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartAddress() {
		return startAddress;
	}

	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	public String getEndAddress() {
		return endAddress;
	}

	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}

	public String getRouteJson() {
		return routeJson;
	}

	public void setRouteJson(String routeJson) {
		this.routeJson = routeJson;
	}

}
