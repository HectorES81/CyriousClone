import java.util.Scanner;

public class RunCyriousClone {
	
	public static void main(String[] args) {
		Character userInput = null;
		
		//scanner object will be passed to each function who requires user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to text based CMS Cyrious Clone.");
		
		Menu mainMenu = new Menu("MAIN MENU", input);
		
		//valid options for main menu
		mainMenu.addMenuOption('e', "Estimates");		//enter new, list, search, open
		mainMenu.addMenuOption('w', "Work Orders");  	//enter new, view list, search, open
		mainMenu.addMenuOption('c', "Company");		//enter new client or vendor, list, search, open
		mainMenu.addMenuOption('s', "Search");		//search anything
		mainMenu.addMenuOption('x', "Exit");			//exit
		
		userInput = mainMenu.printMenu();
		
		while(userInput != 'x') {	
			if(userInput == 'e') { //Estimates
				estimatesMenu(input);
				userInput = mainMenu.printMenu();
			} else if(userInput == 'w') { //Work Orders
				workOrdersMenu(input);
				userInput = mainMenu.printMenu();
			} else if(userInput == 'c') { //Companies
				companiesMenu(input);	
				userInput = mainMenu.printMenu();
			} else if(userInput == 's') { //Search
				//searchMenu(input);
				userInput = mainMenu.printMenu();
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
	
		
	public static void estimatesMenu(Scanner input) {
		
		Menu estimates = new Menu("ESTIMATE", input);
		estimates.addMenuOption('e', "New Estimate");
		estimates.addMenuOption('b', "Browse");
		estimates.addMenuOption('s', "Search");
		estimates.addMenuOption('x', "Exit");
		
		char userOption = estimates.printMenu();
		
		while(userOption != 'x') {
			if (userOption == 'e') {
				System.out.println("Entering new estimate");
				Estimate estimate = new Estimate();
				
				estimate.orderForm();
				
				userOption = estimates.printMenu();
			} else if (userOption == 'b') {
				System.out.println("Browsing all estimates");
				
				userOption = estimates.printMenu();
			} else if (userOption == 's') {
				System.out.println("Search");			
				userOption = estimates.printMenu();
			}
		} 
	}
	
	private static void workOrdersMenu(Scanner input) {
		
		Menu workOrder = new Menu("WORK ORDER", input);
		workOrder.addMenuOption('w', "New Work Order");
		workOrder.addMenuOption('b', "Browse");		
		workOrder.addMenuOption('s', "Search");		
		workOrder.addMenuOption('x', "Exit");	
	
		char userOption = workOrder.printMenu();
		
		while(userOption != 'x') {
			if (userOption == 'w') {
				System.out.println("Entering new work order...");
				userOption = workOrder.printMenu();
			} else if(userOption == 'b') {
				System.out.println("Browsing");
				userOption = workOrder.printMenu();
			} else if(userOption == 's') {
				System.out.println("Search");
				userOption = workOrder.printMenu();
			}
		} 
	}

	public static void companiesMenu(Scanner input) {
		Character userOption = null;
		
		Menu companyMenu = new Menu("COMPANY", input);
		companyMenu.addMenuOption('c', "New Customer");		//enter new company
		companyMenu.addMenuOption('v', "New Vendor");  	//enter new, view list, search, open
		companyMenu.addMenuOption('b', "Browse");		//enter new client or vendor, list, search, open
		companyMenu.addMenuOption('s', "Search");		//search anything
		companyMenu.addMenuOption('x', "Exit Company Menu");			//exit
		
		userOption = companyMenu.printMenu();
		Company company = new Company(input);
		
		//get fresh copy of all companies in database
		
		//CRUD SOX
		//create would show a form to enter new company info
		//read from database
		//update existing co
		//delete a company

		while(userOption != 'x') {
			if (userOption == 'c') {
				company.setNewCompany();
				//continue;
				userOption = companyMenu.printMenu();
			} else if(userOption == 'v') {
				System.out.println("Entering new vendor info...");
				userOption = companyMenu.printMenu();
			} else if(userOption == 'b') {
				System.out.println("Browsing");
				//System.out.println(company.toString());
				userOption = companyMenu.printMenu();
			} else if(userOption == 's') {
				System.out.println("Search");
				userOption = companyMenu.printMenu();
			}
		} 
		
	}
}
