package com.hsbc.learn.inheritance;

public class Lion extends Animal implements Carnivorus{
	
	@Override
	public void eat(){
		System.out.println("Lion Eats");
	}
	
	@Override
	public void walk(){
		System.out.println("Lion Walks");
	}
	
	@Override
	public void EatMeat(){
		System.out.println("Lion eats meat");
	}

}
