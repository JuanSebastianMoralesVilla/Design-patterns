package model;

public class MallarDuck extends Duck {
	
	
	//comportamientos de mallardduck se inicializan en el constructor
	
	// MallardDuck hereda el Quack y flyBehavior de la clase Duck. de la clase Pato.
	// hacemos una nueva instancia de una clase concreta de implementación de Quack
	public MallarDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlywithWings();
		}
	
	
	
	public void display() {
		System.out.println("mallar duck");
	}


}
