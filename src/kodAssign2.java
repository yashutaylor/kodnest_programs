import java.util.Scanner;

public class kodAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of branches");
		String arr[][][]=new String[sc.nextInt()][][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter number of banks in branch number : "+i);
			arr[i]=new String[sc.nextInt()][];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("enter number of customers in bank "+j+" of branch"+i);
				arr[i][j]=new String[sc.nextInt()];
			}
		}
		System.out.println("enter names of customers");
		sc.nextLine();
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					arr[i][j][k]=sc.nextLine();
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+"   ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
