package com.practise.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Student_Data")
public class student {
  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int Id;
  
  private String fName;
  
  private String lName;
  
  @Column(name = "contact")
  private long MobileNo;
  
  private String City;
  
  private String Gender;

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

public long getMobileNo() {
	return MobileNo;
}

public void setMobileNo(long mobileNo) {
	MobileNo = mobileNo;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getGender() {
	return Gender;
}

public void setGender(String gender) {
	Gender = gender;
}

@Override
public String toString() {
	return "student [Id=" + Id + ", fName=" + fName + ", lName=" + lName + ", MobileNo=" + MobileNo + ", City=" + City
			+ ", Gender=" + Gender + "]";
}
  
  
  
}