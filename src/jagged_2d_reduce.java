import java.util.Iterator;
import java.util.Scanner;

public class jagged_2d_reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st dimension length");
		int arr[][]=new int[sc.nextInt()][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter 2nd dimenson length of 1st dimension "+i);
			arr[i]= new int[sc.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print("Enter marks of clg "+i+"and student "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
				//arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}	
	}

}
