package com.EveryDayGoodProducts.BusinessLogicLayer;

/**
 * 
 * @author OM ASHISH MISHRA
 *
 */

/* FoodItems - This class contains the details of the FoodItems goods details and the operations related to it. */
public class FoodItems extends AllProducts{
	
	/* The Various Needed data fields */
	private int foodId;
	private String foodName;
	private double foodPriceUnit;
	private int foodSize;
	private String foodManufactureDate;
	private String foodExpiryDate;
	private String vegetarian;
	private int quantity;
	
	
	/* Default Constructor */
	public FoodItems() {
		// TODO Auto-generated constructor stub
	}


	/* Parameterized Constructor to get the First Initializations */
	public FoodItems(int foodId, String foodName, double foodPriceUnit, int foodSize, String foodManufactureDate,
			String foodExpiryDate, String vegetarian, int quantity) {
		super(foodName);
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPriceUnit = foodPriceUnit;
		this.foodSize = foodSize;
		this.foodManufactureDate = foodManufactureDate;
		this.foodExpiryDate = foodExpiryDate;
		this.vegetarian = vegetarian;
		this.quantity = quantity;
	}

	

	

	/**
	 * Get Hashcode for handling NullPointException and Address Related Issues 
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((foodExpiryDate == null) ? 0 : foodExpiryDate.hashCode());
		result = prime * result + foodId;
		result = prime * result + ((foodManufactureDate == null) ? 0 : foodManufactureDate.hashCode());
		result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(foodPriceUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + foodSize;
		result = prime * result + quantity;
		result = prime * result + ((vegetarian == null) ? 0 : vegetarian.hashCode());
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
		FoodItems other = (FoodItems) obj;
		if (foodExpiryDate == null) {
			if (other.foodExpiryDate != null)
				return false;
		} else if (!foodExpiryDate.equals(other.foodExpiryDate))
			return false;
		if (foodId != other.foodId)
			return false;
		if (foodManufactureDate == null) {
			if (other.foodManufactureDate != null)
				return false;
		} else if (!foodManufactureDate.equals(other.foodManufactureDate))
			return false;
		if (foodName == null) {
			if (other.foodName != null)
				return false;
		} else if (!foodName.equals(other.foodName))
			return false;
		if (Double.doubleToLongBits(foodPriceUnit) != Double.doubleToLongBits(other.foodPriceUnit))
			return false;
		if (foodSize != other.foodSize)
			return false;
		if (quantity != other.quantity)
			return false;
		if (vegetarian == null) {
			if (other.vegetarian != null)
				return false;
		} else if (!vegetarian.equals(other.vegetarian))
			return false;
		return true;
	}

	
	/**
	 * Get the Details of the Customer in a Array like manner
	 * 
	 */
	@Override
	public String toString() {
		return "FoodItems [foodId=" + foodId + ", foodName=" + foodName + ", foodPriceUnit=" + foodPriceUnit
				+ ", foodSize=" + foodSize + ", foodManufactureDate=" + foodManufactureDate + ", foodExpiryDate="
				+ foodExpiryDate + ", vegetarian=" + vegetarian + ", quantity=" + quantity + "]";
	}


	
	/**
	 * Getter and Setter Functions for the details taken under Parameterized Constructor
	 * 
	 */
	public int getFoodId() {
		return foodId;
	}



	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}



	public String getFoodName() {
		return foodName;
	}



	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}



	public double getFoodPriceUnit() {
		return foodPriceUnit;
	}



	public void setFoodPriceUnit(double foodPriceUnit) {
		this.foodPriceUnit = foodPriceUnit;
	}



	public int getFoodSize() {
		return foodSize;
	}



	public void setFoodSize(int foodSize) {
		this.foodSize = foodSize;
	}



	public String getFoodManufactureDate() {
		return foodManufactureDate;
	}



	public void setFoodManufactureDate(String foodManufactureDate) {
		this.foodManufactureDate = foodManufactureDate;
	}



	public String getFoodExpiryDate() {
		return foodExpiryDate;
	}



	public void setFoodExpiryDate(String foodExpiryDate) {
		this.foodExpiryDate = foodExpiryDate;
	}



	public String getVegetarian() {
		return vegetarian;
	}



	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**
	 * Cost of the total buying of goods taken from AllProducts class!
	 * 
	 */
	@Override
	public double cost() {
		double pay = getFoodPriceUnit()*getQuantity();
		return pay;
	}
	
	
	

	
}