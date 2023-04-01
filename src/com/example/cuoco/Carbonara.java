package com.example.cuoco;

public class Carbonara extends Arm{

	public Carbonara(String sideLabel) {
		super(sideLabel);
		// TODO Auto-generated constructor stub
	}
	
	public void cucina() {
		System.out.println("Sto cucinando una carbonara con il braccio " + this.sideLabel);
	}

}
