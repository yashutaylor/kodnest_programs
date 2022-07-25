import java.util.Scanner;

public class kodnestAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number of Teams");
		float arr[][]=new float[sc.nextInt()][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter number of Players in Team : "+i);
			arr[i]= new float[sc.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print("Enter height of student "+j+" from team "+i);
				arr[i][j]=sc.nextFloat();
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}	
	}

}
