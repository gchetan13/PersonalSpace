package com.spring.models;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Employee{
private int empid;
private String empName;
private String dept;
private int[] appraisals;
private List<String> previousCompanies;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Employee(int empid,String empName,String dept) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.dept = dept;
}
public Employee(String dept,int empid,String empName) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.dept = dept;
}
public Employee(int empid, String empName, String dept, int[] appraisals) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.dept = dept;
	this.appraisals = appraisals;
}
public int[] getAppraisals() {
	return appraisals;
}
public void setAppraisals(int[] appraisals) {
	this.appraisals = appraisals;
}
public Employee(int empid, String empName, String dept, int[] appraisals,
		List<String> previousCompanies) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.dept = dept;
	this.appraisals = appraisals;
	this.previousCompanies = previousCompanies;
}
public List<String> getPreviousCompanies() {
	return previousCompanies;
}
public void setPreviousCompanies(List<String> previousCompanies) {
	this.previousCompanies = previousCompanies;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empName=" + empName + ", dept="
			+ dept + ", appraisals=" + Arrays.toString(appraisals)
			+ ", previousCompanies=" + previousCompanies + "]";
}


}
