//Author Name: Brian Dell Blackman
//Date: 07/18/2024
//Course ID: CS-320-1089-M01
// Description: Contact Class for creating and storing contacts

import java.util.concurrent.atomic.AtomicLong;
public class Contact {
	private final String ContactId;
	private String FirstName;
	private String LastName;
	private String ContactNum;
	private String ContactAddress;
	private static AtomicLong idGenerator = new AtomicLong();
	
	//Constructor for contact
	public Contact(String FirstName, String LastName, String ContactNum, String ContactAddress) {
		
		this.ContactId = String.valueOf(idGenerator.getAndIncrement());
		
		if(FirstName == null || FirstName.isEmpty()) {
			this.FirstName = "NULL";
		}
		else if(FirstName.length() > 10) {
			this.FirstName = FirstName.substring(0,10);
		}
		else {
			this.FirstName = FirstName;
		}
		
		if (LastName == null || LastName.isEmpty()) {
			this.LastName = "NULL";
		}
		else if(LastName.length() > 10) {
			this.LastName = LastName.substring(0,10);
		}
		else {
			this.LastName = LastName;
		}
		
		if(ContactNum == null || ContactNum.isEmpty() || ContactNum.length() != 10) {
			this.ContactNum = "5555555555";
		}
		if(ContactNum.length() > 10) {
			throw new IllegalArgumentException("Invalid Number Entered");
		}
		else {
			this.ContactNum = ContactNum;
		}
		
		if(ContactAddress == null || ContactAddress.isEmpty()) {
			this.ContactAddress = "NULL";
		}
		else if(ContactAddress.length() > 30) {
			this.ContactAddress = ContactAddress.substring(0,30);
		}
		else {
			this.ContactAddress = ContactAddress;
		}
	}
	
	//Getters
	
	public String getContactId() {
		return ContactId;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public String getContactNum() {
		return ContactNum;
	}
	
	public String getContactAddress() {
		return ContactAddress;
	}
	
	//Setters
	public void setFirstName(String FirstName) {
		if(FirstName == null || FirstName.isEmpty()) {
			this.FirstName = "NULL";
		}
		else if(FirstName.length() > 10) {
			this.FirstName = FirstName.substring(0,10);
		}
		else {
			this.FirstName = FirstName;
		}
	}
	
	public void setLastName(String LastName) {
		if (LastName == null || LastName.isEmpty()) {
			this.LastName = "NULL";
		}
		else if(LastName.length() > 10) {
			this.LastName = LastName.substring(0,10);
		}
		else {
			this.LastName = LastName;
		}
	}
	
	public void setContactNum(String ContactNum) {
		if(ContactNum == null || ContactNum.isEmpty() || ContactNum.length() != 10) {
			this.ContactNum = "5555555555";
		}
		if(ContactNum.length() > 10) {
			throw new IllegalArgumentException("Invalid Number Entered");
		}
		else {
			this.ContactNum = ContactNum;
		}
	}
	
	public void setContactAddress(String ContactAddress) {
		if(ContactAddress == null || ContactAddress.isEmpty()) {
			this.ContactAddress = "NULL";
		}
		else if(ContactAddress.length() > 30) {
			this.ContactAddress = ContactAddress.substring(0,30);
		}
		else {
			this.ContactAddress = ContactAddress;
		}
	}
}




