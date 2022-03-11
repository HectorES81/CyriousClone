import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RunCyriousClone {
	final static String bar = "=====";
	
	public static void main(String[] args) {
		Character userInput = null;
		
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
		
		userInput = printMenu("MAIN MENU", validOptionsMain, input);
		while(userInput != 'x') {
			
			if(userInput == 'e') { //Estimates
				estimatesMenu(input);
				userInput = printMenu("MAIN MENU", validOptionsMain, input);
			} else if(userInput == 'w') { //Work Orders
				workOrdersMenu(input);
				userInput = printMenu("MAIN MENU", validOptionsMain, input);
			} else if(userInput == 'c') { //Companies
				companiesMenu(input);	
				userInput = printMenu("MAIN MENU", validOptionsMain, input);
			} else if(userInput == 's') { //Search
				//searchMenu(input);
				userInput = printMenu("MAIN MENU", validOptionsMain, input);
			} else if(userInput == 'x') {
				//this option will never be reached
				System.out.println("Exiting...");
			} else {
				//should never reach here but leaving this here in case there are unforeseen errors
			}
		}
		System.out.println("Thank you for using Cyrious clone."); 
		input.close();
	}
	
	//takes acceptable options and scanner object, prints the menu and returns the option selected
	private static Character printMenu(String menuName, LinkedHashMap<Character,String> validOptions, Scanner input) {
		Character optionSelected = ' ';
		
		while(optionSelected != 'x') {
			System.out.println(bar + " " + menuName + " OPTIONS " + bar);
			System.out.println("Enter the letter to choose an option:");
			for(Map.Entry<Character, String> option : validOptions.entrySet()) {
				String sep = ","; //a comma or a space if displaying the last option aka exit
				if(option.getKey() == 'x') {
					sep = "";
				}
				System.out.println(String.format("[%s] %s%s ", option.getKey(), option.getValue(), sep));
			}
			System.out.println();
			
			if(input.hasNextLine()) {
				optionSelected = input.nextLine().toLowerCase().charAt(0);
				
				//only way to exit is to pick a valid option from validOptions
				if(validOptions.containsKey(optionSelected)) {
					return optionSelected;
				} else {
					System.out.println("Invalid option! Let's try again...");
				}
			}
		}
		return 'x';
	}
	
	public static void estimatesMenu(Scanner input) {
		
		Menu estimates = new Menu("ESTIMATE", input);
		estimates.addMenuOption('e', "New Estimate");
		estimates.addMenuOption('b', "Browse");
		estimates.addMenuOption('s', "Search");
		estimates.addMenuOption('x', "Exit");
		
		char userOption = printMenu(estimates.getMenuName(), estimates.getMenuOptions(), input);
		
		while(userOption != 'x') {
			if (userOption == 'e') {
				System.out.println("Entering new estimate");
				Estimate estimate = new Estimate();
				estimate.orderForm();
				userOption = printMenu(estimates.getMenuName(), estimates.getMenuOptions(), input);
			} else if (userOption == 'b') {
				System.out.println("Browsing all estimates");
				
				userOption = printMenu(estimates.getMenuName(), estimates.getMenuOptions(), input);
			} else if (userOption == 's') {
				System.out.println("Search");
				
				userOption = printMenu(estimates.getMenuName(), estimates.getMenuOptions(), input);
			}
			
		} 
	}
	
	private static void workOrdersMenu(Scanner input) {
		
		Menu workOrder = new Menu("WORK ORDER", input);
		workOrder.addMenuOption('w', "New Work Order");
		workOrder.addMenuOption('b', "Browse");		
		workOrder.addMenuOption('s', "Search");		
		workOrder.addMenuOption('x', "Exit");	
	
		char userOption = printMenu("WORK ORDER", workOrder.getMenuOptions(), input);
		
		while(userOption != 'x') {
			if (userOption == 'w') {
				System.out.println("Entering new work order...");
				userOption = printMenu("WORK ORDER", workOrder.getMenuOptions(), input);
			} else if(userOption == 'b') {
				System.out.println("Browsing");
				userOption = printMenu("WORK ORDER", workOrder.getMenuOptions(), input);
			} else if(userOption == 's') {
				System.out.println("Search");
				userOption = printMenu("WORK ORDER", workOrder.getMenuOptions(), input);
			}
		} 
	}

	public static void companiesMenu(Scanner input) {
		Character userOption = null;
		
		Menu company = new Menu("COMPANY", input);
		company.addMenuOption('c', "New Customer");		//enter new company
		company.addMenuOption('v', "New Vendor");  	//enter new, view list, search, open
		company.addMenuOption('b', "Browse");		//enter new client or vendor, list, search, open
		company.addMenuOption('s', "Search");		//search anything
		company.addMenuOption('x', "Exit Company Menu");			//exit
		
		userOption = printMenu("COMPANY", company.getMenuOptions(), input);
		
		while(userOption != 'x') {
			if (userOption == 'c') {
				System.out.println("Entering new customer info...");
				userOption = printMenu("COMPANY", company.getMenuOptions(), input);
			} else if(userOption == 'v') {
				System.out.println("Entering new vendor info...");
				userOption = printMenu("COMPANY", company.getMenuOptions(), input);
			} else if(userOption == 'b') {
				System.out.println("Browsing");
				userOption = printMenu("COMPANY", company.getMenuOptions(), input);
			} else if(userOption == 's') {
				System.out.println("Search");
				userOption = printMenu("COMPANY", company.getMenuOptions(), input);
			}
		} 
		
	}
	

}
