package model;

public class MallarDuck extends Duck {
	
	public MallarDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlywithWings();
		}
	
	
	
	public void display() {
		System.out.println("mallar duck");
	}


}
