package mobileStore;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		// object creation for retailer and using default constructor
		
		adminAndRetailerLogin retailer= new adminAndRetailerLogin();
		retailer.login();
		
		System.out.println("Please enter username for a retailer");
		retailer.name = input.nextLine();
		
		System.out.println("Please enter the passwrod for a retailer");
		retailer.password = input.nextLine();
		
		retailer.login();
		
		
		//object creation for admin by passing the values to the parametrized constructor
		adminAndRetailerLogin admin= new adminAndRetailerLogin("pavan","1234");
		admin.login(admin.getName(), admin.getPassword());
		
		
		

	}

}
