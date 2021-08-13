package io.raman.model;

public class Employee {

	private String empid;
	private Address address;
	private Organization organization;

	public Employee() {
		super();
	}

	public Employee(String empid, Address address, Organization organization) {
		super();
		this.empid = empid;
		this.address = address;
		this.organization = organization;
	}



	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

}
