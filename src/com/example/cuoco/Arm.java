package com.example.cuoco;

public abstract class Arm implements CanCook{

	protected String sideLabel;
	
	//costruttore
	public Arm(String sideLabel) {
		super();
		this.sideLabel = sideLabel;
	}
	
	public abstract void cucina();

	
}
