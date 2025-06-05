package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha();
		
		fecha1.setAnio(2000);
		fecha1.setMes(9);
		fecha1.setDia(23);
		
		System.out.println("Fecha: " + fecha1.getAnio() +"/"+ fecha1.getMes() );
	}

}
