package com.tns.goshopping;
import com.tns.goshopping.GSNormalAcc;
import com.tns.goshopping.GSPrimeAcc;
import com.tns.goshopping.GSShopFactory;

public class Shamanthproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSShopFactory GSSF = new GSShopFactory();
		GSSF.getNewPrimeAccount(123, "Shamanth", 999, false);           //giving the values
		GSSF.getNewNormalAccount(124, "shamanthdivakar", 1799, 99);     //giving the values
		
		
		// Step 2
		GSPrimeAcc GSp = new GSPrimeAcc();   //creating GSp
		GSp.getAccNm();
		GSp.getAccNo();
		GSp.getCharges();
		// Step 3
		GSp.bookProduct(999);
		
		
		String Info = GSp.toString();  //creating info
		System.out.println(Info);
		
		//step 4
		GSNormalAcc GSn = new GSNormalAcc(); //creating GSn
		GSn.getAccNm();
		GSn.getAccNo();
		GSn.getCharges();
		GSn.getDeliveryCharge();
		
		//step 5
		
		GSn.bookProduct(1799);

		String Info2=GSn.toString(); //creating info2
	
		System.out.println(Info2);
		System.out.println("Thank you visit again"); //the finish line

	}

}
	

