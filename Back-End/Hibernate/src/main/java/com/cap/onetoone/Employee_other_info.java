package com.cap.onetoone;

import javax.persistence.*;
@Entity
@Table
public class Employee_other_info {
	@Id
	@Column
private int id;
	@Column
private String father_name;
	@Column
private String mother_naame;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee_info employee_info;


public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFather_name() {
		return father_name;
	}


	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}


	public String getMother_naame() {
		return mother_naame;
	}


	public void setMother_naame(String mother_naame) {
		this.mother_naame = mother_naame;
	}


	public Employee_info getEmployee_info() {
		return employee_info;
	}


	public void setEmployee_info(Employee_info employee_info) {
		this.employee_info = employee_info;
	}


@Override
public String toString() {
	return "Employee_other_info [id=" + id + ", father_name=" + father_name + ", mother_naame=" + mother_naame + "]";
}


}
