package com.example.demo.vehicle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleservice;
	
	@RequestMapping(value = "/vehcles")
	public List<Vehicle> getAllVehicles(){
		return vehicleservice.getAllVehicles();
	}
	
	@RequestMapping(value="/vehicles/{id}")
	public Optional<Vehicle> getVehicle(@PathVariable String id){
		return vehicleservice.getVehicle(id);
	}
	
	@RequestMapping(value="/vehicles", method = RequestMethod.POST)
	public void addvehicle(@RequestBody Vehicle vehicle) {
		vehicleservice.addVehicle(vehicle);
	}
	
	@RequestMapping(value = "/vehicles/{id}", method=RequestMethod.DELETE)
	public void deleteVehicle(@PathVariable String id) {
		vehicleservice.deleteVehicle(id);
	}
	
	@RequestMapping(value= "/vehicle/{id}", method=RequestMethod.PUT)
	public void updateVehicle(@PathVariable String id, @RequestBody Vehicle vehicle) {
		vehicleservice.updateVehicle(id, vehicle);
	}
	

}
