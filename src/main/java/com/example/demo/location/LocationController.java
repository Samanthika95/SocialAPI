package com.example.demo.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationservice;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@RequestMapping(value = "/locations")
	public List<Location> getAllLocations(){
		return locationservice.getAllLocations(); 
		
	}
	
	@RequestMapping(value = "/locations/{id}")
	public Location getLocation(@PathVariable String id) {
		return locationservice.getLocation(id);
	}
	
	@RequestMapping(value = "/locations", method=RequestMethod.POST)
	public void addLocation(@RequestBody Location location) {
		locationservice.addLocation(location);
	}
	
	@RequestMapping(value = "/location/{id}", method = RequestMethod.PUT)
	public void updateLocation(@RequestBody Location location, @PathVariable String id ) {
		locationservice.updateLocation(location,id);
		
	}
	
	@RequestMapping (value = "/locations/{id}", method = RequestMethod.DELETE)
	public void deleteLocaion(String id) {
		locationservice.deleteLocation(id);
	}
	*/

}
