
import java.util.ArrayList;
import java.util.Date;
/**
 * This is a subclass derived from User
 * This class have several methods to change the customer's
 * password, deposite money to customer's account, change
 * customer's status, adding item to customer's shopping
 * cart, empty the customer's cart, decrease the stocks of items
 * display current campaigns and finally purchase an order
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Customer extends User{
	private static int iCountOfID = 1;
	private int iCustomerID;
	private String sPassword;
	private double dBalance;
	private String sStatus;
	private double dSpentMoney;
	private double dDiscountRate;
	ArrayList<Item> aShoppingCart = new ArrayList<Item>();
	public static final double LIMIT_FOR_SILVER = 1000.00;
	public static final double LIMIT_FOR_GOLDEN = 5000.00;
	public static final double DISCOUNT_RATE_FOR_SILVERS = 10;
	public static final double DISCOUNT_RATE_FOR_GOLDENS = 15;
	/**
	 * @param sName 	Customer's name
	 * @param sEmail 	Customer's e-mail
	 * @param sDateOfBirth Customer's date of birth
	 * @param dBalance 	Customer's balance
	 * @param sPassword	Customer's password
	 * */
	public Customer(String sName, String sEmail, Date sDateOfBirth, double dBalance, String sPassword) {
		this.setsName(sName);
		this.setsEmail(sEmail);
		this.setsDateOfBirth(sDateOfBirth);
		this.setdBalance(dBalance);
		this.setsPassword(sPassword);
		this.setiCustomerID();
		this.setsStatus("CLASSIC");
		this.setdDiscountRate(0);
		this.setsUserType("CUSTOMER");
	}
	
	/**
	 * Intended for debugging
	 * @return The contents of every informations of the customer
	 * */
	public String toString() {
		return ("Customer name: " + getsName() + "	ID: " + getiCustomerID() + "	e-mail: " +
				getsEmail() + "	Date of Birth: " + getsDateOfBirth() + "	Status: " + getsStatus());
	}
	/**
	 * This method changes customers' password if the customers enter
	 * their old passwords.
	 * @param oldPassword The customer's current password
	 * @param newPassword The customer's new password
	 * */
	public void changePassword(String oldPassword, String newPassword) {
		if (oldPassword.equals(this.sPassword)) {
			this.sPassword = newPassword;
			System.out.println("The password has been successfully changed.\n");
		}
		else
			System.out.println("The given password does not match the current password. Please try again.");
	}
	/**
	 * This method updates customer's account by taking loaded amount
	 * @param loadAmount The amount of money which will be deposited*/
	public void depositeMoney(double loadAmount) {
		dBalance = dBalance + loadAmount;
	}
	/**
	 * This method updates customer's status with respect to 
	 * the amount of money which the customer spend.
	 * If customer spends more than 5000, he/she's status will 
	 * be upgraded to GOLDEN, if she/he spends more than 1000,
	 * he/she's status will be upgraded to SILVER.
	 * @param spendMoney The amount of money which the customer spend*/
	public void changeStatus(double spendMoney){
		if (this.dSpentMoney >= LIMIT_FOR_GOLDEN) {
			this.sStatus = "GOLDEN";
			this.setdDiscountRate(DISCOUNT_RATE_FOR_GOLDENS);
		}
		else if (this.dSpentMoney >= LIMIT_FOR_SILVER) {
			this.sStatus = "SILVER";
			this.setdDiscountRate(DISCOUNT_RATE_FOR_SILVERS);
		}
	}
	/**
	 * This method prints the current campaigns for customers
	 * @param aCampaignList The array list which contains campaigns
	 * */
	public void displayCampaign(ArrayList<Campaign> aCampaignList) {
		System.out.println("Active Campaigns:");
		for (int g = 0; g < aCampaignList.size(); g++) {
			System.out.println(aCampaignList.get(g));
		}
		System.out.println("");
	}
	/**
	 * This method adds the choosen item to the customer's cart
	 * @param choosenItem The item which is choosen by customer to buy
	 * */
	public void addToCart(Item choosenItem) {
		this.getaShoppingCart().add(choosenItem);
	}
	/**
	 * This method empties the customer's cart
	 * */
	public void emptyCart() {
		this.getaShoppingCart().clear();
	}
	/**
	 * This method decreases the items' stock based on the customers' orders.
	 * @param itemType The item which has been ordered
	 * */
	public void decreaseStock(String itemType) {
		switch (itemType) {
		case "Book"	:
			Book.setiStockForBook(Book.getiStockForBook() - 1);;
			break;
		case "CDDVD"	:
			CdDvd.setiStockForCdDvd(CdDvd.getiStockForCdDvd() - 1);
			break;
		case "Desktop"	:
			Desktop.setiStockForDesktop(Desktop.getiStockForDesktop() - 1);
                 break;
        case "Laptop"	:
        	Laptop.setiStockForLaptop(Laptop.getiStockForLaptop() - 1);
                 break;
        case "Tablet"	:
        	Tablet.setiStockForTablet(Tablet.getiStockForTablet() - 1);
                 break;
        case "TV"		:
        	Tv.setiStockForTv(Tv.getiStockForTv() - 1);
        	break;
        case "SmartPhone":
        	SmartPhone.setiStockForSmartPhone(SmartPhone.getiStockForSmartPhone() - 1);
                 break;
        case "HairCare":
        	HairCare.setiStockForHairCare(HairCare.getiStockForHairCare() - 1);
                 break;
        case "Perfume":
        	Perfume.setiStockForPerfume(Perfume.getiStockForPerfume() - 1);
                 break;
        case "SKINCARE": 
        	SkinCare.setiStockForSkinCare(SkinCare.getiStockForSkinCare() - 1);
                 break;
		default:
			break;
		}
	}
	/**
	 * This method executes the order. There are of course necessities,
	 * first, the method checks whether the customers enter their passwords,
	 * after that check the customers' shopping cart whether it's empty or not,
	 * if these requirements be provided, the method calculates the total price
	 * with respect to the campaigns if there are any and of course the customers'
	 * status. After the price calculation, the method executes the order. It's not 
	 * done yet, of course, after the order executed, the method adds the order 
	 * to aOrderList which is the array list contains order. Finally, the method
	 * changes the customers' status to "GOLDEN" and adds this 
	 * customers to the aVipCostumerList which contains vip costumers
	 *  if they spent more than 5000 and
	 * to "SILVER" if they spent more than 1000.
	 * @param aCustomerList The array list which contains customers
	 * @param aVipCustomerList The array list which contains only vip customers
	 * @param aOrderList The array list which contains orders
	 * @param sCommands The given command as a String array
	 * @throws e 
	 *   */
	public void purchaseOrder(ArrayList<Customer> aCustomerList, ArrayList<Customer> aVipCustomerList, ArrayList<Order> aOrderList, String sCommands[]) {
		try {
			int customerIndex = Integer.parseInt(sCommands[1]) - 1;
			double totalPurchase = 0;
			Date dateAtTheMoment = new Date();

			for (int i = 0; i < aCustomerList.get(customerIndex).getaShoppingCart().size(); i++) {
				totalPurchase = totalPurchase + aCustomerList.get(customerIndex).getaShoppingCart().get(i).getdPrice();
			}
			totalPurchase = totalPurchase - (totalPurchase * aCustomerList.get(customerIndex).getdDiscountRate());
			
			if (!aCustomerList.get(customerIndex).getsPassword().equals(sCommands[2])) {
				System.out.println("Order could not be placed. Invalid password.\n");
			}
			else if (aCustomerList.get(customerIndex).aShoppingCart.isEmpty())
				System.out.println("You should add some items to your cart before order request!\n");
			else if (aCustomerList.get(customerIndex).getdBalance() < totalPurchase) {
				System.out.println("Order could not be placed. Insufficient funds.\n");
			}
			
			else if (aCustomerList.get(customerIndex).getsStatus().equals("GOLDEN")) {
				aCustomerList.get(customerIndex).setdSpentMoney(totalPurchase);
				aOrderList.add(new Order(dateAtTheMoment, totalPurchase, aCustomerList.get(customerIndex).getaShoppingCart().size(), (customerIndex + 1)));
				for (int i = 0; i < aCustomerList.get(customerIndex).getaShoppingCart().size(); i++) {
					decreaseStock(aCustomerList.get(customerIndex).getaShoppingCart().get(i).getsType());
				}
				aCustomerList.get(customerIndex).emptyCart();
				System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
			}
			else if (aCustomerList.get(customerIndex).getsStatus().equals("SILVER")) {
				aCustomerList.get(customerIndex).setdSpentMoney(totalPurchase);
				aOrderList.add(new Order(dateAtTheMoment, totalPurchase, aCustomerList.get(customerIndex).getaShoppingCart().size(), (customerIndex + 1)));
				for (int i = 0; i < aCustomerList.get(customerIndex).getaShoppingCart().size(); i++) {
					decreaseStock(aCustomerList.get(customerIndex).getaShoppingCart().get(i).getsType());
				}
				aCustomerList.get(customerIndex).emptyCart();
				System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
				if (aCustomerList.get(customerIndex).getdSpentMoney() >= LIMIT_FOR_GOLDEN) {
					aCustomerList.get(customerIndex).changeStatus(aCustomerList.get(customerIndex).getdSpentMoney());
					aCustomerList.get(customerIndex).setdDiscountRate(DISCOUNT_RATE_FOR_GOLDENS);
					aVipCustomerList.add(aCustomerList.get(customerIndex));
					System.out.println("Congratulations! You have been upgraded to a GOLDEN MEMBER! You have earned a permanent discount of 15% on all purchases.\n");
				}
				else
					System.out.println("You need to spend " + (LIMIT_FOR_GOLDEN - aCustomerList.get(customerIndex).getdSpentMoney()) + " more TL to become a GOLDEN MEMBER.");
			}
			else if (aCustomerList.get(customerIndex).getsStatus().equals("CLASSIC")) {
				aCustomerList.get(customerIndex).setdSpentMoney(totalPurchase);
				aOrderList.add(new Order(dateAtTheMoment, totalPurchase, aCustomerList.get(customerIndex).getaShoppingCart().size(), (customerIndex + 1)));
				for (int i = 0; i < aCustomerList.get(customerIndex).getaShoppingCart().size(); i++) {
					decreaseStock(aCustomerList.get(customerIndex).getaShoppingCart().get(i).getsType());
				}
				aCustomerList.get(customerIndex).emptyCart();
				System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
				if (aCustomerList.get(customerIndex).getdSpentMoney() >= LIMIT_FOR_GOLDEN) {
					aCustomerList.get(customerIndex).changeStatus(aCustomerList.get(customerIndex).getdSpentMoney());
					aCustomerList.get(customerIndex).setdDiscountRate(DISCOUNT_RATE_FOR_GOLDENS);
					System.out.println("Congratulations! You have been upgraded to a GOLDEN MEMBER! You have earned a permanent discount of 15% on all purchases.\n");
				}
				else if (aCustomerList.get(customerIndex).getdSpentMoney() >= LIMIT_FOR_SILVER) {
					aCustomerList.get(customerIndex).changeStatus(aCustomerList.get(customerIndex).getdSpentMoney());
					aCustomerList.get(customerIndex).setdDiscountRate(DISCOUNT_RATE_FOR_SILVERS);
					System.out.println("Congratulations! You have been upgraded to a SILVER MEMBER! You have earned a discount of 10% on all purchases.");
					System.out.println("You need to spend " + (LIMIT_FOR_GOLDEN - aCustomerList.get(customerIndex).getdSpentMoney()) + " more TL to become a GOLDEN MEMBER.\n");
				}
				else if (aCustomerList.get(customerIndex).getdSpentMoney() < LIMIT_FOR_SILVER) {
					System.out.println("You need to spend " + (LIMIT_FOR_SILVER - aCustomerList.get(customerIndex).getdSpentMoney()) + " more TL to become a SILVER MEMBER.");
				}
			}
		}
		catch (Exception e) {
			System.out.println("No customer with ID number " + sCommands[1] + " exists!\n");
		}
	}
	public double getdDiscountRate() {
		return dDiscountRate;
	}

	public void setdDiscountRate(double dDiscountRate) {
		this.dDiscountRate = dDiscountRate;
	}

	public double getdSpentMoney() {
		return dSpentMoney;
	}

	public void setdSpentMoney(double dSpentMoney) {
		this.dSpentMoney = dSpentMoney;
	}
	public int getiCustomerID() {
		return iCustomerID;
	}
	public void setiCustomerID() {
		this.iCustomerID = iCountOfID;
		iCountOfID++;
	}
	public String getsPassword() {
		return sPassword;
	}
	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	public double getdBalance() {
		return dBalance;
	}
	public void setdBalance(double dBalance) {
		this.dBalance = dBalance;
	}
	public String getsStatus() {
		return sStatus;
	}
	public void setsStatus(String sStatus) {
		this.sStatus = sStatus;
	}
	public static double getLimitForSilver() {
		return LIMIT_FOR_SILVER;
	}
	public static double getLimitForGolden() {
		return LIMIT_FOR_GOLDEN;
	}
	public static double getDiscountRateForSilvers() {
		return DISCOUNT_RATE_FOR_SILVERS;
	}
	public static double getDiscountRateForGoldens() {
		return DISCOUNT_RATE_FOR_GOLDENS;
	}


	public ArrayList<Item> getaShoppingCart() {
		return aShoppingCart;
	}


	public void setaShoppingCart(ArrayList<Item> aShoppingCart) {
		this.aShoppingCart = aShoppingCart;
	}
}