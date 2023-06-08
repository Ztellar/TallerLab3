package org.example;

import java.util.Scanner;

public class Menu {
    public Menu() {
        Vendedor Jose = new Vendedor();
        Pedido compra1 = new Pedido();
        Producto jabon = new Producto();
        launch(Jose, compra1,jabon);
    }

    public void launch(Vendedor vend,Pedido ped, Producto prod) {
        boolean mantenerProgramaActivo = true;
        while (mantenerProgramaActivo) {
            int eleccion3 = mostrarOpcionesMenu();
            switch (eleccion3) {
                case 1: //Ver Objeto
                    int eleccion = mostrarOpcionesClases();
                    switch (eleccion) {
                        case 1:
                            prod.toString();
                            break;
                        case 2:
                            ped.toString();
                            break;
                        case 3:
                            vend.toString();
                            break;
                        default:
                            System.out.println("Saliendo...");
                            break;
                    }
                    break;
                case 2: //Modificar Objeto
                    int eleccion2 = mostrarOpcionesClases();
                    switch (eleccion2) {
                        case 1:
                            prod.setNombre();
                            break;
                        case 2:
                            ped.setNombre();
                            break;
                        case 3:
                            vend.setNombre();
                            break;
                        default:
                            System.out.println("Saliendo...");
                            break;
                    }
                    break;
                case 3:
                    mantenerProgramaActivo = false;
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }


    public static int mostrarOpcionesMenu(){
        System.out.println("Bienvenido, seleccione la opcion que desea realizar");
        System.out.println("1.-Ver Objeto");
        System.out.println("2.-Modificar Objeto");
        System.out.println("3.-Salir del programa\n");
        int eleccion = ingresarSoloNumero();
        while (!validarRangoNumero(eleccion, 1, 3)) {
            System.out.println("Ingrese un valor dentro de las opciones: ");
            eleccion = ingresarSoloNumero();
        }
        return eleccion;
    }
    public static int mostrarOpcionesClases(){
        System.out.println("¿Qué clase desea seleccionar?");
        System.out.println("1.-Producto");
        System.out.println("2.-Pedido");
        System.out.println("3.-Vendedor");
        System.out.println("4.-Salir del programa\n");
        int eleccion = ingresarSoloNumero();
        while (!validarRangoNumero(eleccion, 1, 4)) {
            System.out.println("Ingrese un valor dentro de las opciones: ");
            eleccion = ingresarSoloNumero();
        }
        return eleccion;
    }
    public static int ingresarSoloNumero() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Entrada no válida. Ingrese un número entero:");
            in.next();
        }
        int numero = in.nextInt();
        return numero;
    }
    public static boolean validarRangoNumero(int numero, int min, int max) {
        if (numero < min || numero > max) {
            return false;
        }
        return true;
    }
}
