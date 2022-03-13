import java.util.ArrayList;
import java.util.Scanner;

public class Company {
	public static ArrayList<Contact> employees;
	private String name;
	private String slogan;
	private Address billingAddress;
	private boolean businessAddressIsCloned = false;
	private Address businessAddress;
	private boolean installAddressIsCloned = false;
	private Address installAddress;
	private Phone officePhone;
	private Phone mobilePhone;
	private Phone fax;
	private String notes;
	private Scanner input;
	
	public Company(Scanner input) {
		this.name = "";
		this.setSlogan("");
		this.billingAddress = new Address();
		this.businessAddress = new Address();
		this.installAddress = new Address();
		this.officePhone = new Phone();
		this.mobilePhone = new Phone();
		this.fax = new Phone();
		this.notes = "";
		this.input = input;
	}

	/**
	 * @param name
	 * @param billingAddress
	 * @param businessAddress
	 * @param installAddress
	 * @param officePhone
	 * @param mobilePhone
	 * @param fax
	 * @param notes
	 */
	public Company(String name, String slogan, Address billingAddress, Address businessAddress, Address installAddress,
			Phone officePhone, Phone mobilePhone, Phone fax, String notes) {
		super();
		this.name = name;
		this.setSlogan(slogan);
		this.billingAddress = billingAddress;
		this.businessAddress = businessAddress;
		this.installAddress = installAddress;
		this.officePhone = officePhone;
		this.mobilePhone = mobilePhone;
		this.fax = fax;
		this.notes = notes;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	/**
	 * @return the billingAddress
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}

	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * @return the businessAddress
	 */
	public Address getBusinessAddress() {
		return businessAddress;
	}

	/**
	 * @param businessAddress the businessAddress to set
	 */
	public void setBusinessAddress(Address businessAddress) {
		this.businessAddress = businessAddress;
	}

	/**
	 * @return the installAddress
	 */
	public Address getInstallAddress() {
		return installAddress;
	}

	/**
	 * @param installAddress the installAddress to set
	 */
	public void setInstallAddress(Address installAddress) {
		this.installAddress = installAddress;
	}

	/**
	 * @return the officePhone
	 */
	public Phone getOfficePhone() {
		return officePhone;
	}

	/**
	 * @param officePhone the officePhone to set
	 */
	public void setOfficePhone(Phone officePhone) {
		this.officePhone = officePhone;
	}

	/**
	 * @return the mobilePhone
	 */
	public Phone getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(Phone mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	/**
	 * @return the fax
	 */
	public Phone getFax() {
		return fax;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(Phone fax) {
		this.fax = fax;
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
	
	public void setNewCompany() {
		System.out.println("Set a new company.");
		
		Menu newCompanyEntryMenu = new Menu("NEW COMPANY ENTRY FORM", this.input);
		newCompanyEntryMenu.addMenuOption('0', "Company Name");
		newCompanyEntryMenu.addMenuOption('1', "Company Slogan");
		newCompanyEntryMenu.addMenuOption('2', "Billing Address");
		newCompanyEntryMenu.addMenuOption('3', "Business Address");
		newCompanyEntryMenu.addMenuOption('4', "Install Addres");
		newCompanyEntryMenu.addMenuOption('5', "Phone Number - Office");
		newCompanyEntryMenu.addMenuOption('6', "Phone Number - Mobile");
		newCompanyEntryMenu.addMenuOption('7', "Phone Number - Fax");
		newCompanyEntryMenu.addMenuOption('8', "Company Notes");
		newCompanyEntryMenu.addMenuOption('9', "View Company Info");
		newCompanyEntryMenu.addMenuOption('x', "Exit menu");
		
		char userOption = newCompanyEntryMenu.printMenu();
		
		while(userOption != 'x') {			
			if (userOption == '0') {
				System.out.println("New Company name : ");
				try {
					this.name = input.nextLine();
					System.out.println(String.format("%s recorded as new company name.\n", this.name));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newCompanyEntryMenu.printMenu();
			} else if (userOption == '1') {
				System.out.println("New Company slogan : ");
				try {
					this.slogan = input.nextLine();
					System.out.println(String.format("%s recorded as new slogan.\n", this.slogan));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newCompanyEntryMenu.printMenu();
			} else if (userOption == '2') {
				System.out.println("New Billing Address : ");
				try {
					if(billingAddress.getAddressType() == "") {
						billingAddress.setAddressType("Billing");
					}
					
					this.billingAddress = this.billingAddress.setNewAddress();
					

					System.out.println(String.format("%s recorded as new billing address.\n", this.billingAddress));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newCompanyEntryMenu.printMenu();
			} else if (userOption == '3') { //businessAddress
				String menuName = newCompanyEntryMenu.getMenuOptions().get(userOption);
				System.out.println("New " + menuName + " : ");
				if(!businessAddressIsCloned && this.businessAddress.isEmpty()) {
					System.out.println("Your current billing address is: " + this.billingAddress);
					System.out.println("Use same as billing for business? y/n : ");
					String sameAsBilling = input.nextLine().toLowerCase();

					if(sameAsBilling.charAt(0) == 'y') {
						try {
							this.businessAddress = (Address) this.billingAddress.clone();
						} catch (CloneNotSupportedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						this.businessAddress.setAddressType("Business");
						
						System.out.println("Your business and billing adress are now the same.");
						System.out.println(this.businessAddress);
						businessAddressIsCloned = true;
						continue;
					} else if(sameAsBilling.charAt(0) == 'n') {
						System.out.println("Cloning option declined.");
					} else {
						System.out.println("Invalid option, procede to change/enter infor below.");
					}
				} else {
					System.out.println("Address already a clone or is not empty.");
				}
				
				try {
					this.businessAddress = businessAddress.setNewAddress();
					System.out.println(String.format("%s recorded as new %s.\n", this.businessAddress, menuName));
				} catch (Exception e) {
					e.printStackTrace();
				}
				userOption = newCompanyEntryMenu.printMenu();
			}
			
			
		}
	}

	@Override
	public String toString() {
		return "Company [getName()=" + getName() + "\n"
				+ "getSlogan()=" + getSlogan() + "\n "
				+ "getBillingAddress()=" +  getBillingAddress() + "\n"
				+ "getBusinessAddress()=" + getBusinessAddress() + "\n"
				+ "getInstallAddress()=" + getInstallAddress() + "\n"
				+ "getOfficePhone()=" + getOfficePhone() + "\n"
				+ "getMobilePhone()=" + getMobilePhone() + "\n"
				+ "getFax()=" + getFax() + "\n"
				+ "getNotes()=" + getNotes() + "]";
	}
	
		
}
