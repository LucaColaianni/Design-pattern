package com.example.cuoco;

public class App {

	public static void main(String[] args) {
		
		CuocoFactorySingleton cuocoSingleton = new CuocoFactorySingleton();
		
		Carbonara carbonara = cuocoSingleton.instanceCasting(CuocoComponentType.CarbonaraSx, Carbonara.class);
		Frittata frittata = cuocoSingleton.instanceCasting(CuocoComponentType.FrittataDx, Frittata.class);
		Legs legs = cuocoSingleton.instanceCasting(CuocoComponentType.Legs, Legs.class);
		Assassina assassina = cuocoSingleton.instanceCasting(CuocoComponentType.Assassina, Assassina.class);

		Cuoco cuoco1 = new Cuoco(carbonara, frittata, legs);
		Cuoco cuoco2 = new Cuoco(carbonara, frittata, assassina);

		
	
	}

}
