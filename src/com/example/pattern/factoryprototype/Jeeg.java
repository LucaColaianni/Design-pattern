package com.example.pattern.factoryprototype;

public class Jeeg {
	
	private Arm armDx;
	private Arm armSx;
	private Moveable moveable;
	//costruttore
	public Jeeg(Arm armDx, Arm armSx, Moveable moveable) {
		super();
		this.setArm(armDx, Side.Dx);
		this.setArm(armSx, Side.Sx);
		this.setMoveable(moveable);
	}
	
	public Arm getArmDx() {
		return armDx;
	}
	public void setArm(Arm newArm , Side side) {
		if(side == Side.Sx) {
			this.armSx =newArm; 
		}else {
			this.armDx = newArm;
		}
	}


	public Arm getArmSx() {
		return armSx;
	}
	
	public Moveable getMoveable() {
		return moveable;
	}
	
	public void setMoveable(Moveable moveable) {
		this.moveable = moveable;
	}

	public void attacca() {
		 this.armDx.attacca();
		 this.armSx.attacca();
		 this.armSx.attacca();
		 this.armSx.attacca();
		 if(this.moveable instanceof Tank) {
			 ((Tank) this.moveable).attacca();
		 }

	}

	public void muovitiInAvanti() {
		this.moveable.muovitiInAvanti();
	}
	public void muovitiInDietro() {
		this.moveable.muovitiInDietro();
	}
	
}
	
	



