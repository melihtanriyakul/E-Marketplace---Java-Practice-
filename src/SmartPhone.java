/**
 * This is a subclass derived from Electronic
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class SmartPhone extends Electronic{
	private static int iStockForSmartPhone = 0;
	private String sScreenType;

	public SmartPhone(double cost, String manufacturer, String brand, int maxVolt, int maxWatt, String screenType) {
		this.setdPrice(cost);
		this.setsManufacturer(manufacturer);
		this.setsBrand(brand);
		this.setiMaxVolt(maxVolt);
		this.setiMaxWatt(maxWatt);
		this.sScreenType = screenType;
		iStockForSmartPhone++;
		this.setsID();
		this.setsType("SmartPhone");

		
	}
	/**
	 * Intended for debugging
	 * @return The contents of every informations of SmartPhone items
	 * */
	public String toString() {
		return ("-----------------------\n"
				+ "Type: SmartPhone\n" + "Item ID: " + getsID() + "\n"
				+ "Price: " + getdPrice() + " $ \n"
				+ "Manufacturer: " + getsManufacturer() + "\n"
				+ "Brand: " + getsBrand() + "\n"
				+ "Max Volt: " + getiMaxVolt() + " V.\n"
				+ "Max Watt: " + getiMaxWatt() + " W.\n"
				+ "Screen Type: " + getsScreenType() + "\n");
	}
	public String getsScreenType() {
		return sScreenType;
	}

	public void setsScreenType(String sScreenType) {
		this.sScreenType = sScreenType;
	}
	public static int getiStockForSmartPhone() {
		return iStockForSmartPhone;
	}
	public static void setiStockForSmartPhone(int iStockForSmartPhone) {
		SmartPhone.iStockForSmartPhone = iStockForSmartPhone;
	}

}
