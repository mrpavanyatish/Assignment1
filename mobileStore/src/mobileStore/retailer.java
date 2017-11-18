package mobileStore;

import java.util.Scanner;

public class retailer {
	Scanner input = new Scanner(System.in);
	String item;
	float price;

	public void sellItem()
	{
		
		System.out.println("please enter item to sell");
		item = input.nextLine();
		System.out.println("Enter the price for the above item");
		price = input.nextFloat();
		checkPrice(price);
		
	}
	
	public void checkPrice(float price)
	{
		if(price<100)
		{
			System.out.println("item sold");
		}
		else
		{
			System.out.println("the price of item is more than 100. so need to check ID card");
		}
		
	}
}
