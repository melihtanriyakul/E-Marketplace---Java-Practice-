/**
 * This is a subclass derived from Cosmetic
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class HairCare extends Cosmetic{	
	private static int iStockForHairCare = 0;
	private String sMedicated;

	public HairCare(double cost, String manufacturer, String brand, int isOrganic , int expirationDate, int weight, int isMedicated) {
		this.setdPrice(cost);
		this.setsManufacturer(manufacturer);
		this.setsBrand(brand);
		if (isOrganic == 1)
			this.setsOrganic("Yes");
		else
			this.setsOrganic("No");
		this.setiExpirationData(expirationDate);
		this.setiWeight(weight);
		if (isMedicated == 1)
			this.setsMedicated("Yes");
		else
			this.setsMedicated("No");
		iStockForHairCare++;
		this.setsID();
		this.setsType("HairCare");

	}
	/**
	 * Intended for debugging
	 * @return The contents of every informations of HairCare items
	 * */
	public String toString() {
		return ("-----------------------\n"
				+ "Type: HairCare\n" + "Item ID: " + getsID() + "\n"
				+ "Price: " + getdPrice() + " $ \n"
				+ "Manufacturer: " + getsManufacturer() + "\n"
				+ "Brand: " + getsBrand() + "\n"
				+ "Organic: " + getsOrganic() + " V.\n"
				+ "Expiration Date: " + getiExpirationData() + " W.\n"
				+ "Weight: " + getiWeight() + " g.\n"
				+ "Medicated: " + getsMedicated() + "\n");
	}
	public static int getiStockForHairCare() {
		return iStockForHairCare;
	}
	public static void setiStockForHairCare(int iStockForHairCare) {
		HairCare.iStockForHairCare = iStockForHairCare;
	}

	public String getsMedicated() {
		return sMedicated;
	}
	public void setsMedicated(String sMedicated) {
		this.sMedicated = sMedicated;
	}
	
}
