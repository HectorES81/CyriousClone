import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RunCyriousClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to text based CMS Cyrious Clone.");
		
		//validOptions array
		//c = new company
		//e = new employee
		//x = exit
		//ArrayList<Character> validOptionsMain = new ArrayList<Character>(Arrays.asList('c','e','x'));
		
		LinkedHashMap<Character, String> validOptionsMain = new LinkedHashMap<>();
		validOptionsMain.put('c', "Company");
		validOptionsMain.put('e', "Employee Contact");
		validOptionsMain.put('x', "Exit");
		
		LinkedHashMap<Character, String> enterNewOrExit = new LinkedHashMap<>();
		enterNewOrExit.put('n', "Enter another");
		enterNewOrExit.put('m', "Exit to main menu");
		enterNewOrExit.put('x', "Exit program");
		
		boolean done = false;
		
		while(!done) {
			Character userOption = printMenu(validOptionsMain, input);
			if(userOption == 'c') {
				Character subOption = 'n';
				//stay entering new companies until exit to main menu or exit program
				
				while(subOption == 'n') {
					enterNewCompany();
					
					subOption = printMenu(enterNewOrExit, input);
					if(subOption == 'm') {
						System.out.println("Exiting to main menu...");
					} else if(subOption == 'x') {
						System.out.println("Exiting program...");
						done = true;
					}
				}
			} else if(userOption == 'e') {
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
				
			}
		}
		input.close();
	}

	private static Character printMenu(LinkedHashMap<Character,String> validOptions, Scanner input) {
		// TODO Auto-generated method stub
		boolean done = false;
		
		while(!done) {
			System.out.println("Use one of the following options:");
			for(Map.Entry<Character, String> option : validOptions.entrySet()) {
				String sep = ",";
				if(option.getKey() == 'x') {
					sep = "";
				}
				System.out.println(String.format("[%s] %s%s ", option.getKey(), option.getValue(), sep));
			}
			System.out.println();
			
			if(input.hasNextLine()) {
				Character optionSelected = input.nextLine().toLowerCase().charAt(0);
				
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

	public static void enterNewCompany() {
		System.out.println("Enter new COMPANY information...");
		System.out.println("Entering info...");
		System.out.println("Finishing the entry...");
	}
	
	public static void enterNewEmployee() {
		System.out.println("Enter new employee information...");
		System.out.println("Entering info...");
		System.out.println("Finishing the entry...");
	}

}
