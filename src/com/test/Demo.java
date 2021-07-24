package com.test;

public class Demo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Ganesh");
		s1.setId(10);
		s1.setAddress("Nagesh Colony");
		s1.setMobileNo(9075115608l);
		System.out.println(s1);
		Employee e1=new Employee();
		e1.setAddress("Shikshak Colony");
		e1.setEmployeeId(20);
		e1.setMobileNo(9075115608l);
		System.out.println(e1);
		
		Student s2=new Student();
		s2.setName("Rajesh");
		s2.setId(20);
		s2.setAddress("Rajesh Colony");
		s2.setMobileNo(9638527410l);
		System.out.println(s2);
		Employee e2=new Employee();
		e2.setAddress("Sevak Colony");
		e2.setEmployeeId(40);
		e2.setMobileNo(1478529630l);
		System.out.println(e2);
		
		
	}
	

}
