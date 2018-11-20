/**
 * This is Campaign class.
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Campaign {
	private String sStartDate;
	private String sEndDate;
	private String sItemType;
	private int iDiscountRate;
	public static final double MAX_DISCOUNT_RATE = 50;
	/**
	 * @param startDate The day which the campaign starts on
	 * @param endDate The day which the campaign ends on
	 * @param itemType The type of item which has campaign
	 * @param discountRate The discount rate of the campaign
	 * 
	 * */
	public Campaign(String startDate, String endDate, String itemType, int discountRate) {
		this.setsStartDate(startDate);
		this.setsEndDate(endDate);
		this.setsItemType(itemType);
		this.setiDiscountRate(discountRate);
	}
	/**
	 * Intended for debugging.
	 * @return The contents of every informations of the campaign
	 * 
	 * */
	public String toString(){
		return (getiDiscountRate() + " sale of " + getsItemType() + " until " + getsEndDate());
	}
	public String getsStartDate() {
		return sStartDate;
	}
	public void setsStartDate(String sStartDate) {
		this.sStartDate = sStartDate;
	}
	public String getsEndDate() {
		return sEndDate;
	}
	public void setsEndDate(String sEndDate) {
		this.sEndDate = sEndDate;
	}
	public String getsItemType() {
		return sItemType;
	}
	public void setsItemType(String sItemType) {
		this.sItemType = sItemType;
	}
	public static double getMaxDiscountRate() {
		return MAX_DISCOUNT_RATE;
	}
	public int getiDiscountRate() {
		return iDiscountRate;
	}
	public void setiDiscountRate(int iDiscountRate) {
		this.iDiscountRate = iDiscountRate;
	}
	

}
