package com.example.pattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class JeegFactorySingleton {

	//devo controllare ad ogni richiesta di un nuovo componenete se è già presente in memoria.
	private Map<JeegComponentType, Object> registry = new HashMap<JeegComponentType, Object>();
	
	
	public Object instance(JeegComponentType componentType) {
	 
		
		return registry.get(componentType);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T instanceCasting(JeegComponentType componentType, Class<T> classType) {
	//un cliente mi chiede di restituire un componentype per jeeg
		
		switch(componentType) {
		case Legs:
		//prima di restituirlo controllo se esiste già nel mio registro
		if(!registry.containsKey(componentType)) {
			registry.put(componentType, new Legs());
		}
			break;
		
		case Tank:
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Tank());
			}
			break;
			
		case LanciaMissiliDx:
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new LanciaMissili("Destro"));
			}
			break;
			
		case LanciaMissiliSx:
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new LanciaMissili("Sinistro"));
			}
			break;
			
		case LaserDx:
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Laser("Destro"));
			}
			break;
			
		case LaserSx:
			if(!registry.containsKey(componentType)) {
				registry.put(componentType, new Laser("Sinistro"));
			}
			break;
		}
		
		return (T) registry.get(componentType);
	}

	
}
