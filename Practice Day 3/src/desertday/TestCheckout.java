package desertday;

public class TestCheckout {
	
	public static void main(String[] args) {
		
		Candy can = new Candy("OrangeCandy", 250);
		Cookie cook = new Cookie("ChocoloateCookie",10);
		IceCream ice = new IceCream("Vanilla",10);
		Sundae sun = new Sundae(10);
		
		DessertItem items[] = {can,cook,ice,sun};
		
		Checkout c = new Checkout();
		c.addItems(items);
//		c.getTotalCost();
		
		System.out.println(c);
		c.clearCart();
		System.out.println(c);
		
	}

}
