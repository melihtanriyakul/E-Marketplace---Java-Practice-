import java.util.ArrayList;
import java.util.Date;
/**
 * This is a subclass derived from Employee
 * This class does several operations which are displaying items,
 * adding new items and showing orders.
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Technician extends Employee{
	private boolean isSenior;

	public Technician(String techName, String techMail, Date techDateOfBirth, double salary, int isSenior) {
		this.setsName(techName);
		this.setsEmail(techMail);
		this.setsDateOfBirth(techDateOfBirth);
		this.setdSalary(salary);
		if (isSenior == 1)
			this.isSenior = true;
		else
			this.isSenior = false;
		this.setsUserType("TECH");
	}
	/**
	 * This method display the items according to their type 
	 * which is derived from types String array
	 * @param aItemList The array list which contains items
	 * @param types The String array which contains types of items
	 * */
	public void dispItemOf(ArrayList<Item> aItemList, String types[]) {
		for (int b = 0; b < types.length; b++) {
			for (int n = 0; n < aItemList.size(); n++) {
				if (types[b].equals(aItemList.get(n).getsType().toUpperCase())) {
					System.out.println(aItemList.get(n));
				}
			}
		}
	}
	/**
	 * This method adds item to aItemList.
	 * The information of the item which will be added to the array list
	 * is derived from the given String array, 'item'
	 * @param aItemList The array list which contains items
	 * @param item The String array which contains the informations of item
	 * */
	public void addItem(ArrayList<Item> aItemList, String item[]) {
		switch (item[0]) {
        case "BOOK":  aItemList.add(new Book(Double.parseDouble(item[1]), item[2], item[3], item[4], 
				item[5], Integer.parseInt(item[6])));;
                 break;
        case "CDDVD"	: aItemList.add(new CdDvd(Double.parseDouble(item[1]), item[2], item[3], item[4], item[5]));
                 break;
        case "DESKTOP"	: aItemList.add(new Desktop(Double.parseDouble(item[1]), item[2], item[3], Integer.parseInt(item[4]), 
				Integer.parseInt(item[5]), item[6], item[7], Integer.parseInt(item[8]),
				Integer.parseInt(item[9]), item[10]));
                 break;
        case "LAPTOP"	:  aItemList.add(new Laptop(Double.parseDouble(item[1]), item[2], item[3], Integer.parseInt(item[4]),
				Integer.parseInt(item[5]), item[6], item[7], Integer.parseInt(item[8]), 
				Integer.parseInt(item[9]), Integer.parseInt(item[10])));;
                 break;
        case "TABLET"	:  aItemList.add(new Tablet(Double.parseDouble(item[1]), item[2], item[3], Integer.parseInt(item[4]), 
				Integer.parseInt(item[5]), item[6], item[7], Integer.parseInt(item[8]),
				Integer.parseInt(item[9]), Integer.parseInt(item[10])));
                 break;
        case "TV"		:	aItemList.add(new Tv(Double.parseDouble(item[1]), item[2], item[3], Integer.parseInt(item[4]), 
				Integer.parseInt(item[5]), Integer.parseInt(item[6])));
                 break;
        case "SMARTPHONE":  aItemList.add(new SmartPhone(Double.parseDouble(item[1]), item[2], item[3], 
				Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6]));
                 break;
        case "HAIRCARE":	aItemList.add(new HairCare(Double.parseDouble(item[1]), item[2], item[3], 
				Integer.parseInt(item[4]), Integer.parseInt(item[5]), Integer.parseInt(item[6]), 
				Integer.parseInt(item[7])));
                 break;
        case "PERFUME":  aItemList.add(new Perfume(Double.parseDouble(item[1]), item[2], item[3], 
				Integer.parseInt(item[4]), Integer.parseInt(item[5]), Integer.parseInt(item[6]), 
				Integer.parseInt(item[7])));
                 break;
        case "SKINCARE": aItemList.add(new SkinCare(Double.parseDouble(item[1]), item[2], item[3], 
				Integer.parseInt(item[4]), Integer.parseInt(item[5]), Integer.parseInt(item[6]), 
				Integer.parseInt(item[7])));
                 break;

        default: System.out.println("No item type " + item[0] + " found\n");
                 break;
		}
	}
	/**
	 * This method display the orders which have been completed
	 * @param aOrderList The array list which contains orders
	 * */
	public void showOrders(ArrayList<Order> aOrderList ) {
		System.out.println("Order History:");
		for (int d = 0; d < aOrderList.size(); d++){
			System.out.println(aOrderList.get(d));
		}
		System.out.println("");
	}
	
	public boolean isSenior() {
		return isSenior;
	}

	public void setSenior(boolean isSenior) {
		this.isSenior = isSenior;
	}
}
