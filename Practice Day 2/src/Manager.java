
public class Manager extends Employee{
	
	private
	double petrol_allowance;
	double food_allowance;
	double other_allowance;

//	public Manager()
//	{
//		super("Om",120.0,100.0);
//		this.petrol_allowance = 0.8*basic_salary;
//		this.food_allowance = 0.13*basic_salary;
//		this.other_allowance = 0.13*basic_salary;
//	}
	
	public Manager()
	{
		super("Om",120.0,100.0);
		this.petrol_allowance = 0.8*basic_salary;
		this.food_allowance = 0.13*basic_salary;
		this.other_allowance = 0.13*basic_salary;
	}

	@Override
	public void printEmployee()
	{
		double v = calculateNetSalaray();
		double allowance = petrol_allowance + food_allowance+other_allowance;
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
			System.out.println("Gross Salary : "+ super.calculateGrossSalaray());
			System.out.println("Net Salary : "+ super.calculateNetSalaray());
		}
	}
}
