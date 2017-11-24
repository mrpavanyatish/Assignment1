package mobileStore;

public class itemDetails {
	//properties of a item
	private String itemNo;
	private String itemName;
	private int stockLeft;
	private float price;
	
	//constructor 
	public itemDetails(String itemNo, String itemName, int stockLeft, float price) {
		
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.stockLeft = stockLeft;
		this.price = price;
	}


	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getStockLeft() {
		return stockLeft;
	}

	public void setStockLeft(int stockLeft) {
		this.stockLeft = stockLeft;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	// getters and setters
	
	
}
