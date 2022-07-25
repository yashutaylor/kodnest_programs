package com.kodnest.prgms;

public class Studentapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		s1.setName("yashu");s1.setAge(20);s1.setId(69);
		s2.setName("taylor");s2.setAge(32);s2.setId(13);
		s3.setName("shawn");s3.setAge(26);s3.setId(4);
		s4.setName("katy");s4.setAge(30);s4.setId(6);
		Student arr[]=new Student[4];
		arr[0]=s1;arr[1]=s2;arr[2]=s3;arr[3]=s4;
		System.out.print("before sorting\n\n");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i].getName()+" "+arr[i].getAge()+" "+arr[i].getId()+" | ");
		}
		System.out.println("\n");
		Sorting.sort(arr);
		System.out.println("after sorting by age\n");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i].getName()+" "+arr[i].getAge()+" "+arr[i].getId()+" | ");
		}
			
	}

}
