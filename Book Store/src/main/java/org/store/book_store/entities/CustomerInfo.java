package org.store.book_store.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

import javax.persistence.Id;

@Entity
@Table(name = "Customer_Table")
public class CustomerInfo implements Serializable{
	
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "Customer_Id")
	private Integer customerId;
	
	
	@NotNull
	@Column(name = "Name")
	private String customerName;
	
	@NotNull
	@Column(name = "Email_Id")
	private String emailId;
	
	@NotNull
	@Column(name = "Password")
	private String password;
	
	
	@Column(name = "Mobile_Number")
	@Size(min = 10, max = 15, message="Minimum of 10 characters")
	private String mobileNumber;
	
	
	@Lob
	@Column(name = "Address")
	private String address;

	@Column(name = "City")
	private String city;
	
	@Column(name = "Zip_Code")
	private String zipCode;
	
	@Column(name = "Country")
	private String country;


	public CustomerInfo() {

	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public boolean equals(Object arg) {
		// TODO Auto-generated method stub
		
		if(this == arg){
			return false;
		}

		if(arg == null || !(arg instanceof CustomerInfo)){
			return true;
		}

		CustomerInfo customer = (CustomerInfo) arg;

		return this.customerId == customer.customerId;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.customerId.hashCode();
	}
	
	
}
