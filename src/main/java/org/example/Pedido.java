package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void addProducto() {
		productos.add(new Producto());
	}

	public String setNombre() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto: ");
		String name = scanner.next();
		return name;
	}
	@Override
	public String toString() {
		return "Pedido{" +
				"productos=" + productos +
				'}';
	}
}