package com.kodnest.prgms;

import java.util.Scanner;

public class Reversenumber_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number");
		int num=sc.nextInt();
		
		System.out.println("reverse of the number is "+Reverse.revNum(num));
	
	}

}
