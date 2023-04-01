package com.example.pattern.factoryprototype;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Jeeg può attaccare con vari componenti
		//i nostri componenti devono essere più centralizzati non possiamo metterli ttuti nella classe main
		// quindi usiamo il design pattern factory , in base a dei parametri ritorna un oggetto
		/*LanciaMissili lm = new LanciaMissili("Destro");
		Laser laser = new Laser("Sinistro");
		Legs legs = new Legs();*/
		
		//UTILIZZO LA FACTORY PER DECENTRALIZZARE LA CREAZIONE DI OGGETTI
		
		JeegFactoryPrototype jeegFactoryPrototype = new JeegFactoryPrototype();
		LanciaMissili lm =  jeegFactoryPrototype.instanceCasting(JeegComponentType.LanciaMissiliDx , LanciaMissili.class);
		Laser laser = jeegFactoryPrototype.instanceCasting(JeegComponentType.LaserDx , Laser.class);
		Legs legs = jeegFactoryPrototype.instanceCasting(JeegComponentType.Legs , Legs.class);
		Jeeg j1 = new Jeeg(lm, laser, legs);
			
		j1.muovitiInAvanti();
		j1.attacca();
		j1.muovitiInDietro();
	
		
		
	}

}
