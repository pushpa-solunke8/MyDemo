package com.test;

public class Employee {
	private int employeeId;
	private String employeeName;
	private long mobileNo;
	private String address;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", mobileNo=" + mobileNo
				+ ", address=" + address + "]";
	}
	
	
	

}
