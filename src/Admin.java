import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * This is a subclass derived from Employee.
 * This class does several operations: converts string
 * to date, adds customer to the system, shows customers,
 * shows the informations of the admin who are asked,
 * creates campaign and changes the password.
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * 
 * */

public class Admin extends Employee{
	private String sPassword;
	
	/**
	 * @param adminName	Admin's name
	 * @param adminMail	Admin's e-mail
	 * @param adminDateOfBirth	Admin's date of birth
	 * @param adminSalary Admin's salary
	 * @param adminPassword Admin's password
	 * */
	Admin (String adminName, String adminMail, Date adminDateOfBirth, double adminSalary, String adminPassword) {
		this.setsName(adminName);
		this.setsEmail(adminMail);
		this.setsDateOfBirth(adminDateOfBirth);
		this.setdSalary(adminSalary);
		this.sPassword = adminPassword;
		
	}
	/**
	 * This method takes parameter as a String and 
	 * converts it to a Date type 
	 * @param sampleDate given date
	 * @return date	Return date as date type
	 * @throws e Throws exception if date is not be given properly
	 */
	public Date stringToDate (String sampleDate) {
		try 
	    {  
	      DateFormat formatter; 
	      Date date; 
	      formatter = new SimpleDateFormat("dd.MM.yyyy");
	      date = (Date)formatter.parse(sampleDate);
	      return date;
	    }
		catch (Exception e) {
			System.out.println("You haven't entered a proper date.");
		}
		return null;
	}
	/**
	 * This method adds customer to the corresponding arraylist
	 * by extracting the customer's information from given command
	 * @param aCustomerList The array list which contains customers
	 * @param sCommands The given command as a String array
	 * */
	public void addCustomer(ArrayList<Customer> aCustomerList, String sCommands[]){
		 aCustomerList.add(new Customer(sCommands[2], sCommands[3], stringToDate(sCommands[4]), 
		  			Double.parseDouble(sCommands[5]), sCommands[6]));
		  			System.out.println("");
	}
	/**
	 * This method show the customer who are asked
	 * @param aCustomerList The array list which contains customers
	 * @param sCommands The given command as a String array
	 * 
	 * */
	public void showCustomer(ArrayList<Customer> aCustomerList, String sCommands[]){
		System.out.println(aCustomerList.get(Integer.parseInt(sCommands[2]) - 1 ) + "\n");
	}
	/**
	 * This method shows all customers
	 * @param aCustomerList The array list which contains customers 
	 * @param sCommands The given command as a String array
	 * 
	 * */
	public void showCustomers(ArrayList<Customer> aCustomerList, String sCommands[]){
		for ( int j = 0; j < aCustomerList.size(); j++) {
			System.out.println(aCustomerList.get(j));
		}
		System.out.println("");
	}
	
	/**
	 * This method prints the information of the admin who are asked
	 * @param aAdminList The array list which contains admins
	 * @param adminIndex The index of array list 
	 * which contains the admin who are asked
	 * 
	 * */
	public void showAdminInfo(ArrayList<Admin> aAdminList, int adminIndex) {
		System.out.println(aAdminList.get(adminIndex));
	}
	/**
	 * This method creates campaign on items with respect to the value
	 * which is given in the command
	 * @param aCampaignList The array list which contains campaigns
	 * @param aItemList The array list which contains items
	 * @param sCommands The given command
	 * 
	 *  */
	public void createCampaign(ArrayList<Campaign> aCampaignList, ArrayList<Item> aItemList, String sCommands[]) {
		aCampaignList.add(new Campaign(sCommands[2], sCommands[3], sCommands[4], Integer.parseInt(sCommands[5])));
		double dRate = (100 - Integer.parseInt(sCommands[5]));
		for ( int k = 0; k < aItemList.size(); k++) {
			if (aItemList.get(k).getsType().toUpperCase().equals(sCommands[4]))
				aItemList.get(k).setdPrice((aItemList.get(k).getdPrice() * dRate) / 100);
		}
		System.out.println("");
	}
	/**
	 * This method adds admin to the corresponding array list
	 * by extracting the admin's information from given command
	 * @param aAdminList The array list which contains admins
	 * @param sCommands The given command as a String array
	 * */
	public void addAdmin(ArrayList<Admin> aAdminList, String sCommands[]) {
		aAdminList.add(new Admin(sCommands[2], sCommands[3], stringToDate(sCommands[4]), Double.parseDouble(sCommands[5]), sCommands[6]));
		System.out.println("");
	}
	/**
	 * This method adds technician to the corresponding array list
	 * by extracting the technician's information from given command
	 * @param aTechnicianList The array list which contains admins
	 * @param sCommands The given command as a String array
	 * */
	public void addTech(ArrayList<Technician> aTechnicianList, String sCommands[]) {
		aTechnicianList.add(new Technician(sCommands[2], sCommands[3], stringToDate(sCommands[4]), Double.parseDouble(sCommands[5]), Integer.parseInt(sCommands[6])));
		System.out.println("");
	}
	
	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	/**
	 * Intended only for debugging.
	 * @return the contents of every informations of admin. */
	public String toString() {
		return ("----------- Admin info ----------- \nAdmin name: " + getsName()+ "\n" +  "Admin e-mail: " + getsEmail() + 
				"\n" + "Admin date of birth: " + getsDateOfBirth() + "\n");
	}
}
