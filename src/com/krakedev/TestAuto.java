package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();

		auto1.marca = "Mazda";
		auto1.anio = 2020;
		auto1.precio = 10.000;

		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);
		
		System.out.println("***********************");
		
		auto2.marca = "Toyota";
		auto2.anio = 2000;
		auto1.precio = 60.000;
		
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
	}
}
