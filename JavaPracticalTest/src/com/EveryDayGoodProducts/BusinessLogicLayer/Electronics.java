package com.EveryDayGoodProducts.BusinessLogicLayer;

/**
 * 
 * @author OM ASHISH MISHRA
 *
 */

/* Electronics - This class contains the details of the Electronics goods details and the operations related to it. */
public class Electronics extends AllProducts {
	
	/* The Various Needed data fields */
	private int electronicsCode;
	private String electronicName;
	private double electronicPrice;
	private int electronicsWarranty;
	private int electronicQuantity;
	
	/* Default Constructor */
	public Electronics() {
		// TODO Auto-generated constructor stub
	}
	
	/* Parameterized Constructor to get the First Initializations */
	public Electronics(int electronicsCode, String electronicName, double electronicPrice, int electronicsWarranty,
			int electronicQuantity) {
		super(electronicName);
		this.electronicsCode = electronicsCode;
		this.electronicName = electronicName;
		this.electronicPrice = electronicPrice;
		this.electronicsWarranty = electronicsWarranty;
		this.electronicQuantity = electronicQuantity;
	}
	
	/**
	 * Get Hashcode for handling NullPointException and Address Related Issues 
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((electronicName == null) ? 0 : electronicName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(electronicPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + electronicQuantity;
		result = prime * result + electronicsCode;
		result = prime * result + electronicsWarranty;
		return result;
	}
	
	/**
	 * Get Equals Function for the understanding of the data comparison
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electronics other = (Electronics) obj;
		if (electronicName == null) {
			if (other.electronicName != null)
				return false;
		} else if (!electronicName.equals(other.electronicName))
			return false;
		if (Double.doubleToLongBits(electronicPrice) != Double.doubleToLongBits(other.electronicPrice))
			return false;
		if (electronicQuantity != other.electronicQuantity)
			return false;
		if (electronicsCode != other.electronicsCode)
			return false;
		if (electronicsWarranty != other.electronicsWarranty)
			return false;
		return true;
	}

	/**
	 * Get the Details of the Customer in a Array like manner
	 * 
	 */
	@Override
	public String toString() {
		return "Electronics [electronicsCode=" + electronicsCode + ", electronicName=" + electronicName
				+ ", electronicPrice=" + electronicPrice + ", electronicsWarranty=" + electronicsWarranty
				+ ", electronicQuantity=" + electronicQuantity + "]";
	}

	/**
	 * Getter and Setter Functions for the details taken under Parameterized Constructor
	 * 
	 */
	public int getElectronicsCode() {
		return electronicsCode;
	}

	public void setElectronicsCode(int electronicsCode) {
		this.electronicsCode = electronicsCode;
	}

	public String getElectronicName() {
		return electronicName;
	}

	public void setElectronicName(String electronicName) {
		this.electronicName = electronicName;
	}

	public double getElectronicPrice() {
		return electronicPrice;
	}

	public void setElectronicPrice(double electronicPrice) {
		this.electronicPrice = electronicPrice;
	}

	public int getElectronicsWarranty() {
		return electronicsWarranty;
	}

	public void setElectronicsWarranty(int electronicsWarranty) {
		this.electronicsWarranty = electronicsWarranty;
	}

	public int getElectronicQuantity() {
		return electronicQuantity;
	}

	public void setElectronicQuantity(int electronicQuantity) {
		this.electronicQuantity = electronicQuantity;
	}

	/**
	 * Cost of the total buying of goods taken from AllProducts class!
	 * 
	 */
	@Override
	public double cost() {
		double pay=getElectronicPrice()*getElectronicQuantity();
		return pay;
	}
	
	

}
