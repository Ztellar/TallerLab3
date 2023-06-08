package org.example;

import java.util.Scanner;

public class Menu {

    public static void launch() {
        int eleccion2 = mostrarOpcionesMenu();
        switch (eleccion2) {
            case 1:
                int eleccion = mostrarOpcionesClases();
                switch (eleccion) {
                    case 1:

                    case 2:

                    case 3:
                    default:
                        System.out.println("Saliendo...");
                        break;
                }
                break;
            case 2:

            case 3:

            case 4:

            default:
                System.out.println("Opción no valida");
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
