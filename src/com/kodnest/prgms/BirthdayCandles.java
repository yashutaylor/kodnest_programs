package com.kodnest.prgms;

import java.util.Iterator;
import java.util.Scanner;

public class BirthdayCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array");
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("no of candles blowed are :");
		System.out.print(candlesblowed(a));
	}
	static int candlesblowed(int arr[]){
		int count=0;
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(max==arr[i])
				count++;
		}
		return count;
	}

}
