import java.util.LinkedHashMap;
import java.util.Scanner;

public class Menu {
	Scanner input;
	String menuName;
	LinkedHashMap<Character, String> menuOptions;
	
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
	
	
}
