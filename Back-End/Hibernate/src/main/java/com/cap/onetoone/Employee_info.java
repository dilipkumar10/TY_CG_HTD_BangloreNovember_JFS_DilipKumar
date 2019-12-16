package com.cap.onetoone;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

import com.manytoone.EmployeeCompanyInfo;

@Entity
@Table
public class Employee_info {
	@Id
	@Column
private int eid;
	@Column
private String ename;
	@Column
private String email;
	@Column
private String password;
	/*@OneToOne(cascade=CascadeType.ALL,mappedBy="employee_info")
	private Employee_other_info e3;*/
	@OneToMany(cascade=CascadeType.ALL,mappedBy="employee_info")
	private List<EmployeeCompanyInfo> e4;
public int getEid() {
		return eid;
	}
  
	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<EmployeeCompanyInfo> getE4() {
		return e4;
	}

	public void setE4(List<EmployeeCompanyInfo> e4) {
		this.e4 = e4;
	}

	/*public Employee_other_info getE3() {
		return e3;
	}

	public void setE3(Employee_other_info e3) {
		this.e3 = e3;
	}*/

	

@Override
public String toString() {
	return "Employee_info [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password + "]";
}

}
