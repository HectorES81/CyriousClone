import java.io.Serializable;
import java.util.Scanner;

import javafxTest.ModalWindow;

public class Phone implements Serializable {
	private String type;
	private String number;
	private boolean isDefault;
	private boolean isTextOk;
	private String extension;
	private String notes;

	/**
	 * @param type
	 * @param number
	 * @param isDefault
	 * @param extension
	 * @param notes
	 */
	public Phone(String type, String number, boolean isDefault, boolean isTextOk, String extension, String notes) {
		this.type = type;
		this.number = number;
		this.isDefault = isDefault;
		this.isTextOk = isTextOk;
		this.extension = extension;
		this.notes = notes;
	}

	public Phone() {
		this.type = "";
		this.number = "";
		this.isDefault = false;
		this.isTextOk = false;
		this.extension = "";
		this.notes = "";
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the isDefault
	 */
	public boolean isDefault() {
		return isDefault;
	}

	/**
	 * @param isDefault the isDefault to set
	 */
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * @param extension the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Phone setNewPhone(Scanner input) {
		//Scanner input = new Scanner(System.in);
		//this.input = input;
		
		ModalWindow.main(new String[] {});
		
		Menu setNewPhone = new Menu("NEW PHONE", input);
		setNewPhone.addMenuOption('1', "Phone Type");
		setNewPhone.addMenuOption('2', "Phone Number");
		if(this.type != "fax") {
			setNewPhone.addMenuOption('3', "Use as default");
			setNewPhone.addMenuOption('4', "Extension");
		} else { //phone type is fax and extension doesn't apply
			this.extension = "N/A";
		}
		if( this.type == "mobile" || this.type == "cell") {
			setNewPhone.addMenuOption('5', "Is Text OK?");
		}
		setNewPhone.addMenuOption('6', "Notes");
		setNewPhone.addMenuOption('p', "Print current phone info");
		setNewPhone.addMenuOption('x', "Exit Phone Menu");
		
		

		char userOption = setNewPhone.printMenu();

		while (userOption != 'x') {
			if (userOption == '1') { // type
				String menuName = setNewPhone.getMenuOptions().get(userOption);
				System.out.println("Current " + menuName + ": " + this.type);
				System.out.println("New " + menuName + " : ");
				try {
					this.type = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.type, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = setNewPhone.printMenu();
			} else if (userOption == '2') { // number
				String menuName = setNewPhone.getMenuOptions().get(userOption);
				System.out.println("Current " + menuName + ": " + this.number);
				System.out.println("New " + menuName + " : ");
				try {
					this.number = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.number, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = setNewPhone.printMenu();
			} else if (userOption == '3') { // isDefault
				String menuName = setNewPhone.getMenuOptions().get(userOption);
				System.out.println("Current " + menuName + ": " + ((this.isDefault) ? "Yes" : "No"));
				// System.out.println("New " + menuName + " : ");
				try {
					System.out.print("Set this as default? y/n: ");
					String defaultNum = input.nextLine();
					if (defaultNum.charAt(0) == 'y') {
						this.isDefault = true;
						System.out.println(String.format("%s set as default phone number", this.number));
					} else {
						System.out.println("Phone is not set as default.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = setNewPhone.printMenu();
			} else if (userOption == '4') { // extension
				String menuName = setNewPhone.getMenuOptions().get(userOption);
				System.out.println("Current " + menuName + ": " + this.extension);
				System.out.println("New " + menuName + " : ");
				try {
					this.extension = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.extension, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = setNewPhone.printMenu();
			} else if (userOption == '5') { // isDefault
					String menuName = setNewPhone.getMenuOptions().get(userOption);
					System.out.println("Current " + menuName + ": " + ((this.isTextOk) ? "Yes" : "No"));
					// System.out.println("New " + menuName + " : ");
					try {
						System.out.print("Is Texting OK? y/n: ");
						String isTextOkAnswer = input.nextLine();
						if (isTextOkAnswer.charAt(0) == 'y') {
							this.isTextOk = true;
							System.out.println(String.format("%s set for texting", this.number));
						} else {
							System.out.println("Phone is not allowed texting.");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					userOption = setNewPhone.printMenu();
				} else if (userOption == '6') { // notes
				String menuName = setNewPhone.getMenuOptions().get(userOption);
				System.out.println("Current " + menuName + ": " + this.notes);
				System.out.println("New " + menuName + " : ");
				try {
					this.notes = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.extension, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = setNewPhone.printMenu();
			} else if (userOption == 'p') { // print
				System.out.println("Current Phone Info: ");

				System.out.println(this);

				userOption = setNewPhone.printMenu();
			}
		}

		//input.close();
		return this;
	}

	@Override
	public String toString() {
		return "Phone [\ntype=" + type + "\n number=" + number + "\n isDefault=" + isDefault + 
				"\n isTextOk=" + isTextOk + "\n extension=" + extension
				+ "\n notes=" + notes + "]";
	}

}
