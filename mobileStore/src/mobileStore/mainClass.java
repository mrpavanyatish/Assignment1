package mobileStore;


import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		
		// object creation for retailer and using default constructor
		adminAndRetailerLogin retailer= new adminAndRetailerLogin();
		adminAndRetailerLogin admin= new adminAndRetailerLogin("pavan","1234");

		
		retailer.login();
		String selection="";
		while(!selection.equals("x"))
		{
			System.out.println("enter 1 as a retailer");
			System.out.println("enter 2 for admin");
			System.out.println("enter 3 to logout");
			selection = input.nextLine();
			
			if(selection.equals("1"))
			{
				System.out.println("please enter your name");
				retailer.name=input.nextLine();
				System.out.println("please enter your password");
				retailer.password=input.nextLine();
				
				retailer.login();
			}
			else if(selection.equals("2"))
			{
				System.out.println("please enter your name");
				admin.name=input.nextLine();
				System.out.println("please enter your password");
				admin.password=input.nextLine();
				
				//object creation for admin by passing the values to the parametrized constructor
				admin.login(admin.name, admin.password);
			}
			else if(selection.equals("x"))
			{
				System.out.println("bye bye");
			}
			else
			{
				System.out.println("please enter the correct number");
			}
		}
		
		input.close();

	}

}
