package desertday;

public class Candy extends DessertItem{
	
	public double weight;
	public double price;
	
	public Candy()
	{
		
	}
	
	public Candy(String Name,double weight)
	{
		super(Name);
		this.weight = weight;
		this.price = 2000;
	}
	
	@Override
	public double cost()
	{
		return (this.weight*(2));
	}

}
