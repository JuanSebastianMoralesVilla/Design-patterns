package model;

public abstract class Duck {
	
	
	//instancia de variables de comportamiento
	
	// compartamiento de vuelo
	FlyBehavior flyBehavior;
	// comportamiento de quack 
	QuackBehavior quackBehavior;
	
	
	
	
	
	// mostrar en pantalla
	public abstract void display();

	//metodo comportamiento de volar
	
	public void performFly() {
		flyBehavior.fly();
	}

	// metodo comportamiento de quack
	public void performQuack() {
		quackBehavior.quack();
	}

	
	// metodo de nadar
	public void swim() {
		
		System.out.println("patos al agua");
	}
	
	// Podemos llamar a estos métodos siempre que queramos cambiar el comportamiento de un pato en el sistema.
		public void setFlyBehavior(FlyBehavior fb) {
			flyBehavior = fb;
		}

		public void setQuackBehavior(QuackBehavior qb) {
			quackBehavior = qb;
		}
		
}
