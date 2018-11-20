import java.util.ArrayList;
/**
 * This is a subclass derived from User
 * This class shows the items' stock if the item's stock is lower than the given value
 * and shows the vip customers
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Employee extends User{
	private double dSalary;
	
	public void listItems (ArrayList<Item> aItemList ) {
		for (int i = 0; i < aItemList.size(); i++){
			System.out.println(aItemList.get(i));
		}
	}
	/**
	 * This method show the item' stock if the item's stock is lower
	 * than the given value which is extracted from the given command
	 * @param sCommands The given command as a String array
	 * */
	public void showItemsLowOnStock(String sCommands[]) {
		if (sCommands.length == 3) {
			int count = Integer.parseInt(sCommands[2]);
			System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + " " + sCommands[2] + ">\n");
			if (count > Book.getiStockForBook())
				System.out.println("Book : " + Book.getiStockForBook());
			if (count > CdDvd.getiStockForCdDvd())
				System.out.println("CDDVD : " + CdDvd.getiStockForCdDvd());
			if (count > Desktop.getiStockForDesktop())
				System.out.println("Desktop : " + Desktop.getiStockForDesktop());
			if (count > Laptop.getiStockForLaptop())
				System.out.println("Laptop : " + Laptop.getiStockForLaptop());
			if (count > Tablet.getiStockForTablet())
				System.out.println("Tablet : " + Tablet.getiStockForTablet());
			if (count > Tv.getiStockForTv())
				System.out.println("TV : " + Tv.getiStockForTv());
			if (count > SmartPhone.getiStockForSmartPhone())
				System.out.println("SmartPhone : " + SmartPhone.getiStockForSmartPhone());
			if (count > HairCare.getiStockForHairCare())
				System.out.println("HairCare : " + HairCare.getiStockForHairCare());
			if (count > Perfume.getiStockForPerfume())
				System.err.println("Perfume : " + Perfume.getiStockForPerfume());
			if (count > SkinCare.getiStockForSkinCare())
				System.out.println("SkinCare : " + SkinCare.getiStockForSkinCare());
			System.out.println("");
		}
		else if (sCommands.length == 2) {
			System.out.println("COMMAND TEXT: <" + sCommands[0] + " " + sCommands[1] + ">\n");
			System.out.println("Book : " + Book.getiStockForBook());
			System.out.println("CDDVD : " + CdDvd.getiStockForCdDvd());
			System.out.println("Desktop : " + Desktop.getiStockForDesktop());
			System.out.println("Laptop : " + Laptop.getiStockForLaptop());
			System.out.println("Tablet : " + Tablet.getiStockForTablet());
			System.out.println("TV : " + Tv.getiStockForTv());
			System.out.println("SmartPhone : " + SmartPhone.getiStockForSmartPhone());
			System.out.println("HairCare : " + HairCare.getiStockForHairCare());
			System.err.println("Perfume : " + Perfume.getiStockForPerfume());
			System.out.println("SkinCare : " + SkinCare.getiStockForSkinCare());
		}
	}
	/**
	 * This method shows the vip customers
	 * @param aVipCustomerList The array list which contains only the vip customers
	 * */
	public void showVipCustomers(ArrayList<Customer> aVipCustomerList) {
		for ( int v = 0; v < aVipCustomerList.size(); v++)
			System.out.println(aVipCustomerList.get(v));
		System.out.println("");
	}
	
	
	public double getdSalary() {
		return dSalary;
	}

	public void setdSalary(double dSalary) {
		this.dSalary = dSalary;
	}
}
