package com.example.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.entity.payload;
import com.example.api.service.LoadService;

@RestController
public class mycontroller {

	private final LoadService loadservice;

	public mycontroller(LoadService loadsservice) {
		this.loadservice = loadsservice;
	}
	
	@PostMapping("/load")
	public ResponseEntity<String> saveload(@RequestBody payload load)
	{
		loadservice.saveload(load);
		return ResponseEntity.status(HttpStatus.OK).body("Load details added successfully");
	}
	
	@GetMapping("/load")
	public ResponseEntity<Object> getLoadsByShipperId(@RequestParam("shipperId") String shipperId) {
        List<payload> loads = loadservice.findByShipperId(shipperId);
        if (loads.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        String responseMessage = "List of loads with shipperId: " + shipperId;
        return ResponseEntity.status(HttpStatus.OK).header("message", responseMessage).body(loads);
    }
	
	@GetMapping("/load/{loadId}")
	public ResponseEntity<payload> getLoadById(@PathVariable long loadId) {
		payload load = loadservice.findById(loadId);
        if (load == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(load);
    }
	
	@PutMapping("/load/{loadId}")
	public ResponseEntity<payload> updateLoadById(@PathVariable long loadId) {
		payload existingLoad = loadservice.findById(loadId);
		if (existingLoad == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        existingLoad.setLoadingPoint(existingLoad.getLoadingPoint());
        existingLoad.setUnloadingPoint(existingLoad.getUnloadingPoint());
		existingLoad.setProductType(existingLoad.getProductType());
        existingLoad.setTruckType(existingLoad.getTruckType());
        existingLoad.setNoOfTrucks(existingLoad.getNoOfTrucks());
        existingLoad.setWeight(existingLoad.getWeight());
        existingLoad.setComment(existingLoad.getComment());
        existingLoad.setDate(existingLoad.getDate());
        loadservice.saveload(existingLoad);
        return ResponseEntity.status(HttpStatus.OK).body(existingLoad);
    }
	
	@DeleteMapping("/load/{loadId}")
	public void deleteLoadById(@PathVariable long loadId){
        loadservice.deleteById(loadId);
    } 
}
