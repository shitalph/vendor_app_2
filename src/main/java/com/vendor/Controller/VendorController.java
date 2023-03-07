package com.vendor.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendor.Service.VendorService;
import com.vendor.entity.Vendor;

@RestController
@RequestMapping("/vendor")
public class VendorController {
	@Autowired
	private VendorService vendorService;
	@GetMapping("/{vendorId}")
	public Vendor getVendor(@PathVariable Integer vendorId) {
		return vendorService.getVendor(vendorId);
		
	}
	@PostMapping
	public Vendor createVendor( @RequestBody Vendor vendor) {
		return vendorService.createVendor(vendor);
	}
	@DeleteMapping("/{vendorId}")
	public void deleteVendor( @PathVariable Integer vendorId) {
		vendorService.deleteVendor(vendorId);
	}
	@GetMapping
	public List<Vendor> getAllVendor(){
		return vendorService.getAllVendor();
	}

}
