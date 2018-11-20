/**
 * This is a subclass derived from Item
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Cosmetic extends Item{
	private int iExpirationData;
	private int iWeight;
	private String sOrganic;
	private String sManufacturer;
	private String sBrand;
	
	
	public int getiExpirationData() {
		return iExpirationData;
	}
	public void setiExpirationData(int iExpirationData) {
		this.iExpirationData = iExpirationData;
	}
	public int getiWeight() {
		return iWeight;
	}
	public void setiWeight(int iWeight) {
		this.iWeight = iWeight;
	}
	public String getsOrganic() {
		return sOrganic;
	}
	public void setsOrganic(String sOrganic) {
		this.sOrganic = sOrganic;
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
