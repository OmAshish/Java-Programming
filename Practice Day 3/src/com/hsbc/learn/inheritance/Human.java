package com.hsbc.learn.inheritance;

public class Human extends Animal implements Herbivorus, Carnivorus{
	
	@Override
	public void eat(){
		System.out.println("Human eats");
	}
	
	@Override
	public void walk(){
		System.out.println("Human walks");
	}
	
	@Override
	public void eatVeg(){
		System.out.println("Human eats veg.");
	}
	
	@Override
	public void EatMeat(){
		System.out.println("Human eats meat.");
	}

}
