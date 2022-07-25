import java.util.Scanner;

public class searching_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		
		charr obl= new charr();
	System.out.println(obl.finding_char(str));
	}

}
 class charr{
	boolean finding_char(String str) {
			char ch[] = str.toCharArray();
			for(int i=0;i<=ch.length-1;i++) {
				if(ch[i]=='y'||ch[i]=='y') {
					
					return true;
					
				}
			}
			return false;
	}
}