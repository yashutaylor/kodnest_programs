import java.util.Scanner;

public class jagged_3darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length of the array");
		int arr[][][]=new int[sc.nextInt()][][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter 2nd dimension of 1st "+i);
			arr[i]=new int[sc.nextInt()][];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("enter 3rd dimension lenght for first dimension "+i+"and second dimension "+j);
				arr[i][j]=new int[sc.nextInt()];
			}
		}
		System.out.println("enter elements");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
