package com.masai.Problem1;

//import java.util.Date;
import java.sql.Date;

public class HolidayPackage {

	private String package_name;  // "Way to Hawai"
	private Tourist tourist; 
	private Date package_expiry;
	private int package_price;
	
	
	   public void setPackage_name(String package_name) {
		this.package_name = package_name;
	    }

		public void setTourist(Tourist tourist) {
			this.tourist = tourist;
		}
	
		public void setPackage_expiry(Date package_expiry) {
			this.package_expiry = package_expiry;
		}
	
		public void setPackage_price(int package_price) {
			this.package_price = package_price;
		}



	public void showDetails(){
		System.out.println("Package Name is :"+package_name);
		System.out.println("Package Expiry Date is :"+package_expiry);
		System.out.println("Package Price: "+package_price);
		System.out.println("Holiday Package register by Tourist is :"+tourist);
		}
}
