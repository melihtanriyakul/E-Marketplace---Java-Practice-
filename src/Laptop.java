/**
 * This is a subclass derived from Computer
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Laptop extends Computer{
	private static int iStockForLaptop = 0;
	private String sHDMISupported;

	public Laptop(double cost, String manufacturer, String brand, int maxVolt, int maxWatt, String operatingSystem,
			String CPUType, int ramCapacity, int HDDCapacity, int hdmiSupport) {
		this.setdPrice(cost);
		this.setsManufacturer(manufacturer);
		this.setsBrand(brand);
		this.setiMaxVolt(maxVolt);
		this.setiMaxWatt(maxWatt);
		this.setsOP(operatingSystem);
		this.setsCPUType(CPUType);
		this.setiRamCapacity(ramCapacity);
		this.setiHDDCapacity(HDDCapacity);
		if (hdmiSupport == 1)
			this.sHDMISupported = "Yes";
		else 
			this.sHDMISupported = "No";
		iStockForLaptop++;
		this.setsID();
		this.setsType("Laptop");

	}
	/**
	 * Intended for debugging
	 * @return The contents of every informations of Laptop items
	 * */
	public String toString() {
		return ("-----------------------\n"
				+ "Type: Laptop\n" + "Item ID: " + getsID() + "\n"
				+ "Price: " + getdPrice() + " $ \n"
				+ "Manufacturer: " + getsManufacturer() + "\n"
				+ "Brand: " + getsBrand() + "\n"
				+ "Max Volt: " + getiMaxVolt() + " V.\n"
				+ "Max Watt: " + getiMaxWatt() + " W.\n"
				+ "Operating System: " + getsOP() + "\n"
				+ "CPU Type: " + getsCPUType() + "\n"
				+ "RAM Capacity: " + getiRamCapacity() + " GB.\n"
				+ "HDD Capacity: " + getiHDDCapacity() + " GB.\n"
				+ "HDMI Support: " + getsHDMISupported()  + "\n");
	}
	public static int getiStockForLaptop() {
		return iStockForLaptop;
	}
	public static void setiStockForLaptop(int iStockForLaptop) {
		Laptop.iStockForLaptop = iStockForLaptop;
	}
	public String getsHDMISupported() {
		return sHDMISupported;
	}
	public void setsHDMISupported(String sHDMISupported) {
		this.sHDMISupported = sHDMISupported;
	}

}
