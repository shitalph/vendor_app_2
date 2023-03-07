package com.vendor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vendor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vendorId;
	
	private  String vendorName;
	
	
	private String VendorCode;
	
	private String address;
	
	private String city;
	
	private String state;
	
	@NotNull
	@Min(6)
	
	private long pinCode;
	
	@NotNull
	@Min(10)

	private long phone;
	@Email(message = "email address not valid")
	
	private String email;
	

}
