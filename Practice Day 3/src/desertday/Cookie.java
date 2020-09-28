package desertday;

public class Cookie extends DessertItem{
	
	public double number;
	public double price;
	
	public Cookie()
	{
		
	}
	
	public Cookie(String Name,double number)
	{
		super(Name);
		this.number = number;
		this.price = 120;
	}
	
	@Override
	public double cost()
	{
		return (number*(10));
	}

}
