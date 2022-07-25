package com.kodnest.prgms;

import java.util.Iterator;

public class Sorting {
	public static void  sort(Student a[]){
		Student temp;
		for(int i=0;i<=a.length-2;i++) {
			for(int j=0;j<=a.length-2-i;j++) {
				if(a[j].getAge()>a[j+1].getAge()) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	
	}
	
}
