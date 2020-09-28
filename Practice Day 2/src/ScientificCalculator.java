
public class ScientificCalculator extends Calculator {
	
	public ScientificCalculator()
	{
		super();
	}
	
	public long fact(int n)
	{
		int f = 1;
		for(int i = 1;i<=n;i++)
		{
			f =f*i;
		}
		return f;
	}
	
	@Override
	public double div(int a, int b)
	{
//		double c = a%b;
		System.out.println(super.div(a,b));
		return a%b;
	}
}
