package com.example.demo.vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.demo.location.Location;
@Entity
public class Vehicle {
	@Id
	String id;
	String name;
	Location location;
	
	
	public Vehicle(String id, String name, Location location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public Vehicle() {
		
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
}
