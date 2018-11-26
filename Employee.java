package com.treselle.bean;
/**
*Author Balaji.D
*/

//Creating POJO class
public class Employee {
	
	private int empId;
	private String empName;
	private String job;
	private int age;
	private int sal;
	
	public Employee(int empId,String empName,String job,int age,int sal) {
		
		this.empId=empId;
		this.empName=empName;
		this.job=job;
		this.age=age;
		this.sal=sal;
	}
	
	public void setEmpId(int empId) {
		
		this.empId=empId;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public void setEmpName(String empName) {
		
		this.empName=empName;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	public void setJob(String job) {
		
		this.job=job;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setSal(int sal) {
		
		this.sal=sal;
	}
	
	public int getSal() {
		return this.sal;
	}
	public String toString() {
		return "[EmpNo=" + empId + " EmpName=" + empName +" Job=" + job + " Age=" + age + " Sal=" + sal + "]" ;
	}
}