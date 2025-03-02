public class Contact 
{
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor with error checking
    public Contact(String id, String firstName, String lastName, String phone, String address) 
    {
        
        if (id == null || id.length() > 10) 
        {
            throw new IllegalArgumentException("Invalid ID");
        }
        
        if (firstName == null || firstName.length() > 10) 
        {
            throw new IllegalArgumentException("Invalid Name");
        }

        if (lastName == null || lastName.length() > 10) 
        {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        
        if ( phone == null || phone.length() != 10 || !phone.matches("[0-9]+")) 
        {
            throw new IllegalArgumentException("Invalid Phone");
        }
        
        if (address == null || address.length() > 30)
        {
            throw new IllegalArgumentException("Invalid Address");
        }

        // Sets the class variables equal to the constructor fields
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Setters with error checking, used only for updating object
    public void setFirstName(String firstName) 
    {
        if (firstName == null || firstName.length() > 10) 
        {
            throw new IllegalArgumentException("Invalid Name");
        }
        
        this.firstName = firstName;
    }

    public void setLastName(String lastName) 
    {
        if (lastName == null || lastName.length() > 10) 
        {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        
        this.lastName = lastName;
    }

    public void setPhone(String phone) 
    {
        if (phone == null || phone.length() != 10) 
        {
            throw new IllegalArgumentException("Invalid Phone");
        }
        
        this.phone = phone;
    }
    
    public void setAddress(String address)
    {
        if (address == null || address.length() > 30)
        {
            throw new IllegalArgumentException("Invalid Address");
        }
        
        this.address = address;
    }

    // Getters
    public String getId() { return id; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getPhone() { return phone; }

    public String getAddress() { return address; }

}
