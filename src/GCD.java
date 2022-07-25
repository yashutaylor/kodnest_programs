
public class GCD {

	
		// TODO Auto-generated method stub
		
			int find_gcd(int a,int b) {
				int rem;
				while(b!=0) {
					rem=a%b;
					a=b;
					b=rem;
				}
				return a;
			}
		
	}


