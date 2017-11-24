package mobileStore;

import java.util.ArrayList;

public class adminAndRetailerLogin {
	
	ArrayList<itemDetails> a = new ArrayList<itemDetails>();
	a.add(new itemDetails("Aasdas","Adsasd",1,1.0f));
	
	

	// instance variables
	String name;
	String password;
	
	
	//default constructor
	public adminAndRetailerLogin() {
		
	}
	
	//parametrized constructor

	public adminAndRetailerLogin(String name, String password) {
		this.name = name;
		this.password = password;
	}

	
// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


//2 Login is used to check the over loading concept
	//retailer login
	public void login()
	{
		if(name!=null && password!=null)
		{
			System.out.println("Welcome retailer " + name);
			System.out.println("You have logged in as a Retailer");
			
			
			
			
		}
		else
		{
			System.out.println("Name and Password cannot be NUll so please Log ini");
		}
	}
	

	//admin login
	public void login(String name, String password)
	{
		System.out.println("Welcome admin " + name);
		System.out.println("You have logged in as a Admin");
	}

}
