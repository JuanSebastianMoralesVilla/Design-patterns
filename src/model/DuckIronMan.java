package model;

public class DuckIronMan extends Duck{

	public DuckIronMan() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	
	public void display() {
		System.out.println("Iron man");
	}

}
