package com.kodnest.prgms;

import java.util.Iterator;
import java.util.Scanner;

public class Diff_bwn_diagonal {

	public static void main(String...y) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix size(sqr matrix)");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		System.out.print("enter elements ");
		for(int  i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int rightsum=0,leftsum=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
			rightsum=rightsum+ arr[i][i];
			leftsum= leftsum+ arr[i][size-i-1];
			}
		}
		System.out.print(Math.abs(leftsum-rightsum));
	}

}
