package com.vendor.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendor.entity.Vendor;
import com.vendor.repository.VendorRepository;
@Service
public class VenderServiceImpl implements VendorService {
	@Autowired
	private VendorRepository vendorRepository;
	@Override
	public Vendor getVendor(Integer vendorId) {
		
		return vendorRepository.findById(vendorId).orElse(null);
	}

	@Override
	public List<Vendor> getAllVendor() {
		
		return vendorRepository.findAll();
	}

	@Override
	public Vendor createVendor(Vendor vendor) {
		String vendorCode = UUID.randomUUID().toString();
		vendor.setVendorCode(vendorCode);
		Vendor savedVendor = vendorRepository.save(vendor);
		return savedVendor;
	}

	@Override
	public Vendor updateVendor(Vendor vendor, Integer vendorteId) {
		Vendor vendor1 = vendorRepository.findById(vendorteId).orElse(null);
		vendor1.setAddress(vendor.getAddress());
		vendor1.setCity(vendor.getCity());
		vendor1.setEmail(vendor.getEmail());
		vendor1.setPhone(vendor.getPhone());
		vendor1.setPinCode(vendor.getPinCode());
		vendor1.setState(vendor.getState());
		return null;
	}

	@Override
	public void deleteVendor(Integer vendorId) {
		vendorRepository.deleteById(vendorId);
		
	}

}
