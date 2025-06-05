package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Medicamentos utilizados para aliviar el dolor y reducir la fiebre.");
		productoA.setPrecio(2.00);
		productoA.setStockActual(5);
		
		System.out.println("***********************");

		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock Actual: " + productoA.getStockActual());

		System.out.println("***********************");

		Producto productoB = new Producto();

		
		productoB.setNombre("Crema hidratante");
		productoB.setDescripcion("Productos tópicos que ayudan a mantener la piel hidratada, suave y saludable.");
		productoB.setPrecio(40.00);
		productoB.setStockActual(500);

		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock Actual: " + productoB.getStockActual());

		System.out.println("***********************");

		Producto productoC = new Producto();
		
		productoC.setNombre("Multivitamínicos");
		productoC.setDescripcion("Complementos alimenticios que proporcionan nutrientes adicionales para apoyar la salud y el bienestar.");
		productoC.setPrecio(20.00);
		productoC.setStockActual(30);
		

		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock Actual: " + productoC.getStockActual());

		System.out.println("***********************");

	}

}
