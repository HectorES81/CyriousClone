
public class Phone {
	private String type;
	private String number;
	private boolean isDefault;
	private String extension;
	private String notes;
	
	/**
	 * @param type
	 * @param number
	 * @param isDefault
	 * @param extension
	 * @param notes
	 */
	public Phone(String type, String number, boolean isDefault, String extension, String notes) {
		this.type = type;
		this.number = number;
		this.isDefault = isDefault;
		this.extension = extension;
		this.notes = notes;
	}
	
	public Phone () {
		this.type = "";
		this.number = "";
		this.isDefault = false;
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
	
	
	
}
