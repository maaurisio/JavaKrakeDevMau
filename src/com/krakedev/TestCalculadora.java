package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double promedio;
		String mensaje;
		

		Calculadora calcu = new Calculadora();
		resultadoSuma = calcu.sumar(4, 7);
		System.out.println("Resultado de la suma: " + resultadoSuma);

		resultadoResta = calcu.restar(8, 10);
		System.out.println("Resultado de la resta: " + resultadoResta);

		resultadoMultiplicacion = calcu.multiplicar(10, 5);
		System.out.println("Resultado de la Multiplicacion: " + resultadoMultiplicacion);

		resultadoDivision = calcu.dividir(10, 2);
		System.out.println("Resultado de la Division: " + resultadoDivision);

		promedio = calcu.promediar(10, 8, 9);
		System.out.println("Resultado de la Division: " + promedio);
		
		calcu.mostrarResultado();
		
	}

}
