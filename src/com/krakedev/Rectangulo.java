package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;

	public int calcularArea() {
		int area = base * altura;
		return area;
	}

	public int calcularPerimetro() {
		int perimetro = base * 2 + altura  * 2;
		return perimetro;
	}

}
