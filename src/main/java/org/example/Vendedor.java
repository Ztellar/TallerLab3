package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {

	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

	public Vendedor() {
	}

	public void despacharPedido() {

	}

	public void venderProductos() {

	}

	public void addPedido() {
		pedidos.add(new Pedido());
	}

	public String setNombre() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto: ");
		String name = scanner.next();
		return name;
	}
	@Override
	public String toString() {
		return "Vendedor{" +
				"pedidos=" + pedidos +
				'}';
	}
}