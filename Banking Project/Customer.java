/**
 * Represents a customer of a bank
 */
public class Customer {
	// instance variables
	String name;
	String address;
	
	// constructor
	public Customer(String customerName)
	{
		name = customerName;
	}
	// methods
	public void setAddress(String customerAddress)
	{
		address = customerAddress;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getAddress()
	{
		return this.address;
	}
}

