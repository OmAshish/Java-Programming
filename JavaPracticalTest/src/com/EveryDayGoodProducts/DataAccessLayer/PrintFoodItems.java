package com.EveryDayGoodProducts.DataAccessLayer;

import com.EveryDayGoodProducts.BusinessLogicLayer.FoodItems;

/**
 * 
 * @author OM ASHISH MISHRA
 *
 */

/* Print the elements of Apparel class */
public class PrintFoodItems {
	
	public static void printRecords(FoodItems f)
	{
		System.out.println("The total cost is for Apparel "+ f.cost());
	}

}
