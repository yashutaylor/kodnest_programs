import java.util.Scanner;

public class space$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scanner.nextLine();
		char ch1[]=str.toCharArray();
		char ch2[]=new char[ch1.length];
		for(int i=0;i<=ch1.length-1;i++) {
			if(ch1[i]==' ') {
				ch2[i]='$';
			}
		}
	//	int j=ch2.length-1;
		for(int i=0;i<=ch1.length-1;i++) {
			if(ch1[i]==' ')
				i++;
			ch2[i]=ch1[i];
		}
		String st2=new String(ch2);
		System.out.println(st2);
}

}
