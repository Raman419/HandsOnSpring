package io.raman.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	private String dno;
	private String area;
	private String pincode;
	@Id
	private String empid;

	public Address() {
		super();
	}

	public Address(String dno, String area, String pincode, String empid) {
		super();
		this.dno = dno;
		this.area = area;
		this.pincode = pincode;
		this.empid = empid;
	}


	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}

}
