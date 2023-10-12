package com.globallogic;

import java.util.List;

public class Contact {
	private String name;
	private String organisation;
	private List<PhoneNumber> phoneNumbers;
	private List<Address> addresses;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String organisation, List<PhoneNumber> phoneNumbers, List<Address> addresses) {
		super();
		this.name = name;
		this.organisation = organisation;
		this.phoneNumbers = phoneNumbers;
		this.addresses = addresses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
  public void addPhoneNumber(PhoneNumber phone)
  {
	  phoneNumbers.add(phone);
  }
  public void addAddress(Address address)
  {
	  addresses.add(address);
  }
@Override
public String toString() {
	return "Contact [name=" + name + ", organisation=" + organisation + ", phoneNumbers=" + phoneNumbers
			+ ", addresses=" + addresses + "]";
}
	
}
