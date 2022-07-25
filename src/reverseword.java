import java.util.Scanner;

public class reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String strarr[]=str.split(" ");
		String revsent="";
		for(int i=0;i<=strarr.length-1;i++) {
			String word = strarr[i];
			String revword ="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			revsent=revsent+revword+" ";
		}
		System.out.println(revsent);
	}

}
