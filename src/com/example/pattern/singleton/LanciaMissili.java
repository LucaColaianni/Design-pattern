package com.example.pattern.singleton;

public class LanciaMissili extends Arm {

	public LanciaMissili(String sideLabel) {
		super(sideLabel);
		// TODO Auto-generated constructor stub
	}
	
	public void attacca() {
		System.out.println("Lancio un missile con il braccio "+ this.sideLabel);
	}
}
