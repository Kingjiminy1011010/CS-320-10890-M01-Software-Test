//Author Name: Brian Dell BLakcman
//Date: 07/18/2024
//Course ID: CS-320-1089-M01
//Description: This is the unit test for ContactServiceClass

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;

@TestMethodOrder(OrderAnnotation.class)


public class ContactServiceTest {

	@Test
	@DisplayName("Test to Update First Name.")
	@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
		service.updateFirstName("Sven", "0");
		service.displayContactList();
		
	}
	
	@Test
	@DisplayName("Test to Update Last Name.")
	@Order(2)
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
		service.updateLastName("Sven", "0");
		service.displayContactList();
		
	}

}