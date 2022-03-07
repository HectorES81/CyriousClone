
public class Company {
	public static Contact[] employees;
	private String name;
	private Address billingAddress;
	private Address businessAddress;
	private Address installAddress;
	private Phone officePhone;
	private Phone mobilePhone;
	private Phone fax;
	private String notes;
	
	public Company() {
		this.name = "";
		this.billingAddress = new Address();
		this.businessAddress = new Address();
		this.installAddress = new Address();
		this.officePhone = new Phone();
		this.mobilePhone = new Phone();
		this.fax = new Phone();
		this.notes = "";
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
	public Company(String name, Address billingAddress, Address businessAddress, Address installAddress,
			Phone officePhone, Phone mobilePhone, Phone fax, String notes) {
		super();
		this.name = name;
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
	
}
