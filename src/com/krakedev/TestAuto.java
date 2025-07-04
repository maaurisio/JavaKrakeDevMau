package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto autoC = new Auto("Hyundai", 2025, 25.000);

		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		System.out.println("X: "+ autoC.getMarca());

		System.out.println("***********************");
		auto1.setMarca("Mazda");
		auto1.setAnio(2020);
		auto1.setPrecio(10.000);

		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());

		System.out.println("***********************");

		auto2.setMarca("Toyota");
		auto2.setAnio(2000);
		auto2.setPrecio(60.000);

		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}
}
