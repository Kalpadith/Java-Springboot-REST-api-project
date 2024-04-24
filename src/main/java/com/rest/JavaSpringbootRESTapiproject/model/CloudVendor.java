package com.rest.JavaSpringbootRESTapiproject.model;

public class CloudVendor {
	
	private String VendorId;
	private String VendorName;
	private String VendorAddress;
	private String VendorPhoneNmber;
	
	public CloudVendor() {
		
	}

	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNmber) {
		
		this.VendorId = vendorId;
		this.VendorName = vendorName;
		this.VendorAddress = vendorAddress;
		this.VendorPhoneNmber = vendorPhoneNmber;
	}

	public String getVendorId() {
		return VendorId;
	}

	public void setVendorId(String vendorId) {
		VendorId = vendorId;
	}

	public String getVendorName() {
		return VendorName;
	}

	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}

	public String getVendorAddress() {
		return VendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		VendorAddress = vendorAddress;
	}

	public String getVendorPhoneNmber() {
		return VendorPhoneNmber;
	}

	public void setVendorPhoneNmber(String vendorPhoneNmber) {
		VendorPhoneNmber = vendorPhoneNmber;
	}

}
