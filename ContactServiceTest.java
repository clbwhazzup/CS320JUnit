import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


class ContactServiceTest {
	ContactService contactService;
	Contact c1;
	Contact c2;
	Contact c3;
	
	@BeforeEach
	void setup() {
		this.contactService = new ContactService();
	
		this.c1 = new Contact("1", "Cameron", "Binda", "1234567890", "123 Main Street");
		this.c2 = new Contact("1", "Cameron", "Binda", "1234567890", "123 Main Street");
		this.c3 = new Contact("2", "Cameron", "Binda", "1234567890", "123 Main Street");
		
	}
	
	@Test
	void testAddContact() {
		assertTrue(contactService.addContact(c1));
		assertFalse(contactService.addContact(c2));
		assertTrue(contactService.addContact(c3));
		
	}
	
	@Test
	void testDeleteContact() {
		assertTrue(contactService.addContact(c1));
		assertFalse(contactService.addContact(c2));
		assertTrue(contactService.addContact(c3));
		
		assertFalse(contactService.deleteContactById("10"));
		assertTrue(contactService.deleteContactById("1"));
	}
	
	@Test
	void testUpdateContact() {
		assertTrue(contactService.addContact(c1));
		assertTrue(contactService.addContact(c3));
		
		assertTrue(contactService.updateFirstNameById("2", "John"));
		assertFalse(contactService.updateFirstNameById("10", "John"));
		
		assertTrue(contactService.updateLastNameById("2", "Doe"));
		assertFalse(contactService.updateLastNameById("10", "Doe"));
		
		assertTrue(contactService.updatePhoneById("2", "0987654321"));
		assertFalse(contactService.updatePhoneById("10", "0987654321"));

		assertTrue(contactService.updateAddressById("2", "321 Main Street"));
		assertFalse(contactService.updateAddressById("10", "321 Main Street"));
	}

}
