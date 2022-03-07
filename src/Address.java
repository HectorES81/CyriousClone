
public class Address {
	private String addressType;
	private String number;
	private String streetName;
	private String unitNumber;
	private String POBox;
	private String addtionalStreetInfo;
	private String county;
	private String state;
	private int zipCode;
	private int zip4Digits;
	
	public Address() {
		this.number = "";
		this.streetName = "";
		this.unitNumber = "";
		this.POBox = "";
		this.addtionalStreetInfo = "";
		this.county = "";
		this.state = "";
		this.zipCode = 00000;
		this.zip4Digits = 0000;
		
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
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
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
	
	
}
