import java.util.Scanner;

public class Substring_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string : ");
		String str=sc.nextLine();
		System.out.println("enter start index");
		int a=sc.nextInt();
		sub_string obj=new sub_string();
	System.out.println(obj.Substring(str, a));
	System.out.println("enter end index");
	int b=sc.nextInt();
	System.out.println(obj.Substring(str,a,b));
	}
}
class sub_string{
	String Substring(String str1,int start_index) {
		char ch[]=str1.toCharArray();
		char  ch2[]= new char[ch.length-start_index]; 
		int j=0;
		for(int i=start_index;i<=ch.length-1;i++) {
			ch2[j]=ch[i];
			j++;
		}
		String s=new String(ch2);
		return s;
	}
	String Substring(String str,int start_index,int end_index) {
		char ch[]=str.toCharArray();
		char  ch2[]= new char[end_index-start_index+1]; 
		int j=0;
		for(int i=start_index;i<=end_index;i++) {
			ch2[j]=ch[i];
			j++;
		}
		String s=new String(ch2);
		return s;
	}
}