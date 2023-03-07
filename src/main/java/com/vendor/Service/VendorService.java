package com.vendor.Service;

import java.util.List;

import com.vendor.entity.Vendor;

public interface VendorService {
	//get
	Vendor getVendor(Integer vendorId);
	//getAll
	List<Vendor> getAllVendor();
	//create
  Vendor createVendor(Vendor vendor);
    //update
  Vendor updateVendor(Vendor vendor,Integer vendorteId);
  //delete
  void deleteVendor(Integer vendorId);

}
