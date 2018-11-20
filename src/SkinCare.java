/**
 * This is a subclass derived from Cosmetic
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class SkinCare extends Cosmetic{
	private static int iStockForSkinCare = 0;
	private String sBabySensitive;

	public SkinCare(double cost, String manufacturer, String brand, int isOrganic , int expirationDate, int weight, int isBabySensitive) {
		this.setdPrice(cost);
		this.setsManufacturer(manufacturer);
		this.setsBrand(brand);
		if (isOrganic == 1)
			this.setsOrganic("Yes");
		else
			this.setsOrganic("No");
		this.setiExpirationData(expirationDate);
		this.setiWeight(weight);
		if (isBabySensitive == 1)
			this.setsBabySensitive("Yes");
		else
			this.setsBabySensitive("No");
		iStockForSkinCare++;
		this.setsID();
		this.setsType("SkinCare");

	}
	/**
	 * Intended for debugging
	 * @return The contents of every informations of SkinCare items
	 * */
	public String toString() {
		return ("-----------------------\n"
				+ "Type: SkinCare\n" + "Item ID: " + getsID() + "\n"
				+ "Price: " + getdPrice() + " $ \n"
				+ "Manufacturer: " + getsManufacturer() + "\n"
				+ "Brand: " + getsBrand() + "\n"
				+ "Organic: " + getsOrganic() + "\n"
				+ "Expiration Date: " + getiExpirationData() + "\n"
				+ "Weight: " + getiWeight() + " g.\n"
				+ "Baby Sensitive: " + getsBabySensitive() + "\n");
	}
	public String getsBabySensitive() {
		return sBabySensitive;
	}
	public void setsBabySensitive(String sBabySensitive) {
		this.sBabySensitive = sBabySensitive;
	}
	public static int getiStockForSkinCare() {
		return iStockForSkinCare;
	}
	public static void setiStockForSkinCare(int iStockForSkinCare) {
		SkinCare.iStockForSkinCare = iStockForSkinCare;
	}
	
	

}
