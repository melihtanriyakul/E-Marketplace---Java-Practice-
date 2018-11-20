import java.io.IOException;
import java.util.ArrayList;
/**
 * This is the Main class.
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 */
public class Main {
	/**
	 * 
	 * @param args text files
	 * @throws IOException Throws IO exception
	 */

	public static void main(String[] args) throws IOException {
		
		String userFile = args[0];
		String itemFile = args[1];
		String commandFile = args[2];
		
		Operations sampleOperation = new Operations();
		
		ArrayList<String> usersTxt = sampleOperation.readFile(userFile);
		ArrayList<String> itemsTxt = sampleOperation.readFile(itemFile);
		ArrayList<String> commandTxt = sampleOperation.readFile(commandFile);
		
		sampleOperation.assignUsers(usersTxt);
		sampleOperation.assignItems(itemsTxt);
		sampleOperation.implementCommand(commandTxt);
	}

}
