package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		double resultadoAreaCua;
		double resultadoPerCua;
		// TODO Auto-generated method stub
		Cuadrado cuadro = new Cuadrado();
		
		cuadro.lado = 4;
		
		resultadoAreaCua = cuadro.calcularArea();
		System.out.println("Area de C1: " + resultadoAreaCua);
		
		cuadro.lado = 3;
		resultadoPerCua = cuadro.calcularPerimetro();
		System.out.println("Perimtro de C1: " + resultadoPerCua);

	}

}
