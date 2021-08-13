package io.raman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.raman.model.Address;
import io.raman.model.Employee;
import io.raman.model.Organization;

@RestController
public class EmployeeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/employee/{empid}")
	public Employee getEmployeeDetails(@PathVariable String empid) {
		Address address = restTemplate.getForObject("http://AddressService/address/"+empid, Address.class);
		System.out.println("address details");
		System.out.println(address.toString());
		Organization organization = restTemplate.getForObject("http://Organization/organization/"+empid, Organization.class);
		return new Employee(empid, address, organization);
	}
	

}
