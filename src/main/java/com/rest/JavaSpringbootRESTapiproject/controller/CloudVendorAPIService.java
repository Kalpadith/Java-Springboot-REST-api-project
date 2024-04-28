package com.rest.JavaSpringbootRESTapiproject.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rest.JavaSpringbootRESTapiproject.model.CloudVendor;



@RestController
@RequestMapping ("/cloudvendor")
public class CloudVendorAPIService {

	 private List<CloudVendor> cloudVendors = new ArrayList<>();

	    @GetMapping("{vendorId}")
	    public ResponseEntity<CloudVendor> getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
	        Optional<CloudVendor> vendor = cloudVendors.stream()
	                .filter(cv -> cv.getVendorId().equals(vendorId))
	                .findFirst();

	        if (vendor.isPresent()) {
	            return new ResponseEntity<>(vendor.get(), HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    
	    @PostMapping("/create")
	    public ResponseEntity<String> createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
	        cloudVendors.add(cloudVendor);
	        return new ResponseEntity<>("Cloud Vendor Created Successfully", HttpStatus.CREATED);
	    }
	
	@PutMapping("/update/{vendorId}")
    public ResponseEntity<String> updateCloudVendorDetails(@PathVariable("vendorId") String vendorId, @RequestBody CloudVendor cloudVendor) {
        Optional<CloudVendor> existingVendorOpt = cloudVendors.stream()
                .filter(cv -> cv.getVendorId().equals(vendorId))
                .findFirst();

        if (existingVendorOpt.isPresent()) {
            CloudVendor existingVendor = existingVendorOpt.get();
            existingVendor.setVendorName(cloudVendor.getVendorName());
            existingVendor.setVendorAddress(cloudVendor.getVendorAddress());
            existingVendor.setVendorPhoneNmber(cloudVendor.getVendorPhoneNmber());
            return new ResponseEntity<>("Cloud Vendor Updated Successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Vendor Not Found", HttpStatus.NOT_FOUND);
        }
    }

	 @DeleteMapping("/delete/{vendorId}")
	    public ResponseEntity<String> deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
	        boolean removed = cloudVendors.removeIf(cv -> cv.getVendorId().equals(vendorId));

	        if (removed) {
	            return new ResponseEntity<>("Cloud Vendor Deleted Successfully", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Vendor Not Found", HttpStatus.NOT_FOUND);
	        }
	    }
   
	
}
