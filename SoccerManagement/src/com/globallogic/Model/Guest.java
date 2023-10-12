package com.globallogic.Model;

import java.util.Date;
import java.util.List;

public class Guest {
private String guestName;
private String dob;
private Country country;
private Language language;
private List<Hobby> hobbies;
public Guest() {
	super();
	// TODO Auto-generated constructor stub
}
public Guest(String guestName, String dob, Country country, Language language, List<Hobby> hobbies) {
	super();
	this.guestName = guestName;
	this.dob = dob;
	this.country = country;
	this.language = language;
	this.hobbies = hobbies;
}
public String getGuestName() {
	return guestName;
}
public void setGuestName(String guestName) {
	this.guestName = guestName;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
public Language getLanguage() {
	return language;
}
public void setLanguage(Language language) {
	this.language = language;
}
public List<Hobby> getHobbies() {
	return hobbies;
}
public void setHobbies(List<Hobby> hobbies) {
	this.hobbies = hobbies;
}
@Override
public String toString() {
	return "Guest [guestName=" + guestName + ", dob=" + dob + ", country=" + country + ", language=" + language
			+ ", hobbies=" + hobbies + "]";
}




}
