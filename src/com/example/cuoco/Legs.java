package com.example.cuoco;

public class Legs extends Moveable {
	
	@Override
	public void muovitiASinistra() {
		System.out.println("Mi sposto a sinistra");
	}
	
	@Override
	public void muovitiADestra() {
		System.out.println("Mi sposto a destra");
	}
}
