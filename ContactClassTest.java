//Author Name: Brian Dell BLakcman
//Date: 07/18/2024
//Course ID: CS-320-1089-M01
//Description: This is the unit test for ContactClass


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

class ContactClassTest {

	@Test
	@DisplayName("Contact ID Cannot Have More Than 10 Characters")
	void testContactIdWithGreaterThanTen() {
		Contact contact = new Contact("FirstName","LastName","ContactNum","ContactAddress");
		if(contact.getContactId().length() > 10) {
			fail("Contact ID Is Greater Than 10 Characters.");
		}
	}
	
	@Test
	@DisplayName("Contact First Name Cannot Have More Than 10 Characters")
	void testContactFirstNameWithGreaterThanTen() {
		Contact contact = new Contact ("OllyOllyOxenFree","LastName","ContactNum","ContactAddress");
		if(contact.getFirstName().length() > 10) {
			fail("First Name Is Too Long.");
		}
	}
	
	@Test
	@DisplayName("Contact Last Name Cannot Have More Than 10 Characters")
	void testContactLastNameWithGreaterThanTen() {
		Contact contact = new Contact ("FirstName","OllyOllyOxenFree","ContactNum","ContactAddress");
		if(contact.getLastName().length() > 10) {
			fail("Last Name Is Too Long.");
		}
	}
	
	@Test
	@DisplayName("Blank Contact Num")
	void testContactNumLeftBlank() {
		Contact contact = new Contact ("FirstName", "LastName"," ","ContAddress");
		if(contact.getContactNum().length() == 0) {
			fail("Contact Number Not Set To Default");
		}
	}
	
	@Test
	@DisplayName("Invalid Number")
	void testContactNumInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("FirstName", "LastName","00000000000","ContactAdderss");
		});
	}
	
	@Test
	@DisplayName("Blank Contact Adderss")
	void testContactAddressLeftBlank() {
		Contact contact = new Contact ("FirstName", "LastName","0000000000","");
		if(contact.getContactAddress() != "NULL") {
			fail("Contact Adderss Not Set To NULL");
		}
	}
	
	@Test
	@DisplayName("null Contact Adderss")
	void testContactAddressNull() {
		Contact contact = new Contact ("FirstName", "LastName","0000000000",null);
		if(contact.getContactAddress() != "NULL") {
			fail("Contact Adderss Not Set To NULL");
		}
	}
}
