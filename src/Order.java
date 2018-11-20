import java.util.Date;
/**
 * This is a superclass
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Order {
	private Date sOrderDate;
	private double dTotalCost;
	private int iNumOfPurchasedItems;
	private int iCustomerID;
	
	public Order(Date sOrderDate, double dTotalCost, int iNumOfPurchasedItems, int iCustomerID) {
		this.sOrderDate = sOrderDate;
		this.dTotalCost = dTotalCost;
		this.iNumOfPurchasedItems = iNumOfPurchasedItems;
		this.iCustomerID = iCustomerID;
	}
	
	public Date getsOrderDate() {
		return sOrderDate;
	}

	public void setsOrderDate(Date sOrderDate) {
		this.sOrderDate = sOrderDate;
	}

	public double getdTotalCost() {
		return dTotalCost;
	}

	public void setdTotalCost(double dTotalCost) {
		this.dTotalCost = dTotalCost;
	}

	public int getiNumOfPurchasedItems() {
		return iNumOfPurchasedItems;
	}

	public void setiNumOfPurchasedItems(int iNumOfPurchasedItems) {
		this.iNumOfPurchasedItems = iNumOfPurchasedItems;
	}

	public int getsCustomerID() {
		return iCustomerID;
	}

	public void setsCustomerID(int iCustomerID) {
		this.iCustomerID = iCustomerID;
	}
	/**
	 * Intended for debugging
	 * @return The contents of every informations of Orders
	 * */
	public String toString(){
		return ("Order Date: " + sOrderDate + "	Customer ID: " + iCustomerID + "	Total Cost: " + dTotalCost + "	Number of purchased items: " + iNumOfPurchasedItems	);
		
	}
	

}
