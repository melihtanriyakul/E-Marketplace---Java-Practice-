/**
 * This is a subclass derived from Computer
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Desktop extends Computer{
	private static int iStockForDesktop = 0;
	private String sBoxColor;
	
	public Desktop(double cost, String manufacturer, String brand, int maxVolt, int maxWatt, String operatingSystem,
			String CPUType, int ramCapacity, int HDDCapacity, String boxColor ) {
		this.setdPrice(cost);
		this.setsManufacturer(manufacturer);
		this.setsBrand(brand);
		this.setiMaxVolt(maxVolt);
		this.setiMaxWatt(maxWatt);
		this.setsOP(operatingSystem);
		this.setsCPUType(CPUType);
		this.setiRamCapacity(ramCapacity);
		this.setiHDDCapacity(HDDCapacity);
		this.sBoxColor = boxColor;
		this.setsID();
		iStockForDesktop++;
		this.setsType("Desktop");
	}
	/**
	 * Intended for debugging
	 * @return The contents of every informations of the Desktop items
	 * */
	public String toString() {
		return ("-----------------------\n"
				+ "Type: Desktop\n" + "Item ID: " + getsID() + "\n"
				+ "Price: " + getdPrice() + " $ \n"
				+ "Manufacturer: " + getsManufacturer() + "\n"
				+ "Brand: " + getsBrand() + "\n"
				+ "Max Volt: " + getiMaxVolt() + " V.\n"
				+ "Max Watt: " + getiMaxWatt() + " W.\n"
				+ "Operating System: " + getsOP() + "\n"
				+ "CPU Type: " + getsCPUType() + "\n"
				+ "RAM Capacity: " + getiRamCapacity() + " GB.\n"
				+ "HDD Capacity: " + getiHDDCapacity() + " GB.\n"
				+ "Box Color: " + getsBoxColor() + "\n");
	}

	
	public static int getiStockForDesktop() {
		return iStockForDesktop;
	}
	public static void setiStockForDesktop(int iStockForDesktop) {
		Desktop.iStockForDesktop = iStockForDesktop;
	}
	public String getsBoxColor() {
		return sBoxColor;
	}

	public void setsBoxColor(String sBoxColor) {
		this.sBoxColor = sBoxColor;
	}
	
	
}
