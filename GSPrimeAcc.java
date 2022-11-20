package com.tns.goshopping;

import com.tns.goshopping.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	//fields
	private static final float charges=0; 
	
	//methods
	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Hello Primeuser, Your Product Charges are: "+charges);
	}

	
	
	@Override
	public String toString() {
		return "GSPrime Account Details are:-\nAccount Number-\t\t"+"123"+"\nAccount holder Name-\t"+"shamanth"+"\nDelivery charges\t"+charges;
	}
}