package com.tns.goshopping;

import com.tns.goshopping.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharge, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges)
	{
		System.out.println("Hello Normaluser, Your Charges are: "+charges+"\nDelivery Charges is: "+deliveryCharge);
		System.out.print("Total:-\t");
		System.out.println(charges+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormal Account Details are:-\nAccount Number-\t" + getAccNo() + "\nAccount Name-\t"+getAccNm()+"\nCharges -\t" + getCharges();
	}
}