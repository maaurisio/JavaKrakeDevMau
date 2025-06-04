package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2) {
		int resultado;// declarar variable
		resultado = valor1 + valor2;
		return resultado;
	}

	public double restar(int valor1, int valor2) {
		double resultado;// declarar variable
		resultado = valor1 - valor2;
		return resultado;
	}

	public double multiplicar(double valor1, double valor2) {
		double resultado;// declarar variable
		resultado = valor1 * valor2;
		return resultado;
	}

	public double dividir(double valor1, double valor2) {
		double resultado;// declarar variable
		resultado = valor1 / valor2;
		return resultado;
	}

	public double promediar(double valor1, double valor2, double valor3) {
		double resultado;// declarar variable
		resultado = (valor1 + valor2 + valor3) / 3;
		return resultado;
	}

	public void mostrarResultado() {
		System.out.println("AHORITA NO JOVEN, SALÍ AL ALMUERZO. REGRESO EN 15MIN");
	}
}
