import java.util.Scanner;

public class GCD_of_2_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		GCD obj=new GCD();
		System.out.print(obj.find_gcd(a,b));
		
	}

}
