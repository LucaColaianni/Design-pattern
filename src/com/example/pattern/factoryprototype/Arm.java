package com.example.pattern.factoryprototype;

//devo implementare il'interface e implementare il metodo di canattack
public abstract class Arm implements CanAttack{
	
	protected String sideLabel;
	 
	//costruttore
	public Arm(String sideLabel) {
		super();
		this.sideLabel = sideLabel;
	}
	
	//implementazione metodo
	public void attacca() {}



}
