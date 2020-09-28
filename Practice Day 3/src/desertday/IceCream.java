package desertday;

public class IceCream extends DessertItem {
	
	public double number;
	public double price;
	
	public IceCream()
	{
		
	}
	
	public IceCream(String Name, double number)
	{
		super(Name);
		this.number = number;
		this.price = 100;
	}
	
	@Override
	public double cost()
	{
		return (number*price);
	}

}
