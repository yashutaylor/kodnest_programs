import java.util.Iterator;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no array length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter elements into array");
		for(int i =0;i<=arr.length-1;i++) {
			//System.out.println("enter elements into array");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
