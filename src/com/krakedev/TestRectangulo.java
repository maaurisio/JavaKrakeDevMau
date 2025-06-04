package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();

		int areaR1;
		int areaR2;
		int perimetroR1;
		int perimetroR2;

		r1.base = 10;
		r1.altura = 5;
		
		r2.base = 50;
		r2.altura = 5;
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		
		System.out.println("Area de r1: " + areaR1);
		System.out.println("Area de r2: " + areaR2);
		
		r1.base = 4;
		r1.altura = 2;
		
		r2.base = 9;
		r2.altura = 7;
		
		perimetroR1 = r1.calcularPerimetro();
		System.out.println("Perimtro de r1: " + perimetroR1);
		
		perimetroR2 = r2.calcularPerimetro();
		System.out.println("Perimtro de r2: " + perimetroR2);
		
	}

}
