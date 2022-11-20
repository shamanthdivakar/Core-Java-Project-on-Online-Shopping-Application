package com.tns.goshopping;

public interface ShopFactory {
	public abstract PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime); //defining parameters
	public abstract NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges); //defining parameters
}