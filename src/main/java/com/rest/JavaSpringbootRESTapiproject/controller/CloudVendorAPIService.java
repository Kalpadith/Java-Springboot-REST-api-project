package com.rest.JavaSpringbootRESTapiproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.JavaSpringbootRESTapiproject.model.CloudVendor;

@RestController
@RequestMapping ("/cloudvendor")
public class CloudVendorAPIService {

	@GetMapping("{VendorId}")
	public CloudVendor getCloudVendorDetails(String VendorId) {
		return new CloudVendor("V1", "Ishan  Kalpadith", "Isuru niwasa,Mrungasyaya west,Middeniya.","0769733135");
		
		
	}
}
