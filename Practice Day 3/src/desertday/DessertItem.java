package desertday;

/**
 * 
 * @author OM ASHISH MISHRA
 *
 */

/* AllProducts - Meant to keep a record of all the products of the company */
public abstract class DessertItem {
	
	String Name;
	
	public DessertItem()
	{
		
	}
	
	public DessertItem(String Name)
	{
		this.Name = Name;
	}
	
	public abstract double cost();
	public final String getName()
	{
		return Name;
	}

}
