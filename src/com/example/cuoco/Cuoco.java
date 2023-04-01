package com.example.cuoco;

public class Cuoco {

	private Arm armDx;
	private Arm armSx;
	private Moveable moveable;
	
	//costruttore
	public Cuoco(Arm armDx, Arm armSx, Moveable moveable) {

		this.setArm(armSx, Side.Sx);
		this.setArm(armDx, Side.Dx);
		this.setMoveable(moveable);
	}

	public Arm getArmDx() {
		return armDx;
	}

	public void setArm(Arm newArm, Side side) {
		if(side == Side.Sx) {
			this.armSx = newArm;
		} else {
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
	 
	public void cucina() {
		this.armDx.cucina();
		this.armSx.cucina();
		if(this.moveable instanceof Assassina) {
			 ((Assassina) this.moveable).cucina();		}
	}


	public void muovitiASinistra() {
		this.moveable.muovitiASinistra();
	}

	public void muovitiADestra() {
		this.moveable.muovitiADestra();
	}


	
	
}
