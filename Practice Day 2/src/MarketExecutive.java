
public class MarketExecutive extends Employee{
	
	private
		double km_travelled;
		double tour_allowance;
		double telephone_allowance;
	
	public MarketExecutive(double km)
	{
		super("Om",120.0,100.0);
//		Employee e = new Employee("Om",120.0,100.0);
		km_travelled = km;
		tour_allowance = 5*km_travelled;
		telephone_allowance = 1500;
	}
	
	@Override
	public void printEmployee()
	{
		double v = calculateNetSalaray();
		double allowance = tour_allowance + telephone_allowance;
		if(v>allowance)
		{
			System.out.println("The Net Salaray is above allowance");
		}
		else if(v>pf)
		{
			System.out.println("The PF is above allowance");
		}
		else
		{
			System.out.println("Gross Salary : "+ calculateGrossSalaray());
			System.out.println("Net Salary : "+ calculateNetSalaray());
		}
	}
	

}
