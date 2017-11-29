package mobileStore;

import java.util.ArrayList;

public class Inventory {
	
	static ArrayList<itemDetails> items = new ArrayList<>();
	static ArrayList<customer> custDetails = new ArrayList<>();
	public Inventory() {
		// TODO Auto-generated constructor stub
		this.addItems();
		this.addCustomer();
	}
	
	
	public ArrayList<itemDetails> getItems() {
		return items;
	}

	public void setItems(ArrayList<itemDetails> items) {
		this.items = items;
	}

	public ArrayList<customer> getCustDetails() {
		return custDetails;
	}

	public void setCustDetails(ArrayList<customer> custDetails) {
		this.custDetails = custDetails;
	}

	public void addItems()
	{
	    items.add(new itemDetails("A1","Aitel",100,10.00f));
	    items.add(new itemDetails("A2","BSNL",100,8.00f));
	    items.add(new itemDetails("A3","idea",100,6.00f));
	    items.add(new itemDetails("A4","jio",100,5.00f));
	    items.add(new itemDetails("A5","vodafone",100,4.00f));
	}
	
	public void addCustomer()
	{
		custDetails.add(new customer("C1","pavan","2001 gemini street","9844328395"));
		custDetails.add(new customer("C2","sunil","2002 gemini street","8277072996"));
		custDetails.add(new customer("C3","abhishek","2003 gemini street","9902705591"));
		custDetails.add(new customer("C4","rahul","2031 gemini street","3468889361"));
		custDetails.add(new customer("C5","ram","2021 gemini street","8712345678"));
		
	}
	

}
