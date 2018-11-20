import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
/**
 * This is a superclass
 * This class creates the array lists which will be used in operations
 *  manages the operations which are reading file, assigning users and items,
 * checking admin and techician and their indexes, checking technician 
 * if they are senior, checking items' stocks and finally implemening the 
 * commands.
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Operations {
	ArrayList<Admin> aAdminList = new ArrayList<Admin>();
	ArrayList<Customer> aCustomerList = new ArrayList<Customer>();
	ArrayList<Customer> aVipCustomerList = new ArrayList<Customer>();
	ArrayList<Technician> aTechnicianList = new ArrayList<Technician>();
	ArrayList<Item> aItemList = new ArrayList<Item>();
	ArrayList<Campaign> aCampaignList = new ArrayList<Campaign>();
	ArrayList<Order> aOrderList = new ArrayList<Order>();
	/**
	 * This methods reads the file and returns it as a String array
	 * @param fileName The file's name
	 * @return lines The String array which contains file's lines
	 * @throws IOException Throws IO exception
	 * */
	public ArrayList<String> readFile(String fileName) throws IOException {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		ArrayList<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = bufferedReader.readLine()) != null ) {
			lines.add(line);
		}
		bufferedReader.close();
		return lines;
	}
	/**
	 * This method reads users, the array list which contains
	 * users' informations, assigns the users in the array lists
	 * corresponding to their status which are Admin or Technician
	 * or Customer.
	 * @param users The array list which contains users' informations
	 * */
	public void assignUsers(ArrayList<String> users) {
		for ( int i = 0; i < users.size(); i++) {
			String[] sUsers = users.get(i).split("	");
			  try 
			    {
			      DateFormat formatter; 
			      Date date; 
			      formatter = new SimpleDateFormat("dd.MM.yyyy");
			      date = (Date)formatter.parse(sUsers[3]); 
			      if (sUsers[0].equals("ADMIN")) 
						aAdminList.add(new Admin(sUsers[1], sUsers[2],date,Double.parseDouble(sUsers[4]), sUsers[5]));
					else if (sUsers[0].equals("CUSTOMER"))
						aCustomerList.add(new Customer(sUsers[1], sUsers[2], date, Double.parseDouble(sUsers[4]), sUsers[5]));
					else if (sUsers[0].equals("TECH")) 
						aTechnicianList.add(new Technician(sUsers[1], sUsers[2], date, Double.parseDouble(sUsers[4]), Integer.parseInt(sUsers[5])));
					else
						System.out.println("You have entered a wrong input");
			    } 
			    catch (Exception e)
			    {}
			
		}
	}
	/**
	 * This method read items, the array list which contains items'
	 * informations, assign the items to aItemList
	 * @param items The array list which contains items' informations
	 *  */
	public void assignItems(ArrayList<String> items) {
		for (int i = 0; i < items.size(); i++) {
			String[] sItems = items.get(i).split("	");
			if (sItems[0].equals("BOOK"))
					aItemList.add(new Book(Double.parseDouble(sItems[1]), sItems[2], sItems[3], sItems[4], sItems[5], Integer.parseInt(sItems[6])) );
			else if (sItems[0].equals("CDDVD"))
				aItemList.add(new CdDvd(Double.parseDouble(sItems[1]), sItems[2], sItems[3], sItems[4], sItems[5]));
			else if (sItems[0].equals("DESKTOP"))
				aItemList.add(new Desktop(Double.parseDouble(sItems[1]), sItems[2], sItems[3], Integer.parseInt(sItems[4]), 
						Integer.parseInt(sItems[5]), sItems[6], sItems[7], Integer.parseInt(sItems[8]),
						Integer.parseInt(sItems[9]), sItems[10]));
			else if (sItems[0].equals("LAPTOP"))
				aItemList.add(new Laptop(Double.parseDouble(sItems[1]), sItems[2], sItems[3], Integer.parseInt(sItems[4]), 
						Integer.parseInt(sItems[5]), sItems[6], sItems[7], Integer.parseInt(sItems[8]), 
						Integer.parseInt(sItems[9]), Integer.parseInt(sItems[10])));
			else if (sItems[0].equals("TABLET"))
				aItemList.add(new Tablet(Double.parseDouble(sItems[1]), sItems[2], sItems[3], Integer.parseInt(sItems[4]), 
						Integer.parseInt(sItems[5]), sItems[6], sItems[7], Integer.parseInt(sItems[8]),
						Integer.parseInt(sItems[9]), Integer.parseInt(sItems[10])));
			else if (sItems[0].equals("TV"))
				aItemList.add(new Tv(Double.parseDouble(sItems[1]), sItems[2], sItems[3], Integer.parseInt(sItems[4]), 
						Integer.parseInt(sItems[5]), Integer.parseInt(sItems[6])));
			else if (sItems[0].equals("SMARTPHONE"))
				aItemList.add(new SmartPhone(Double.parseDouble(sItems[1]), sItems[2], sItems[3], 
						Integer.parseInt(sItems[4]), Integer.parseInt(sItems[5]), sItems[6]));
			else if (sItems[0].equals("HAIRCARE"))
				aItemList.add(new HairCare(Double.parseDouble(sItems[1]), sItems[2], sItems[3], 
						Integer.parseInt(sItems[4]), Integer.parseInt(sItems[5]), Integer.parseInt(sItems[6]), 
						Integer.parseInt(sItems[7])));
			else if (sItems[0].equals("PERFUME"))
				aItemList.add(new Perfume(Double.parseDouble(sItems[1]), sItems[2], sItems[3], 
						Integer.parseInt(sItems[4]), Integer.parseInt(sItems[5]), Integer.parseInt(sItems[6]), 
						Integer.parseInt(sItems[7])));
			else if (sItems[0].equals("SKINCARE"))
				aItemList.add(new SkinCare(Double.parseDouble(sItems[1]), sItems[2], sItems[3], 
						Integer.parseInt(sItems[4]), Integer.parseInt(sItems[5]), Integer.parseInt(sItems[6]), 
						Integer.parseInt(sItems[7])));
			else 
				System.out.println("You have entered a wrong input");
		}
	}
	/**
	 * This method checks if there is an admin which has the given name
	 * @param adminName The name to be checked
	 * @return true if there is such admin, false if not
	 * */
	public boolean checkAdmin(String adminName){
		for (int j = 0; j < aAdminList.size(); j++) {
			if(aAdminList.get(j).getsName().equals(adminName)) {
				return true;
			}
		} 
		return false;
	}
	/**
	 * This method checks if there is an technician which has the given name
	 * @param techName The name to be checked
	 * @return true if there is such technician, false if not
	 * */
	public boolean checkTech(String techName) {
		for (int j = 0; j < aTechnicianList.size(); j++) {
			if(aTechnicianList.get(j).getsName().equals(techName)) {
				return true;
			}
		} 
		return false;
	}
	/**
	 * This method checks the index of technician with respect to the given name
	 * @param techName The name to be checked
	 * @return the index of technician
	 * */
	public int checkIndexOfTech(String techName){
		int count = -1;
		for (int j = 0; j < aTechnicianList.size(); j++) {
			if(aTechnicianList.get(j).getsName().equals(techName))
				count = j;
		} 
		return count;
	}
	/**
	 * This method checks the index of admin with respect to the given name
	 * @param adminName The name to be checked
	 * @return the index of admin
	 * */
	public int checkIndexOfAdmin(String adminName) {
		int count = -1;
		for (int j = 0; j < aAdminList.size(); j++) {
			if(aAdminList.get(j).getsName().equals(adminName)) {
				count = j;
				break;
			}
		} 
		return count;
	}
	/**
	 * This method checks whether the technician is senior or not 
	 * depends on the given name
	 * @param techName The name to be checked
	 * @return true if the technician is senior, false if not
	 * */
	public boolean checkSeniorTech(String techName) {
		for (int j = 0; j < aTechnicianList.size(); j++) {
			if(aTechnicianList.get(j).getsName().equals(techName) && aTechnicianList.get(j).isSenior()) {
				return true;
			}
		} 
		return false;
		
	}
	/**
	 * The method checks the stock of the given item type
	 * @param itemType The item type to be checked
	 * @return true if there is a stock of item, false if not
	 * */
	public boolean checkStock(String itemType) {
		switch (itemType.toUpperCase()) {
		case "BOOK": if (Book.getiStockForBook() > 0)
			return true;
		else 
			return false;
		case "CDDVD": if (CdDvd.getiStockForCdDvd() > 0)
			return true;
		else
			return false;
		case "DESKTOP": if (Desktop.getiStockForDesktop() > 0)
			return true;
		else
			return false;
		case "HAIRCARE": if (HairCare.getiStockForHairCare() > 0)
			return true;
		else
			return false;
		case "LAPTOP": if(Laptop.getiStockForLaptop() > 0)
			return true;
		else
			return false;
		case "PERFUME": if (Perfume.getiStockForPerfume() > 0)
			return true;
		else
			return false;
		case "SKINCARE": if (SkinCare.getiStockForSkinCare() > 0)
			return true;
		else
			return false;
		case "SMARTPHONE": if (SmartPhone.getiStockForSmartPhone() > 0)
			return true;
		else
			return false;
		case "TABLET": if (Tablet.getiStockForTablet() > 0)
			return true;
		else
			return false;
		case "TV": if (Tv.getiStockForTv() > 0)
			return true;
		else
			return false;
		default:
			return false;
		}
	}
	/**
	 * This method implements the commands which 'aCommandsList' array list contains.
	 * The method extract the command from the array list, 'aCommandsList', splits 
	 * and decides which command will be implemented according to first word
	 * @param aCommandsList The array list contains commands' informations 
	 * */
	
	public void implementCommand(ArrayList<String> aCommandsList) {
		Admin operatorAdmin = new Admin("", "", new java.util.Date(), 100, "1");
		Employee operatorEmployee = new Employee();
		Technician operatorTech = new Technician("", "", new java.util.Date(), 100, 10);
		for( int i = 0; i < aCommandsList.size(); i++) {
			String[] sCommands = aCommandsList.get(i).split("	");
			if (sCommands[0].equals("ADDCUSTOMER")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2] + " "
						+ sCommands[3] + " " + sCommands[4] + " " + sCommands[5] + " " + sCommands[6] + ">\n");
				if (checkAdmin(sCommands[1]))
					operatorAdmin.addCustomer(aCustomerList, sCommands);
				else 
					System.out.println("No admin person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("SHOWCUSTOMERS")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + ">\n");
				if (checkAdmin(sCommands[1])) 
					operatorAdmin.showCustomers(aCustomerList, sCommands);
				else 
					System.out.println("No admin person named " + sCommands[1] + " exists!\n");					
			}
			else if (sCommands[0].equals("SHOWCUSTOMER")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2]  + ">\n");
				if (checkAdmin(sCommands[1]))
					operatorAdmin.showCustomer(aCustomerList, sCommands);
				else
					System.out.println("No admin person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("SHOWADMININFO")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + ">\n");
				int adminIndex = checkIndexOfAdmin(sCommands[1]);
				if (adminIndex > -1)
					operatorAdmin.showAdminInfo(aAdminList, adminIndex);
				else
					System.out.println("No admin person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("CREATECAMPAIGN")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2] + " " + sCommands[3]
						+ " " + sCommands[4] + " " + sCommands[5]+ ">\n");
				if (checkAdmin(sCommands[1]))
					if (Integer.parseInt(sCommands[5]) >  Campaign.MAX_DISCOUNT_RATE)
						System.out.println("Campaign was not created. Discount rate exceeds maximum rate of 50%.\n");
					else {
						operatorAdmin.createCampaign(aCampaignList, aItemList, sCommands);
					}
			}
			else if (sCommands[0].equals("ADDADMIN")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2] + " " + sCommands[3]
						+ " " + sCommands[4] + " " + sCommands[5]+ " " + sCommands[6] + ">\n");
				if (checkAdmin(sCommands[1]))
					operatorAdmin.addAdmin(aAdminList, sCommands);
				else
					System.out.println("No admin person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("ADDTECH")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2] + " " + sCommands[3]
						+ " " + sCommands[4] + " " + sCommands[5]+ " " + sCommands[6] + ">\n");
				if (checkAdmin(sCommands[1]))
					operatorAdmin.addTech(aTechnicianList, sCommands);
				else
					System.out.println("No admin person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("LISTITEM")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + ">\n");
				if ( checkAdmin(sCommands[1]) || checkTech(sCommands[1])) {
					operatorEmployee.listItems(aItemList);
				}
			}
			else if (sCommands[0].equals("SHOWITEMSLOWONSTOCK")) {
				if ( checkAdmin(sCommands[1]) || checkTech(sCommands[1])) { 
					operatorEmployee.showItemsLowOnStock(sCommands);
				}
				else
					System.out.println("No admin or technician person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("SHOWVIP")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + ">\n");
				if ( checkAdmin(sCommands[1]) || checkTech(sCommands[1])) { 
					operatorEmployee.showVipCustomers(aVipCustomerList);
				}
				else
					System.out.println("No admin or technician person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("DISPITEMSOF")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2] + ">\n");
				if (checkTech(sCommands[1])) {
					String[] types = sCommands[2].split(":");
					operatorTech.dispItemOf(aItemList, types);
				}
				else
					System.out.println("No technician person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("ADDITEM")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2] + ">\n\n");
				if (checkTech(sCommands[1])) {
					String[] item = sCommands[2].split(":");
					operatorTech.addItem(aItemList, item);
				}
				else
					System.out.println("No technician person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("SHOWORDERS")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + ">\n");
				if (checkSeniorTech(sCommands[1])) {
					operatorTech.showOrders(aOrderList);
				}
				else
					System.out.println("No technician person named " + sCommands[1] + " exists!\n");
			}
			else if (sCommands[0].equals("CHPASS")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2] + " " + sCommands[3] +  ">\n");
				try {
					aCustomerList.get(Integer.parseInt(sCommands[1]) - 1).changePassword(sCommands[2], sCommands[3]);
				}
				catch (Exception e) {
					System.out.println("No customer with ID number " + sCommands[1] + " exists!\n");
				}
			}
			else if (sCommands[0].equals("DEPOSITMONEY")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2] +  ">\n");
				try {
					aCustomerList.get(Integer.parseInt(sCommands[1]) - 1).depositeMoney(Double.parseDouble(sCommands[2]));
					System.out.println("");
				}
				catch (Exception e) {
					System.out.println("No customer with ID number " + sCommands[1] + " exists!\n");
				}
			}
			else if (sCommands[0].equals("SHOWCAMPAIGNS")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] +  ">\n");
				try {
					aCustomerList.get(Integer.parseInt(sCommands[1]) - 1).displayCampaign(aCampaignList);
				}
				catch (Exception e) {
					System.out.println("No customer with ID number " + sCommands[1] + " exists!\n");
				}
				
			}
			else if(sCommands[0].equals("ADDTOCART")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + "\t" + sCommands[1] + "\t" + sCommands[2] +  ">\n");
				try {
					String itemType = aItemList.get(Integer.parseInt(sCommands[2]) - 1).getsType();
					if(checkStock(itemType)) {
						aCustomerList.get(Integer.parseInt(sCommands[1]) - 1).addToCart(aItemList.get(Integer.parseInt(sCommands[2]) - 1));
						System.out.println("The item " + itemType + 
								" has been successfully added to your cart.\n");
					}
					else
						System.out.println("We are sorry. The item is temporarily unavailable.\n");
				}
				catch (Exception e) {
					System.out.println("No customer with ID number " + sCommands[1] + " exists!\n");
				}
			}
			else if (sCommands[0].equals("EMPTYCART")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + "\t" + sCommands[1] + ">\n");
				try {
					aCustomerList.get(Integer.parseInt(sCommands[1]) - 1).emptyCart();
					System.out.println("The cart has been emptied.\n");
				}
				catch (Exception e) {
					System.out.println("No customer with ID number " + sCommands[1] + " exists!\n");
				}
			}
			else if (sCommands[0].equals("ORDER")) {
				System.out.println("COMMAND TEXT: <" + sCommands[0] + "\t" + sCommands[1] + "\t" + sCommands[2] + ">\n");
				aCustomerList.get(0).purchaseOrder(aCustomerList, aVipCustomerList, aOrderList, sCommands);	
			}
		}
	}
}