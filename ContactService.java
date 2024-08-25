//Author Name: Brian Dell Blackman
//Date: 07/18/2024
//Course ID: CS-320-1089-M01
//Description: Contact Service class maintains list by adding,
// deleting contacts and also updating FirstName, LastName,
// ContactNum, ContactAdderss.

import java.util.ArrayList;

public class ContactService {
	ArrayList<Contact>ContactList = new ArrayList<Contact>();
	
	//Print list of contact
	public void displayContactList() {
		for(int i = 0; i < ContactList.size(); i++) {
			System.out.println("\t ContactId:" + ContactList.get(i).getContactId());
			System.out.println("\t First Name:" + ContactList.get(i).getFirstName());
			System.out.println("\t Last Name:" + ContactList.get(i).getLastName());
			System.out.println("\t Phone Number:" + ContactList.get(i).getContactNum());
			System.out.println("\t Address:" + ContactList.get(i).getContactAddress() + "\n");
		}
	}
	
	//Add contact
	public void addContact(String FirstName, String LastName, String ContactNum, String ContactAddress) {
		
		Contact contact = new Contact( FirstName, LastName, ContactNum, ContactAddress);
		
		
		ContactList.add(contact);
	}
	
	//get contact from list
	public Contact getContact(String ContactId) {
		Contact contact = new Contact(null, null, null, null);
		for(int i = 0; i < ContactList.size(); i++) {
			if(ContactList.get(i).getContactId().contentEquals(ContactId)) {
				contact = ContactList.get(i);
			}
		}
		return contact;
	}
	
	//delete contact
	public void deleteContact(String ContactId) {
		for(int i = 0; i < ContactList.size(); i++) {
			if(ContactList.get(i).getContactId().equals(ContactId)) {
				ContactList.remove(i);
				break;
			}
			if(i == ContactList.size()-1) {
				System.out.println("Contact Id: "+ContactId+" Does Not Exist");
			}
		}
	}
	
	
	//update contact first name
	public void updateFirstName(String newFirstName, String ContactId ) {
		for(int i = 0; i < ContactList.size(); i++) {
			if(ContactList.get(i).getContactId().equals(ContactId)){
				ContactList.get(i).setFirstName(newFirstName);
				break;
			}
			if (i == ContactList.size() - 1) {
				System.out.println("Contact ID: " + ContactId + " Does Not Exist");
			}
		}
	}
	
	//update contact last name
	public void updateLastName(String newLastName, String ContactId ) {
		for(int i = 0; i < ContactList.size(); i++) {
			if(ContactList.get(i).getContactId().equals(ContactId)){
				ContactList.get(i).setLastName(newLastName);
				break;
			}
			if (i == ContactList.size() - 1) {
				System.out.println("Contact ID: " + ContactId + " Does Not Exist");
			}
		}
	}
	
	//update contact phone number
	public void updateContactNum(String newContactNum, String ContactId ) {
		for(int i = 0; i < ContactList.size(); i++) {
			if(ContactList.get(i).getContactId().equals(ContactId)){
				ContactList.get(i).setContactNum(newContactNum);
				break;
			}
			if (i == ContactList.size() - 1) {
				System.out.println("Contact ID: " + ContactId + " Does Not Exist");
			}
		}
	}
	
	
	//update contact address
	public void updateContactAddress(String newContactAddress, String ContactId ) {
		for(int i = 0; i < ContactList.size(); i++) {
			if(ContactList.get(i).getContactId().equals(ContactId)){
				ContactList.get(i).setContactAddress(newContactAddress);
				break;
			}
			if (i == ContactList.size() - 1) {
				System.out.println("Contact ID: " + ContactId + " Does Not Exist");
			}
		}
	}
}
