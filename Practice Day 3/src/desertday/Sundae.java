package desertday;

public class Sundae extends IceCream {

	public double toppings;
	public double price;
	
	public Sundae()
	{
		
	}
	
	public Sundae(double toppings)
	{
		this.toppings = toppings;
		this.price = 10;
	}
	
	@Override
	public double cost()
	{
		return (super.cost()+toppings*price);
	}
}
