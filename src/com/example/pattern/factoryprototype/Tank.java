package com.example.pattern.factoryprototype;

public class Tank extends Moveable implements CanAttack {

	@Override
	void muovitiInAvanti() {
		// TODO Auto-generated method stub
		System.out.println("Rotolo in avanti");
		
	}
	
	@Override
	public void attacca() {
		// TODO Auto-generated method stub
		System.out.println("Sparo un missile con il Tank");
	}


	@Override
	void muovitiInDietro() {
		// TODO Auto-generated method stub
		System.out.println("Rotolo indietro");
		
	}

}
