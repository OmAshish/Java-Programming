package com.EveryDayGoodProducts.BusinessLogicLayer;

/**
 * 
 * @author OM ASHISH MISHRA
 *
 */

/* Apparel - This class contains the details of the Apparel goods details and the operations related to it. */
public class Apparel extends AllProducts {
	
	/* The Various Needed data fields */
	private int apparelId;
	private String apparelName;
	private double apparelPrice;
	private int apparealSize;
	private String apparelMaterial;
	private int apparelQuantity;
	
	/* Default Constructor */
	public Apparel() {
		// TODO Auto-generated constructor stub
	}
	
	/* Parameterized Constructor to get the First Initializations */
	public Apparel(int apparelId, String apparelName, double apparelPrice, int apparealSize, String apparelMaterial,
			int apparelQuantity) {
		super(apparelName);
		this.apparelId = apparelId;
		this.apparelName = apparelName;
		this.apparelPrice = apparelPrice;
		this.apparealSize = apparealSize;
		this.apparelMaterial = apparelMaterial;
		this.apparelQuantity = apparelQuantity;
	}

	
	/**
	 * Get Hashcode for handling NullPointException and Address Related Issues 
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + apparealSize;
		result = prime * result + apparelId;
		result = prime * result + ((apparelMaterial == null) ? 0 : apparelMaterial.hashCode());
		result = prime * result + ((apparelName == null) ? 0 : apparelName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(apparelPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + apparelQuantity;
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
		Apparel other = (Apparel) obj;
		if (apparealSize != other.apparealSize)
			return false;
		if (apparelId != other.apparelId)
			return false;
		if (apparelMaterial == null) {
			if (other.apparelMaterial != null)
				return false;
		} else if (!apparelMaterial.equals(other.apparelMaterial))
			return false;
		if (apparelName == null) {
			if (other.apparelName != null)
				return false;
		} else if (!apparelName.equals(other.apparelName))
			return false;
		if (Double.doubleToLongBits(apparelPrice) != Double.doubleToLongBits(other.apparelPrice))
			return false;
		if (apparelQuantity != other.apparelQuantity)
			return false;
		return true;
	}
	
	
	/**
	 * Get the Details of the Customer in a Array like manner
	 * 
	 */
	@Override
	public String toString() {
		return "Apparel [apparelId=" + apparelId + ", apparelName=" + apparelName + ", apparelPrice=" + apparelPrice
				+ ", apparealSize=" + apparealSize + ", apparelMaterial=" + apparelMaterial + ", apparelQuantity="
				+ apparelQuantity + "]";
	}
	
	
	/**
	 * Getter and Setter Functions for the details taken under Parameterized Constructor
	 * 
	 */
	public int getApparelId() {
		return apparelId;
	}

	public void setApparelId(int apparelId) {
		this.apparelId = apparelId;
	}

	public String getApparelName() {
		return apparelName;
	}

	public void setApparelName(String apparelName) {
		this.apparelName = apparelName;
	}

	public double getApparelPrice() {
		return apparelPrice;
	}

	public void setApparelPrice(double apparelPrice) {
		this.apparelPrice = apparelPrice;
	}

	public int getApparealSize() {
		return apparealSize;
	}

	public void setApparealSize(int apparealSize) {
		this.apparealSize = apparealSize;
	}

	public String getApparelMaterial() {
		return apparelMaterial;
	}

	public void setApparelMaterial(String apparelMaterial) {
		this.apparelMaterial = apparelMaterial;
	}

	public int getApparelQuantity() {
		return apparelQuantity;
	}

	public void setApparelQuantity(int apparelQuantity) {
		this.apparelQuantity = apparelQuantity;
	}
	
	/**
	 * Cost of the total buying of goods taken from AllProducts class!
	 * 
	 */
	@Override
	public double cost() {
		double pay = getApparelPrice()*getApparelQuantity();
		return pay;
	}
	

}
