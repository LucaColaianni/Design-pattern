package com.example.cuoco;

public class Assassina extends Moveable implements CanCook {

	@Override
	public void cucina() {
		System.out.println("Sto cucinando un'assassina con le gambe");

	}

	@Override
	void muovitiASinistra() {
		System.out.println("Mi sposto a sinistra");

	}

	@Override
	void muovitiADestra() {
		System.out.println("Mi sposto a destra");
		
	}

}
