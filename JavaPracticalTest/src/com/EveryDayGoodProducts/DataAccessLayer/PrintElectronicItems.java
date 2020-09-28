package com.EveryDayGoodProducts.DataAccessLayer;

import com.EveryDayGoodProducts.BusinessLogicLayer.Electronics;

/**
 * 
 * @author OM ASHISH MISHRA
 *
 */

/* Print the elements of Apparel class */
public class PrintElectronicItems {
	
	public static void printRecords(Electronics e)
	{
		System.out.println("The total cost is for Electonics "+ e.cost());
	}

}
