package model;

class DuckSimulator {

	public static void main(String[] args) {

		Duck mallard = new MallarDuck();
		/*
		 * (es decir, llama a quack() en la referencia quackBehavior heredada del pato)
		 */
		System.out.println("mallard duck");
		mallard.performQuack();

		/*
		 * Luego hacemos lo mismo con el método heredado de MallardDuc k heredado
		 * performFly().
		 *
		 */
		mallard.performFly();
		mallard.swim();
		System.out.println("**********");
		Duck model = new ModelDuck();

		/*
		 * La primera llamada a performFly() delega al objeto flyBehavior establecido en
		 * el constructor del ModelDuck, que es una instancia de de FlyNoWay.
		 */
		System.out.println("Nuevo modelo de pato ");
		// cambiar dinamicamente el modelo pato
		model.performFly();// invoca al metodo heredado del modelo
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
System.out.println("********");
		Duck ironman = (Duck) new DuckIronMan();
		System.out.println("Pato iron man");
		ironman.performFly();
		ironman.setFlyBehavior(new FlyLikeIronMan());
		ironman.performFly();

		// otro ejemplo: pato cabeza roja, no puede volar, mudo y nada
		System.out.println("**********");

		System.out.println("red head duck ");
		Duck redHeadDuck = new RedHeadDuck();
		redHeadDuck.performFly();
		redHeadDuck.setQuackBehavior(new MuteQuack());
		redHeadDuck.performQuack();
		redHeadDuck.swim();

	}

}