package com.example.cuoco;

public class CuocoFactory {
	
	public Object instance(CuocoComponentType componentType) {
		Object component = null;
		
		switch(componentType) {
		case Legs :
			component = new Legs();
			break;
		case  CarbonaraSx:
			component = new Carbonara("Sinistro");
			break;
		case CarbonaraDx:
			component = new Carbonara("Destro");
		case  FrittataSx:
			component = new Frittata("Sinistro");
			break;
		case  FrittataDx:
			component = new Frittata("Destro");
			break;
		case  Assassina:
			component = new Assassina();
			break;
		
	}
		return component;
	}	
}
