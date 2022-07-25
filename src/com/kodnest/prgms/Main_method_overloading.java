package com.kodnest.prgms;

public class Main_method_overloading {
	void main(){
		System.out.println("this is main method overloading");
	}
	public int main(int a) {
		int p=a;
		System.out.println(p);
		return p;
	}
	public static void main(String[] args) {
		Main_method_overloading obj=new Main_method_overloading();
		System.out.println("This is main method");
		obj.main();
		obj.main(69);
	}
}
