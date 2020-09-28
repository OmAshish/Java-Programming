package com.EveryDayGoodProducts.DataAccessLayer;

import com.EveryDayGoodProducts.BusinessLogicLayer.Apparel;

/**
 * 
 * @author OM ASHISH MISHRA
 *
 */

/* Print the elements of Apparel class */
public class PrintApparelItems {
	
	public static void printRecords(Apparel a)
	{
		System.out.println("The total cost is for Apparel "+ a.cost());
	}

}
