import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RunCyriousClone {
	final static String bar = "=====";
	
	public static void main(String[] args) {
		//scanner object will be passed to each function who requires user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to text based CMS Cyrious Clone.");
		
		//valid options for main menu
		LinkedHashMap<Character, String> validOptionsMain = new LinkedHashMap<>();
		validOptionsMain.put('e', "Estimates");		//enter new, list, search, open
		validOptionsMain.put('w', "Work Orders");  	//enter new, view list, search, open
		validOptionsMain.put('c', "Company");		//enter new client or vendor, list, search, open
		validOptionsMain.put('s', "Search");		//search anything
		validOptionsMain.put('x', "Exit");			//exit
		
		//valid options after you're done inside a menu option 
		LinkedHashMap<Character, String> enterNewOrExit = new LinkedHashMap<>();
		enterNewOrExit.put('n', "Enter another");
		enterNewOrExit.put('m', "Exit to main menu");
		enterNewOrExit.put('x', "Exit program");
		
		boolean done = false;
		
		while(!done) {
			Character userOption = printMenu(validOptionsMain, input);
			if(userOption == 'c') { //company program
				Character subOption = 'n';
				//stay entering new companies until exit to main menu or exit program
				
				while(subOption == 'n') {
					companyMenu(input);
					
					subOption = printMenu(enterNewOrExit, input);
					if(subOption == 'm') {
						System.out.println("Exiting to main menu...");
					} else if(subOption == 'x') {
						System.out.println("Exiting program...");
						done = true;
					}
				}
			} else if(userOption == 'e') { //employee program
				Character subOption = 'n';
				//stay entering new employees until exit to main menu or exit program
				
				while(subOption == 'n') {
					enterNewEmployee();
				
					subOption = printMenu(enterNewOrExit, input);
					if(subOption == 'm') {
						System.out.println("Exiting to main menu...");
					} else if(subOption == 'x') {
						System.out.println("Exiting program...");
						done = true;
					}
				}
				
			} else if(userOption == 'x') {
				System.out.println("Exiting...");
				done = true;
			} else {
				//should never reach here but leaving this here in case there are unforseen errors
			}
		}
		input.close();
	}
	
	//takes acceptable options and scanner object, prints the menu and returns the option selected
	private static Character printMenu(LinkedHashMap<Character,String> validOptions, Scanner input) {
		boolean done = false;
		
		while(!done) {
			System.out.println("Use one of the following options:");
			for(Map.Entry<Character, String> option : validOptions.entrySet()) {
				String sep = ","; //a comma or a space if displaying the last option aka exit
				if(option.getKey() == 'x') {
					sep = "";
				}
				System.out.println(String.format("[%s] %s%s ", option.getKey(), option.getValue(), sep));
			}
			System.out.println();
			
			if(input.hasNextLine()) {
				Character optionSelected = input.nextLine().toLowerCase().charAt(0);
				
				//only way to exit is to pick a valid option from validOptions
				if(validOptions.containsKey(optionSelected)) {
					done = true;
					return optionSelected;
				} else {
					System.out.println("Invalid option! Let's try again...");
				}
			}
		}
		return null;
	}

	public static void companyMenu(Scanner input) {
		Character userOption = null;
		
		//enter new client or vendor, list, search, open
		System.out.println(bar + "Menu options related to companies" + bar);
		
		LinkedHashMap<Character, String> companyMenu = new LinkedHashMap<>();
		companyMenu.put('c', "New Customer");		//enter new, list, search, open
		companyMenu.put('v', "New Vendor");  	//enter new, view list, search, open
		companyMenu.put('b', "Browse");		//enter new client or vendor, list, search, open
		companyMenu.put('s', "Search");		//search anything
		companyMenu.put('x', "Exit");			//exit
		
		userOption = printMenu(companyMenu, input);
		
		while(userOption != 'x') {
			if (userOption == 'c') {
				System.out.println("New customer menu");
				
				userOption = printMenu(companyMenu, input);
			}
		} 
		
		
	}
	
	public static void enterNewEmployee() {
		System.out.println("Enter new employee information...");
		System.out.println("Entering info...");
		System.out.println("Finishing the entry...");
	}
}
