import java.time.LocalDate;
import java.util.Scanner;

public class Contact extends Person {
	private String type;
	private String title;
	private Phone directOfficePhone;
	private Address mailingAddress;
	/**
	 * @param title
	 * @param directOfficePhone
	 * @param mailingAddress
	 */
	public Contact(String type, String title, Phone directOfficePhone, Address mailingAddress) {
		super();
		this.setType(type);
		this.title = title;
		this.directOfficePhone = directOfficePhone;
		this.mailingAddress = mailingAddress;
	}
	
	public Contact() {
		this.title = "";
		this.directOfficePhone = new Phone();
		this.mailingAddress = new Address();
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the directOfficePhone
	 */
	public Phone getDirectOfficePhone() {
		return directOfficePhone;
	}

	/**
	 * @param directOfficePhone the directOfficePhone to set
	 */
	public void setDirectOfficePhone(Phone directOfficePhone) {
		this.directOfficePhone = directOfficePhone;
	}

	/**
	 * @return the mailingAddress
	 */
	public Address getMailingAddress() {
		return mailingAddress;
	}

	/**
	 * @param mailingAddress the mailingAddress to set
	 */
	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	
	public void setNewContact() {
		String firstName = "Hector";
		String lastName = "Chicas";
		char gender = 'm';
		LocalDate dateOfBirth = LocalDate.of(1981, 9, 25);
		this.type = "Employee";
		this.title = "CEO";
		this.directOfficePhone.setNewPhone(new Scanner(System.in));
		this.mailingAddress.setNewAddress(new Scanner(System.in));
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setGender(gender);
		this.setDateOfBirth(dateOfBirth);
		this.setType(type);
		this.setTitle(title);
		this.setDirectOfficePhone(directOfficePhone);
		this.setMailingAddress(mailingAddress);

		
	}

	@Override
	public String toString() {
		return "Contact [title=" + title + ", directOfficePhone=" + directOfficePhone + ", mailingAddress="
				+ mailingAddress + ", toString()=" + super.toString() + "]";
	}

	
	
}
