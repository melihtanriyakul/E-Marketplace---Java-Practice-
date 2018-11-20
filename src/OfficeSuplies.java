/**
 * This is a subclass derived from Item
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class OfficeSuplies extends Item{
	private String sReleaseDate;
	private String sCoverTitle;
	
	public String getsReleaseDate() {
		return sReleaseDate;
	}
	public void setsReleaseDate(String sReleaseDate) {
		this.sReleaseDate = sReleaseDate;
	}
	public String getsCoverTitle() {
		return sCoverTitle;
	}
	public void setsCoverTitle(String sCoverTitle) {
		this.sCoverTitle = sCoverTitle;
	}
	
	
}
