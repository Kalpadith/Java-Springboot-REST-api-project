package com.rest.JavaSpringbootRESTapiproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.JavaSpringbootRESTapiproject.model.CloudVendor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping ("/cloudvendor")
public class CloudVendorAPIService {

	CloudVendor cloudVendor;
	
	@GetMapping("{VendorId}")
	public CloudVendor getCloudVendorDetails(String VendorId) {
		return new CloudVendor("V1", "Ishan  Kalpadith", "Isuru niwasa,Mrungasyaya west,Middeniya.","0769733135");
		//return cloudVendor;
	}
	
	@PostMapping("/create")
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Created Successfully";
	}
	
	@PutMapping("/update")
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Created Successfully";
	}
	
}
