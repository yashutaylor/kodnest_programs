import java.util.Iterator;
import java.util.Scanner;

public class araay_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and colns");
		int arr[][]= new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Enter values into array");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
