package mobileStore;

public class adminAndRetailerLogin {
	
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
			System.out.println("please login");
		}
	}
	

	//admin login
	public void login(String name, String password)
	{
		System.out.println("Welcome admin " + name);
		System.out.println("You have logged in as a Admin");
	}

}