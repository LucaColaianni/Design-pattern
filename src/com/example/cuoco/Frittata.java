package com.example.cuoco;

public class Frittata extends Arm {

	public Frittata(String sideLabel) {
		super(sideLabel);

	}

	@Override
	public void cucina() {
		System.out.println("Sto cucinando una frittata con il braccio " +this.sideLabel);
	}
	
	
}
