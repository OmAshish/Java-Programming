package desertday;

import java.util.Arrays;


public class Checkout
{
	
	DessertItem[] cashRegister;

	public Checkout()
	{
		
	}
	
	public void addItems(DessertItem[] items)
	{
		cashRegister = items;
	}
	
	public void clearCart()
	{
		cashRegister = null;
	}
	
	public int numberofItems()
	{
		if(cashRegister!=null)
		{
			return cashRegister.length;
		}
		else
		{
			System.out.println("Empty");
			return 0;
		}
	}
	
	public double getTotalCost()
	{
		if(cashRegister!=null)
		{
			double total = 0;
			for(DessertItem i: cashRegister)
			{
				total = total+i.cost();
			}
			return total;
		}
		else
		{
			System.out.println("Cart is empty....");
			return 0;
		}
	}
	
	@Override
	public String toString() {
		if(cashRegister != null)
		{
			String receipt = "";
			for(DessertItem i: cashRegister)
			{
				receipt = receipt + i.getName()+" => "+i.cost()+"\n";
			}
			return receipt+" TOTAL: "+this.getTotalCost();
		}
		else
			{
				System.out.println("Cart is Empty");
				return "BLANK";
			}
//			return receipt+" TOTAL: "+this.getTotalCost();
		}
//		return "Checkout [cashRegister=" + Arrays.toString(cashRegister) + "]"/
	}

