package com.kodnest.prgms;

public class Singleton_Design_pattern {
// restrict  to only create one object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PrimeMinister.getObject());
		System.out.println(PrimeMinister.getObject());
		System.out.println(PrimeMinister.getObject());
	}

}
class PrimeMinister{
	static PrimeMinister pMinister=null;
	private PrimeMinister() {
		
	}
	static public PrimeMinister getObject() {
		if(pMinister==null) {
			pMinister=new PrimeMinister();
			return pMinister;
		}
		else {
			return pMinister;
		}
	}
}