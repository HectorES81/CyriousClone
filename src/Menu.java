import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
	Scanner input;
	String menuName;
	LinkedHashMap<Character, String> menuOptions;
	final static String bar = "=====";
	
	public Menu(String menuName, Scanner input) {
		// TODO Auto-generated constructor stub
		this.menuName = menuName;
		this.input = input;
		this.menuOptions = new LinkedHashMap<Character, String>();
	}
	
	/**
	 * @param 
	 */
	public void addMenuOption(Character charOption, String desc) {
		this.menuOptions.put(charOption, desc);
	}

	/**
	 * @return the input
	 */
	public Scanner getInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(Scanner input) {
		this.input = input;
	}

	/**
	 * @return the menuName
	 */
	public String getMenuName() {
		return menuName;
	}

	/**
	 * @param menuName the menuName to set
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/**
	 * @return the thisMenuOptions
	 */
	public LinkedHashMap<Character, String> getMenuOptions() {
		return menuOptions;
	}

	/**
	 * @param thisMenuOptions the thisMenuOptions to set
	 */
	public void setMenuOptions(LinkedHashMap<Character, String> menuOptions) {
		this.menuOptions = menuOptions;
	}
	
	public Character printMenu() {
		Character optionSelected = ' ';
		
		while(optionSelected != 'x') {
			System.out.println(bar + " " + this.menuName.toUpperCase() + " OPTIONS " + bar);
			System.out.println("Enter the letter to choose an option:");
			for(Map.Entry<Character, String> option : this.menuOptions.entrySet()) {
				String sep = ","; //a comma or a space if displaying the last option aka exit
				if(option.getKey() == 'x') {
					sep = "";
				}
				System.out.println(String.format("[%s] %s%s ", option.getKey(), option.getValue(), sep));
			}
			
			if(this.input.hasNextLine()) {
				optionSelected = this.input.nextLine().toLowerCase().charAt(0);
				
				//System.out.println("optionSelected: " + optionSelected);
				
				//only way to exit is to pick a valid option from validOptions
				if(this.menuOptions.containsKey(optionSelected)) {
					return optionSelected;
				} else {
					System.out.println("Invalid option! Let's try again...");
					
				}
			}
			//optionSelected = 'x';
		}
		return 'x';
	}

	
}
