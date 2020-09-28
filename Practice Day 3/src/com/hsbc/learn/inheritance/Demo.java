package com.hsbc.learn.inheritance;

public class Demo extends MyClassLikeAbtractButWithoutAbractKeyword {
	
	public static void main(String[] args) {
		
//		Animal a1= Animal.getterLikeMethodForCreatingObject();
//		a1.walking();
//		
//		Animal a2= Animal.getterLikeMethodForCreatingObject();
//		a2.walking();
//		
//		Animal a3= Animal.getterLikeMethodForCreatingObject();
//		a3.walking();
//		
		//Single object to exit! This is Singleton object Creation.
		
		Elephant e = new Elephant();
		e.eat();
		e.walk();
		e.eatVeg();
		
		Lion l = new Lion();
		l.eat();
		l.walk();
		l.EatMeat();
		
		Human h = new Human();
		h.eat();
		h.walk();
		h.EatMeat();
		h.eatVeg();
		
//		Demo d = new Demo();
////		MyClassLikeAbtractButWithoutAbractKeyword c = new MyClassLikeAbtractButWithoutAbractKeyword();
//		d.hello();
		 
	}

}
