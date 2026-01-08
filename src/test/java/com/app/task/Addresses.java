package com.app.task;

import java.util.List;

public class Addresses {
	
	private List<Addresses>addresses;
	private String type;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	
	public List<Addresses> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Addresses> addresses) {
		this.addresses = addresses;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
}
