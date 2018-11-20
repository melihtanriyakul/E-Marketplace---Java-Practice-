/**
 * This is a superclass
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Item {
	private static int iIdCountForItems = 1;
	private int iID;
	private double dPrice;
	private int iStock;
	private String sType = "Item"; 

	
	
	public String getsType() {
		return sType;
	}
	public void setsType(String sType) {
		this.sType = sType;
	}
	public int getiStock() {
		return iStock;
	}
	public void setiStock(int iStock) {
		this.iStock = iStock;
	}
	public int getsID() {
		return iID;
	}
	public void setsID() {
		this.iID = iIdCountForItems;
		iIdCountForItems++;
	}
	public double getdPrice() {
		return dPrice;
	}
	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}
	

}
