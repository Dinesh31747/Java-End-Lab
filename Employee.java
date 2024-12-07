package com.klu.FirstHibProject;

import javax.persistence.*;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int eid;
	@Column(name = "Employee_name")
	private String ename;
	@Column(name = "Designation")
	private String empDesig;
	@Column(name = "Salary")
	private double empSal
;	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String empDesig, double empSal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.empDesig = empDesig;
		this.empSal = empSal;
	}
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
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", empDesig=" + empDesig + ", empSal=" + empSal + "]";
	}
}
