package com.kodnest.prgms;

public class employee {
	private int empid ;
	private int salary;
	private String name;
	private int age;
	private float height;
	public employee() {
		
	}
	public employee(int empid,String name,int salary) {
		this();
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	public employee(int age,float height ) {
		this(12,"yashu",55000);
		this.age=age;
		this.height=height;
	}
	public int getEmpid() {
		return empid;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getHeight() {
		return height;
	}
	
}
