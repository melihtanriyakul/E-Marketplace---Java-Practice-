/**
 * This is a subclass derived from Item
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Electronic extends Item{
	private int iMaxVolt;
	private int iMaxWatt;
	private String sManufacturer;
	private String sBrand;
	
	
	public int getiMaxVolt() {
		return iMaxVolt;
	}
	public void setiMaxVolt(int sMaxVolt) {
		this.iMaxVolt = sMaxVolt;
	}
	public int getiMaxWatt() {
		return iMaxWatt;
	}
	public void setiMaxWatt(int sMaxWatt) {
		this.iMaxWatt = sMaxWatt;
	}
	public String getsManufacturer() {
		return sManufacturer;
	}
	public void setsManufacturer(String sManufacturer) {
		this.sManufacturer = sManufacturer;
	}
	public String getsBrand() {
		return sBrand;
	}
	public void setsBrand(String sBrand) {
		this.sBrand = sBrand;
	}

}
