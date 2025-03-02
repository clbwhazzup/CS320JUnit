

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("1", "Cameron", "Binda", "1234567890", "123 Main Street");
		
		assertTrue(contact.getId().equals("1"));
		assertTrue(contact.getFirstName().equals("Cameron"));
		assertTrue(contact.getLastName().equals("Binda"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 Main Street"));
		
	}
	
	@Test
	void testIdTooLong() 
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("12345678910", "Cameron", "Binda", "1234567890", "123 Main Street");
		});
	}

	@Test
	void testIdNull()
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact(null, "Cameron", "Binda", "1234567890", "123 Main Street");
		});
	}
	
	@Test
	void testFirstNameTooLong() 
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("1", "Cameron 111111", "Binda", "1234567890", "123 Main Street");
		});
	}

	@Test
	void testFirstNameNull()
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("1", null, "Binda", "1234567890", "123 Main Street");
		});
	}
	
	@Test
	void testLastNameTooLong() 
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("1", "Cameron", "Binda 1111111", "1234567890", "123 Main Street");
		});
	}

	@Test
	void testLastNameNull()
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("1", "Cameron", null, "1234567890", "123 Main Street");
		});
	}
	
	@Test
	void testPhoneNotDigits() 
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("1", "Cameron", "Binda", "abcde0ghij", "123 Main Street");
		});
	}
	
	@Test
	void testPhoneTooLong() 
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("1", "Cameron", "Binda", "12345678910", "123 Main Street");
		});
	}

	@Test
	void testPhoneNull()
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("1", "Cameron", "Binda", null, "123 Main Street");
		});
	}
	
	@Test
	void testAddressTooLong() 
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("1", "Cameron", "Binda", "1234567890", "123 Main Street, Washington, D.C., USA, 10331");
		});
	}

	@Test
	void testAddressNull()
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact("1", "Cameron", "Binda", "1234567890", null);
		});
	}
	
	@Test 
	void testSettersValid()
	{
		Contact contact = new Contact("1", "Cameron", "Binda", "1234567890", "123 Main Street");
		
		String firstName = "John";
		String lastName = "Doe";
		String phone = "4854389530";
		String address = "100 Main Street";
		
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setPhone(phone);
		contact.setAddress(address);
		
		assertTrue(contact.getFirstName().equals(firstName));
		assertTrue(contact.getLastName().equals(lastName));
		assertTrue(contact.getPhone().equals(phone));
		assertTrue(contact.getAddress().equals(address));
	}
	
	@Test 
	void testSettersInvalid()
	{
		Contact contact = new Contact("1", "Cameron", "Binda", "1234567890", "123 Main Street");
		
		String firstName = "John          ";
		String lastName = "Doe         ";
		String phone = "4854389530  ";
		String address = "100 Main Street                               ";
		
		assertThrows(IllegalArgumentException.class, () -> 
		{
			contact.setFirstName(firstName);
		});
		
		assertThrows(IllegalArgumentException.class, () -> 
		{
			contact.setLastName(lastName);
		});
		
		assertThrows(IllegalArgumentException.class, () -> 
		{
			contact.setPhone(phone);
		});
		
		assertThrows(IllegalArgumentException.class, () -> 
		{
			contact.setAddress(address);
		});
		
		
	}
}
