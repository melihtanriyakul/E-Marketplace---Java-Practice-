/**
 * This is a subclass derived from Computer
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Tablet extends Computer{
	private static int iStockForTablet = 0;
	private int iDimension;

	public Tablet(double cost, String manufacturer, String brand, int maxVolt, int maxWatt, String operatingSystem,
			String CPUType, int ramCapacity, int HDDCapacity, int dimension ) {
		this.setdPrice(cost);
		this.setsManufacturer(manufacturer);
		this.setsBrand(brand);
		this.setiMaxVolt(maxVolt);
		this.setiMaxWatt(maxWatt);
		this.setsOP(operatingSystem);
		this.setsCPUType(CPUType);
		this.setiRamCapacity(ramCapacity);
		this.setiHDDCapacity(HDDCapacity);
		this.iDimension = dimension;
		iStockForTablet++;
		this.setsID();
		this.setsType("Tablet");

		
	}
	/**
	 * Intended for debugging
	 * @return The contents of every informations of Tablet items
	 * */
	public String toString() {
		return ("-----------------------\n"
				+ "Type: Tablet\n" + "Item ID: " + getsID() + "\n"
				+ "Price: " + getdPrice() + " $ \n"
				+ "Manufacturer: " + getsManufacturer() + "\n"
				+ "Brand: " + getsBrand() + "\n"
				+ "Max Volt: " + getiMaxVolt() + " V.\n"
				+ "Max Watt: " + getiMaxWatt() + " W.\n"
				+ "Operating System: " + getsOP() + "\n"
				+ "CPU Type: " + getsCPUType() + "\n"
				+ "RAM Capacity: " + getiRamCapacity() + " GB.\n"
				+ "HDD Capacity: " + getiHDDCapacity() + " GB.\n"
				+ "Dimension: " + getiDimension() + " in.\n");
	}
	public static int getiStockForTablet() {
		return iStockForTablet;
	}
	public static void setiStockForTablet(int iStockForTablet) {
		Tablet.iStockForTablet = iStockForTablet;
	}
	public int getiDimension() {
		return iDimension;
	}
	public void setiDimension(int iDimension) {
		this.iDimension = iDimension;
	}

	

}
