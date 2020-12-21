package com.hibernate.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Student {
@Id
private int rollNo;
private String name;
private int marks;
@OneToMany(orphanRemoval=true,mappedBy="student")
private List<Laptop> laptop;

public List<Laptop> getLaptop() {
	return laptop;
}
public void setLaptop(List<Laptop> laptop) {
	this.laptop = laptop;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}

}
