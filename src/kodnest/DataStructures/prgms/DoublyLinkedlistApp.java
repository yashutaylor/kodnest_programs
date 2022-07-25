package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class DoublyLinkedlistApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DoublyLinkedlist obj=new DoublyLinkedlist();
		while(true) {
			System.out.println("press 1-------> insertFront");
			System.out.println("press 2------->deleteFront");
			System.out.println("press 3------->inser Rear");
			System.out.println("press 4------->delete Rear");
			System.out.println("press 5------->displayForward");
			System.out.println("press 6------->displayReverse");
			System.out.println("press any other number to exit");
			
			switch(sc.nextInt()) {
				case 1: obj.insertFront();break;
				case 2: obj.deleteFront();break;
				case 3: obj.insertRear();break;
				case 4: obj.deleteRear();break;
				case 5: obj.displayForward();break;
				case 6: obj.displayReverse();break;
				default:System.exit(69);
			}
		}
	}
}
