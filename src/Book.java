/**
 * This is the subclass derived from OfficeSuplies.
 * This class have the method, toString to print
 * the object's information.
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Book extends OfficeSuplies{
	private static int iStockForBook = 0;
	private String sPublisher;
	private String sAuthor;
	private int sNumberOfPages;
	/**
	 * @param price Book's price
	 * @param releaseDate The release date of the book
	 * @param coverTitle The title of the book
	 * @param publisherName The name of the publisher of the book
	 * @param author The author of the book
	 * @param pageNumber Book's page number
	 * 
	 * */
	
	public Book(double price, String releaseDate, String coverTitle,String publisherName, String author, int pageNumber) {
		this.setdPrice(price);
		this.setsReleaseDate(releaseDate);
		this.setsCoverTitle(coverTitle);
		this.setsPublisher(publisherName);
		this.setsAuthor(author);
		this.sNumberOfPages = pageNumber;
		this.setsID();
		iStockForBook++;
		this.setsType("Book");
		
	}
	/**
	 * Intended for debugging.
	 * @return the contents of every information of the book items*/
	public String toString() {
		return ("-----------------------\n"
				+ "Type: Book\n" + "Item ID: " + getsID() + "\n"
				+ "Price: " + getdPrice() + " $ \n"
				+ "Release Date: " + getsReleaseDate() + "\n"
				+ "Title: " + getsCoverTitle() + "\n"
				+ "Publisher: " + getsPublisher() + "\n"
				+ "Author: " + getsAuthor() + "\n"
				+ "Page: " + getsNumberOfPages() + " pages\n");
	}

	public static int getiStockForBook() {
		return iStockForBook;
	}
	public static void setiStockForBook(int iStockForBook) {
		Book.iStockForBook = iStockForBook;
	}
	public String getsPublisher() {
		return sPublisher;
	}
	public void setsPublisher(String sPublisher) {
		this.sPublisher = sPublisher;
	}
	public String getsAuthor() {
		return sAuthor;
	}
	public void setsAuthor(String sAuthor) {
		this.sAuthor = sAuthor;
	}
	public int getsNumberOfPages() {
		return sNumberOfPages;
	}
	public void setsNumberOfPages(int sNumberOfPages) {
		this.sNumberOfPages = sNumberOfPages;
	}
	
}
