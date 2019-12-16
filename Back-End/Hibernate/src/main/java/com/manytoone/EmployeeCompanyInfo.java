package com.manytoone;

import javax.persistence.*;

import com.cap.onetoone.Employee_info;

@Entity
@Table
public class EmployeeCompanyInfo {
@Id
@Column
private int expId;
@Column
private String companyName;
@Column
private int noOfYear;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="eid")
private Employee_info employee_info;
public int getExpId() {
	return expId;
}
public void setExpId(int expId) {
	this.expId = expId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public int getNoOfYear() {
	return noOfYear;
}
public void setNoOfYear(int noOfYear) {
	this.noOfYear = noOfYear;
}
public Employee_info getEmployee_info() {
	return employee_info;
}
public void setEmployee_info(Employee_info employee_info) {
	this.employee_info = employee_info;
}
@Override
public String toString() {
	return "EmployeeCompanyInfo [expId=" + expId + ", companyName=" + companyName + ", noOfYear=" + noOfYear
			+ ", employee_info=" + employee_info + "]";
}

}
