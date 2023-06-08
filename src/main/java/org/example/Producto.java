package org.example;

import java.util.Scanner;

public class Producto {

	private String nombre;

	public Producto() {
	}

	public String setNombre() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto: ");
		String name = scanner.next();
		return name;
	}

	@Override
	public String toString() {
		return "Producto{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}