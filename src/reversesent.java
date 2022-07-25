import java.util.Scanner;

public class reversesent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter String");
		String str=sc.nextLine();
		String strarr[]= str.split(" ");
		String revsentString="";
		for(int i=strarr.length-1;i>=0;i--) {
			revsentString = revsentString+strarr[i]+" ";
		}
		System.out.println(revsentString);
	}

}
