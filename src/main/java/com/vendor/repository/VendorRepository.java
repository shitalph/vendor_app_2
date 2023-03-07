package com.vendor.repository;

import org.apache.tomcat.util.json.JSONParserConstants;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vendor.entity.Vendor;

public interface VendorRepository extends  JpaRepository<Vendor, Integer>{

}
