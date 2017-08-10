package com.cg.mobilebilling.beans;

import java.util.HashMap;
<<<<<<< HEAD
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerID;
	private String firstName, lastName, emailID, dateOfBirth,password;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy = "customer" , cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	Map<Long,PostpaidAccount> postpaidAccounts=new HashMap<>();
	
	public Customer() {
		super();
	}

	public Customer(int customerID, String firstName, String lastName, String emailID, String dateOfBirth,
			String password, Address address, Map<Long, PostpaidAccount> postpaidAccounts) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.address = address;
		this.postpaidAccounts = postpaidAccounts;
	}
	

	public Customer(int customerID) {
		super();
		this.customerID = customerID;
	}

	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Map<Long, PostpaidAccount> getPostpaidAccounts() {
		return postpaidAccounts;
	}


	public void setPostpaidAccounts(PostpaidAccount postpaidAccounts) {
		if(this.postpaidAccounts!=null){
		this.postpaidAccounts.put((long) (this.postpaidAccounts.size()+1),postpaidAccounts);	
		}else
		{
			System.out.println("null");
		}	
=======

public class Customer {
	private int customerID;
	private String firstName, lastName, emailID, dateOfBirth;
	private Address billingAddress, homeAddress;
	private HashMap<Long, PostpaidAccount> postpaidAccounts;
	public Customer() {}
	public Customer(int customerID, String firstName, String lastName,
			String emailID, String dateOfBirth, Address billingAddress,
			Address homeAddress) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.dateOfBirth = dateOfBirth;
		this.billingAddress = billingAddress;
		this.homeAddress = homeAddress;
		this.postpaidAccounts = new HashMap<>();
	}
	public Customer(String firstName, String lastName, String emailID,
			String dateOfBirth, Address billingAddress, Address homeAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.dateOfBirth = dateOfBirth;
		this.billingAddress = billingAddress;
		this.homeAddress = homeAddress;
		this.postpaidAccounts = new HashMap<>();
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public HashMap<Long, PostpaidAccount> getPostpaidAccounts() {
		return postpaidAccounts;
	}
	public void setPostpaidAccounts(long mobileNo, PostpaidAccount account) {
		this.postpaidAccounts.put(mobileNo, account);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((billingAddress == null) ? 0 : billingAddress.hashCode());
		result = prime * result + customerID;
		result = prime * result
				+ ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((homeAddress == null) ? 0 : homeAddress.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime
				* result
				+ ((postpaidAccounts == null) ? 0 : postpaidAccounts.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billingAddress == null) {
			if (other.billingAddress != null)
				return false;
		} else if (!billingAddress.equals(other.billingAddress))
			return false;
		if (customerID != other.customerID)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (emailID == null) {
			if (other.emailID != null)
				return false;
		} else if (!emailID.equals(other.emailID))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (homeAddress == null) {
			if (other.homeAddress != null)
				return false;
		} else if (!homeAddress.equals(other.homeAddress))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (postpaidAccounts == null) {
			if (other.postpaidAccounts != null)
				return false;
		} else if (!postpaidAccounts.equals(other.postpaidAccounts))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", firstName="
				+ firstName + ", lastName=" + lastName + ", emailID=" + emailID
				+ ", dateOfBirth=" + dateOfBirth + ", billingAddress="
				+ billingAddress.toString() + ", homeAddress=" + homeAddress.toString()
				+ ", postpaidAccounts=" + postpaidAccounts.toString() + "]";
>>>>>>> branch 'master' of https://github.com/shazz15/billing.git
	}
}