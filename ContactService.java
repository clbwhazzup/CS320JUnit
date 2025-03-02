import java.util.ArrayList;

public class ContactService {
    ArrayList<Contact> contactList = new ArrayList<>();

    public boolean addContact(Contact contact) {
    	
        boolean added = false;

        // Adds contact if contact list is empty
        if (contactList.size() <= 0)
        {
            contactList.add(contact);
            added = true;
        }

        // Checks if contact with id already exists, if so return added as false, if not add contact to list
        else 
        {
            for (Contact c : contactList) {
                if (contact.getId().equalsIgnoreCase(c.getId())) {
                    added = false;
                    return added;
                }
            }
            contactList.add(contact);
            added = true;
        }

        return added;
    }

	// If contact with ID found, removes it from the arrayList, returns true; otherwise returns false
    public boolean deleteContactById(String id) {
    	
    	boolean deleted = false;
    	
    	for (Contact c : contactList)
		{
			if (id.equalsIgnoreCase(c.getId())) 
			{
				contactList.remove(contactList.indexOf(c));
				deleted = true;
				return deleted;
			}
		}
		return deleted;
    }
    
    // If contact with ID found, uses contact object method to update first name, returns true; otherwise returns false 
    public boolean updateFirstNameById(String id, String firstName) {
    	
    	boolean updated = false;
    	
    	for (Contact c : contactList ) 
    	{
    		if (id.equalsIgnoreCase(c.getId())) 
    		{
    			c.setFirstName(firstName);
    			updated = true;
    			return updated;
    		}
    	}
    	return updated;
    }
    
    // If contact with ID found, uses contact object method to update last name, returns true; otherwise returns false 
    public boolean updateLastNameById(String id, String lastName) {
    	
    	boolean updated = false;
    	
    	for (Contact c : contactList ) 
    	{
    		if (id.equalsIgnoreCase(c.getId())) 
    		{
    			c.setLastName(lastName);
    			updated = true;
    			return updated;
    		}
    	}
    	return updated;
    }
    // If contact with ID found, uses contact object method to update phone number, returns true; otherwise returns false 
    public boolean updatePhoneById(String id, String phone) {
    	
    	boolean updated = false;
    	
    	for (Contact c : contactList ) 
    	{
    		if (id.equalsIgnoreCase(c.getId())) 
    		{
    			c.setPhone(phone);
    			updated = true;
    			return updated;
    		}
    	}
    	return updated;
    }
    
    // If contact with ID found, uses contact object method to update address, returns true; otherwise returns false 
    public boolean updateAddressById(String id, String address) {
    	
    	boolean updated = false;
    	
    	for (Contact c : contactList ) 
    	{
    		if (id.equalsIgnoreCase(c.getId())) 
    		{
    			c.setAddress(address);
    			updated = true;
    			return updated;
    		}
    	}
    	return updated;
    }
}
