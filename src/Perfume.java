/**
 * This is a subclass derived from Cosmetic
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Perfume extends Cosmetic{
	private static int iStockForPerfume= 0;
	private int iLastingDuration;
	public Perfume(double cost, String manufacturer, String brand, int isOrganic , int expirationDate, int weight, int lastingDuration) {
		this.setdPrice(cost);
		this.setsManufacturer(manufacturer);
		this.setsBrand(brand);
		if (isOrganic == 1)
			this.setsOrganic("Yes");
		else
			this.setsOrganic("No");
		this.setiExpirationData(expirationDate);
		this.setiWeight(weight);
		this.setiLastingDuration(lastingDuration);
		iStockForPerfume++;
		this.setsID();
		this.setsType("Perfume");

			
	}
	/**
	 * Intended for debugging
	 * @return The contents of every informations of Perfume items
	 * */
	public String toString() {
		return ("-----------------------\n"
				+ "Type: Perfume\n" + "Item ID: " + getsID() + "\n"
				+ "Price: " + getdPrice() + " $ \n"
				+ "Manufacturer: " + getsManufacturer() + "\n"
				+ "Brand: " + getsBrand() + "\n"
				+ "Organic: " + getsOrganic() + "\n"
				+ "Expiration Date: " + getiExpirationData() + "\n"
				+ "Weight: " + getiWeight() + " g.\n"
				+ "Lasting Duration: " + getiLastingDuration() + " min.\n");
	}
	public static int getiStockForPerfume() {
		return iStockForPerfume;
	}
	public static void setiStockForPerfume(int iStockForPerfume) {
		Perfume.iStockForPerfume = iStockForPerfume;
	}
	public int getiLastingDuration() {
		return iLastingDuration;
	}
	public void setiLastingDuration(int iLastingDuration) {
		this.iLastingDuration = iLastingDuration;
	}
}
