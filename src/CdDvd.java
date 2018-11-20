/**
 * This is a subclass derived from OfficeSuplies
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * 
 * */
public class CdDvd extends OfficeSuplies{
	private static int iStockForCdDvd = 0;
	private String sComposer;
	private String sSongs;
	/**
	 * @param price Cd or Dvd's price
	 * @param releaseDate The release date of Cd or Dvd
	 * @param coverTitle The cover title of Cd or Dvd
	 * @param composerName The composer name of Cd or Dvd
	 * @param songs The songs which Cd or Dvd contains
	 * */
	public CdDvd(double price, String releaseDate, String coverTitle, String composerName, String songs) {
		this.setdPrice(price);
		this.setsReleaseDate(releaseDate);
		this.setsCoverTitle(coverTitle);
		this.setsComposer(composerName);
		this.setsSongs(songs);
		iStockForCdDvd++;
		this.setsID();
		this.setsType("CDDVD");
	}
	/**
	 * Intended for debugging.
	 * @return The contents of every informations of Dvd or Cd*/
	public String toString() {
		return("-----------------------\n"
				+ "Type: CDDVD\n" + "Item ID: " + getsID() + "\n"
				+ "Price: " + getdPrice() + " $ \n"
				+ "Release Date: " + getsReleaseDate() + "\n"
				+ "Title: " + getsCoverTitle() + "\n"
				+ "Songs: " + getsSongs() + "\n"
				+ "Composer: " + getsComposer() + "\n");
		}
	
	public static int getiStockForCdDvd() {
		return iStockForCdDvd;
	}

	public static void setiStockForCdDvd(int iStockForCdDvd) {
		CdDvd.iStockForCdDvd = iStockForCdDvd;
	}

	public String getsComposer() {
		return sComposer;
	}
	public void setsComposer(String sComposer) {
		this.sComposer = sComposer;
	}
	public String getsSongs() {
		return sSongs;
	}
	public void setsSongs(String sSongs) {
		this.sSongs = sSongs;
	}
	

}
