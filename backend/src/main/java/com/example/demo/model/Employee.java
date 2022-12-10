package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "employee")
@Entity
public class Employee {
    
	public Employee() {
		
	}
	public Employee(String empId, String empName, int designationLevel) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designationLevel = designationLevel;
	}

    @Id
	private String empId;
	private String empName;
	private int designationLevel;

    public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDesignationLevel() {
		return designationLevel;
	}
	public void setDesignationLevel(int designationLevel) {
		this.designationLevel = designationLevel;
	}
}
