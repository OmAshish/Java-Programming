package com.EveryDayGoodProducts.ViewLayer;


import com.EveryDayGoodProducts.BusinessLogicLayer.AllProducts;
/**
 * 
 * @author OM ASHISH MISHRA
 *
 */

/* Checkout - Meant to find the details added to the cart, deleted and updated */
public class Checkout {
	
	AllProducts[] cashRegister;
	
	/*Default Constructor*/
	public Checkout()
	{
		
	}
	
	/* Add the Items to cart*/
	public void addItems(AllProducts[] items)
	{
		this.cashRegister = items;
	}
	
	/* Delete the Items from Cart */
	public void clearCart()
	{
		this.cashRegister = null;
	}
	
	/*  Number of Items */
	public int numberofItems()
	{
		try
		{
		if(cashRegister!=null)
		{
			return this.cashRegister.length;
		}
		else
		{
			System.out.println("Empty");
			return 0;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("The Block Ends Here!");
			return 0;
		}
	}
	
	/* Cost of buying */
	public double getTotalCost()
	{
		try{
			if(cashRegister!=null)
			{
				double total = 0;
				for(AllProducts i: cashRegister)
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
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("The Block Ends Here!");
			return 0;
		}
	}
	
	/**
	 * Overriding to get desired string output
	 */
	@Override
	public String toString() {
		if(cashRegister != null)
		{
			String receipt = "";
			for(AllProducts i: cashRegister)
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
	}

}
