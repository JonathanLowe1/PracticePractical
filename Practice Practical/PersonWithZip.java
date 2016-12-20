public class PersonWithZip
{
    private String firstName;
    private String lastName;
    private int zipCode;
    
    /**
     * Default constructor for objects of class PersonWithZip
     */
    public PersonWithZip(String firstName, String lastName, int zipCode)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public int getZip()
    {
        return this.zipCode;
    }
    
    public String toString()
    {
        return "The persons name is "+firstName+ " "+lastName+" and the persons zip code is "+zipCode;
    }
}
