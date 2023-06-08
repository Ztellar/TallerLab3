package org.example;

import java.util.ArrayList;

public class Vendedor {

	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private String nombre;

	public Vendedor(String nombre) {
		this.nombre = nombre;
	}

	public void despacharPedido() {

	}

	/*public void venderProductos() {
		pedidos.getProductos();
	}*/

	public void addPedido() {
		pedidos.add(new Pedido());
	}

}