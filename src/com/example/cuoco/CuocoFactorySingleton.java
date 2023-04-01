package com.example.cuoco;

import java.util.HashMap;
import java.util.Map;

public class CuocoFactorySingleton {
	
	private Map<CuocoComponentType, Object> registry = new HashMap<CuocoComponentType , Object>();
	
	public Object instance(CuocoComponentType componentType) {
		
		switch (componentType){
		case Legs:
			//controllo se esiste già nel registro
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Legs());
			}
			break;
			
		case Assassina : 
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Assassina());
			}
			break;
			
		case CarbonaraSx :
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Carbonara("Sinistro"));
			}
			break;
			
		case CarbonaraDx :
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Carbonara("Destro"));
			}
			break;
			
		case FrittataSx :
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Frittata("Sinistro"));
			}
			break;
			
		case FrittataDx :
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Frittata("Destro"));
			}
			break;
			
		}
		return registry.get(componentType);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T instanceCasting(CuocoComponentType componentType, Class<T> classType) {
		
		switch (componentType){
		case Legs:
			//controllo se esiste già nel registro
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Legs());
			}
			break;
			
		case Assassina : 
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Assassina());
			}
			break;
			
		case CarbonaraSx :
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Carbonara("Sinistro"));
			}
			break;
			
		case CarbonaraDx :
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Carbonara("Destro"));
			}
			break;
			
		case FrittataSx :
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Frittata("Sinistro"));
			}
			break;
			
		case FrittataDx :
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Frittata("Destro"));
			}
			break;
			
		}
		return (T) registry.get(componentType);
	}

}
