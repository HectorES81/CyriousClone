import java.io.Serializable;
import java.util.Scanner;

public class Address implements Cloneable, Serializable {
	private String addressType;
	private String number;
	private String streetName;
	private String unitNumber;
	private String POBox;
	private String addtionalStreetInfo;
	private String city;
	private String state;
	private int zipCode;
	private int zip4Digits;

	public Address() {
		this.addressType = "";
		this.number = "";
		this.streetName = "";
		this.unitNumber = "";
		this.POBox = "";
		this.addtionalStreetInfo = "";
		this.city = "";
		this.state = "";
		this.zipCode = 00000;
		this.zip4Digits = 0000;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * @return the addressType
	 */
	public String getAddressType() {
		return addressType;
	}

	/**
	 * @param addressType the addressType to set
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
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
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the unitNumber
	 */
	public String getUnitNumber() {
		return unitNumber;
	}

	/**
	 * @param unitNumber the unitNumber to set
	 */
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	/**
	 * @return the pOBox
	 */
	public String getPOBox() {
		return POBox;
	}

	/**
	 * @param pOBox the pOBox to set
	 */
	public void setPOBox(String pOBox) {
		POBox = pOBox;
	}

	/**
	 * @return the addtionalStreetInfo
	 */
	public String getAddtionalStreetInfo() {
		return addtionalStreetInfo;
	}

	/**
	 * @param addtionalStreetInfo the addtionalStreetInfo to set
	 */
	public void setAddtionalStreetInfo(String addtionalStreetInfo) {
		this.addtionalStreetInfo = addtionalStreetInfo;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the zip4Digits
	 */
	public int getZip4Digits() {
		return zip4Digits;
	}

	/**
	 * @param zip4Digits the zip4Digits to set
	 */
	public void setZip4Digits(int zip4Digits) {
		this.zip4Digits = zip4Digits;
	}

	public Address setNewAddress(Scanner input) {
		//System.out.println("Current " + this.addressType + " address info:\n" + this);

		Menu newAddressEntry = new Menu("new address menu", input);
		newAddressEntry.addMenuOption('0', "Address Type");
		newAddressEntry.addMenuOption('1', "Building/House Number");
		newAddressEntry.addMenuOption('2', "Street Name");
		newAddressEntry.addMenuOption('3', "Apt/Suite Number");
		newAddressEntry.addMenuOption('4', "P.O. Box #");
		newAddressEntry.addMenuOption('5', "Address Line 2");
		newAddressEntry.addMenuOption('6', "City");
		newAddressEntry.addMenuOption('7', "State");
		newAddressEntry.addMenuOption('8', "Zip Code 5 digit");
		newAddressEntry.addMenuOption('9', "Zip Code +4 digit");
		newAddressEntry.addMenuOption('p', "Print Address Info");
		newAddressEntry.addMenuOption('x', "exit");

		char userOption = newAddressEntry.printMenu();

		while (userOption != 'x') {
			if (userOption == '0') { // addressType
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("Current " + menuName + ": " + this.addressType);
				System.out.println("New " + menuName + " : ");
				try {
					this.addressType = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.addressType, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == '1') { // number
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");

				try {
					this.number = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.number, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == '2') { // streetName
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");

				try {
					this.streetName = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.streetName, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == '3') { // unitNumber
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");

				try {
					this.unitNumber = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.unitNumber, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == '4') { // POBox
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");

				try {
					this.POBox = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.POBox, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == '5') { // addtionalStreetInfo
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");

				try {
					this.addtionalStreetInfo = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.addtionalStreetInfo, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == '6') { // city
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");

				try {
					this.city = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.city, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == '7') { // state
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");

				try {
					this.state = input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.state, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == '8') { // zipCode
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");

				try {
					this.zipCode = input.nextInt();
					input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.zipCode, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == '9') { // zip4Digits
				String menuName = newAddressEntry.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");

				try {
					this.zip4Digits = input.nextInt();
					input.nextLine();
					System.out.println(String.format("%s recorded as new %s.\n", this.zip4Digits, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newAddressEntry.printMenu();
			} else if (userOption == 'p') { // print
				System.out.println("Current Address Info: ");

				System.out.println(this);

				userOption = newAddressEntry.printMenu();
			}
		}
		//input.close();
		return this;
	}

	public boolean isEmpty() {
		if (number == "" && streetName == "" && unitNumber == "" && POBox == "" && addtionalStreetInfo == ""
				&& city == "" && state == "" && zipCode == 0 && zip4Digits == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Address [addressType=" + addressType + "\n number=" + number + "\n streetName=" + streetName
				+ "\n unitNumber=" + unitNumber + "\n POBox=" + POBox + "\n addtionalStreetInfo=" + addtionalStreetInfo
				+ "\n city=" + city + "\n state=" + state + "\n zipCode=" + zipCode + "\n zip4Digits=" + zip4Digits
				+ "]";
	}

}
