package mobileStore;

import java.util.ArrayList;
import java.util.Scanner;

public class retailer {
	Scanner input = new Scanner(System.in);
	//fields or properties
	String sim;
	int quantity;
	float totalPrice;
	int discount;
	Inventory i= new Inventory();
	ArrayList<itemDetails> item= i.getItems();
	ArrayList<customer> customers = i.getCustDetails();
	
	//selling a sim method
	public void sellItem()
	{
		
		
		System.out.println("enter a sim from the below where customer wants to buy");
		System.out.println("------------------------------------");
		for(itemDetails s : item)
		{
			System.out.println(s.getItemName());
		}
		
		sim = input.nextLine();
		System.out.println("enter how many sims you need?");
		quantity = input.nextInt();
		
		for(itemDetails s1 : item)
		{
			if(s1.getItemName().equals(sim))
			{
				if(s1.getStockLeft()>quantity)
				{
					totalPrice = s1.getPrice()*quantity;
					int itemLeft = s1.getStockLeft()-quantity;
					s1.setStockLeft(itemLeft);
				}
				else
				{
					System.out.println("Stock Left is only:" + s1.getStockLeft());
				}
				break;
			}
		
		}
		custoInfo();
		
	}
	//take customer information after choosing a sim card
	public void custoInfo()
	{
		if(totalPrice>0)
		{
			String custIdCheck ="";
			System.out.println("enter the customer ID");
			String custId = input.next();
			
			for(customer c : customers)
			{
				if(c.getID().equals(custId))
				{
					custIdCheck = custId;
					System.out.println("Regular Customer so giving away 10% discount");
					break;
				}
				
			}
			if(!custIdCheck.equals(""))
			{
				discount =10;
				calculatePrice(discount);
			}
			else
			{
				discount =0;
				calculatePrice(discount);
			}
			
		}
		else
		{
			System.out.println("So please order some other Sim");
			sellItem();
		}
		
		
		
	}
	//calculateTotalPrice method
	public void calculatePrice(float discount)
	{
		
		float inoviceBill = totalPrice - (totalPrice*discount/100);
		System.out.println("Total Amount to be paid by the customer after discount : " +inoviceBill);
		
		
	}
}
