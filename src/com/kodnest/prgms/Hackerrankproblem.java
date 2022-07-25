package com.kodnest.prgms;

import java.util.Scanner;

public class Hackerrankproblem {

	public static void main(String...y) {
		// TODO Auto-generated method stub
		System.out.print("enter size of array");
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[sc.nextInt()];
		System.out.println("enter elements into array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int minsum=0;
		for(int i=0;i<=arr.length-2;i++) {
			minsum=minsum+arr[i];
		}
		System.out.println("the minimum sum of the array by removing one element"+ minsum);
		int maxsum=0;
		for(int i=1;i<=arr.length-1;i++) {
			maxsum=maxsum+arr[i];
		}
		System.out.println("the maximum sum of the array by removing one element"+ maxsum);
	}

}
