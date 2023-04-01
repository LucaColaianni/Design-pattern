package com.example.pattern.singleton;

public class App {

	public static void main(String[] args) {

		JeegFactorySingleton jeegFactorySingleton = new  JeegFactorySingleton();
		//LanciaMissili lm = (LanciaMissili)jeegFactorySingleton.instance(JeegComponentType.LanciaMissiliDx);
		//LanciaMissili lm2 = (LanciaMissili)jeegFactorySingleton.instance(JeegComponentType.LanciaMissiliDx);
		
		
		LanciaMissili lm = jeegFactorySingleton.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);
		LanciaMissili lms = jeegFactorySingleton.instanceCasting(JeegComponentType.LanciaMissiliSx, LanciaMissili.class);
		Laser laser = jeegFactorySingleton.instanceCasting(JeegComponentType.LaserSx, Laser.class);
		Legs legs = jeegFactorySingleton.instanceCasting(JeegComponentType.Legs, Legs.class);
		Legs legs2 = jeegFactorySingleton.instanceCasting(JeegComponentType.Legs, Legs.class);

		LanciaMissili lm2 = jeegFactorySingleton.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);

		Jeeg j1 = new Jeeg(lm, laser, legs);
		Jeeg j2 = new Jeeg(lm, lm, legs2);

		
		
	}

}
