package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();

		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Medicamentos utilizados para aliviar el dolor y reducir la fiebre.";
		productoA.precio = 2.00;
		productoA.stockActual = 5;
		System.out.println("***********************");

		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock Actual: " + productoA.stockActual);

		System.out.println("***********************");

		Producto productoB = new Producto();

		productoB.nombre = "Crema hidratante";
		productoB.descripcion = "Productos tópicos que ayudan a mantener la piel hidratada, suave y saludable.";
		productoB.precio = 40.00;
		productoB.stockActual = 500;

		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock Actual: " + productoB.stockActual);

		System.out.println("***********************");

		Producto productoC = new Producto();

		productoC.nombre = "Multivitamínicos";
		productoC.descripcion = "Complementos alimenticios que proporcionan nutrientes adicionales para apoyar la salud y el bienestar.";
		productoC.precio = 20.00;
		productoC.stockActual = 30;

		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock Actual: " + productoC.stockActual);

		System.out.println("***********************");

	}

}
