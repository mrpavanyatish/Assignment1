package mobileStore;

import java.util.Scanner;

public class admin {
	
	Scanner input = new Scanner(System.in);
	String name;
	String email;
	int phoneNumber;
	
	public void givePermissionToRetailer()
	{
		System.out.println("Enter the name of Retailer");
		name = input.nextLine();
		System.out.println("Enter the email address");
		email= input.nextLine();
		System.out.println("enter the phone number");
		phoneNumber = input.nextInt();
		
		check();
		
	}
	
	public void check()
	{
		if(this.name.equals(null) && this.email.equals(null) && this.phoneNumber==0)
		{
			System.out.println("Please check your name or email or phone Number");
		}
	}

}
