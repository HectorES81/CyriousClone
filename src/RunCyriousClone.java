import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RunCyriousClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		boolean done = false;
		
		while(!done) {
			Character userOption = printMenu(validOptionsMain);
			if(userOption == 'c') {
				System.out.println("Enter new company information...");
				Company myCompany = new Company();
				System.out.println(myCompany);
				done = true;
			} else if(userOption == 'e') {
				System.out.println("Enter new employee information...");
				
				done = true;
			} else if(userOption == 'x') {
				System.out.println("Exiting...");
				done = true;
			} else {
				
			}
		}
		
	}

	private static Character printMenu(LinkedHashMap<Character,String> validOptions) {
		// TODO Auto-generated method stub
		boolean done = false;
		Scanner userInput = new Scanner(System.in);
		
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
			
			if(userInput.hasNextLine()) {
				Character optionSelected = userInput.nextLine().toLowerCase().charAt(0);
				
				if(validOptions.containsKey(optionSelected)) {
					userInput.close();
					done = true;
					return optionSelected;
				} else {
					System.out.println("Invalid option! Let's try again...");
				}
				
			}
		}
		userInput.close();
		return null;
	}

}
