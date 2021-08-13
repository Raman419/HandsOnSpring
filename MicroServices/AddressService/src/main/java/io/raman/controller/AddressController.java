package io.raman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.raman.model.Address;
import io.raman.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("/address/{empid}")
	public Address getAddressDetails(@PathVariable String empid) {
		return addressService.getAddressDetails(empid);
	}

}
