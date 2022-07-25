package com.kodnest.prgms;

public class No_of_objects_created {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	object obj	= new object();
	object obj1 = new object();
	object obj2 = new object();
	System.out.println("No of objects created is "+obj.count);
	}

}
class object{
	static int  count;
	public object() {
	count++;
		// TODO Auto-generated constructor stub
	}
}
