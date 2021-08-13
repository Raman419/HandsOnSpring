package io.raman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.raman.model.Address;
import io.raman.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	public Address getAddressDetails(String empid) {
		return addressRepository.findById(empid).get();
	}

}
