package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		double resultadoAreaCua;
		double resultadoPerCua;
		// TODO Auto-generated method stub
		Cuadrado cuadro1 = new Cuadrado();
		Cuadrado cuadro2 = new Cuadrado();
		Cuadrado cuadro3 = new Cuadrado();
		
		cuadro1.lado = 4;
		cuadro2.lado = 9;
		cuadro3.lado = 3;
		
		resultadoAreaCua = cuadro1.calcularArea();
		System.out.println("Area de C1: " + resultadoAreaCua);
		resultadoAreaCua = cuadro2.calcularArea();
		System.out.println("Area de C2: " + resultadoAreaCua);
		resultadoAreaCua = cuadro3.calcularArea();
		System.out.println("Area de C2: " + resultadoAreaCua);
		System.out.println("**********************");
		resultadoPerCua = cuadro1.calcularPerimetro();
		System.out.println("Perimetro de C1: " + resultadoPerCua);
		resultadoPerCua = cuadro2.calcularPerimetro();
		System.out.println("Perimetro de C1: " + resultadoPerCua);
		resultadoPerCua = cuadro3.calcularPerimetro();
		System.out.println("Perimetro de C1: " + resultadoPerCua);
		
	}

}
