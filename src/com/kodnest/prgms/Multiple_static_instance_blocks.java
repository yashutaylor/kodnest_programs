package com.kodnest.prgms;

public class Multiple_static_instance_blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Multiple_static_instance_blocks objBlocks=new Multiple_static_instance_blocks();
	System.out.println("this is main method after static and instance blocks");
}

	static {
		System.out.println("this is static 1");
	}
	static {
		System.out.println("this is static 2");
	}
	static {
		System.out.println("this is static 3");
	}
	{
		System.out.println("this is instance block 1");
	}
	static {
		System.out.println("this is static 4");
	}
	{
		System.out.println("this is instance block 2");
	}
	


}
