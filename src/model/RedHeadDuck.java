package model;

public class RedHeadDuck  extends Duck {

	// nuevo comportamiwnto 
	public RedHeadDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
		}
	public void display() {
		System.out.println("red head duck"
				 );
	}

}
