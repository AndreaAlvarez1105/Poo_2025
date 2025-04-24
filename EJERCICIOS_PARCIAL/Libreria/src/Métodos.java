/*
Ejercicio 1: Gestión de Libros en una Librería
Una librería desea llevar el control de su inventario de libros.

Requisitos:
- Al iniciar, la librería tiene 50 libros del título "Java para principiantes".
- El sistema debe permitir visualizar la cantidad de libros disponibles.
- Al vender libros, se debe descontar del inventario.
- No se deben permitir ventas si no hay suficiente stock.
- También debe poder registrarse la llegada de nuevos libros (añadir al stock).
- Evitar que se ingresen valores negati
 */

import java.util.Scanner;

public class Métodos {
    public static Scanner sc = new Scanner(System.in);

    static int cantidad_libros = 50;

    public static void Imprimir_libros() {
        System.out.println("----Libros disponibles----");
        System.out.println(" -- " +  cantidad_libros + " libros en existencia del título Java para principiantes.");
        System.out.println("---------------------------");
    }

    public static void Venta_libros() {
        int libros_venta;
        System.out.println("---Venta de libros----");
        System.out.println("Cuantos libros desea comprar?: ");
        try {
            libros_venta = sc.nextInt();

            if (libros_venta < cantidad_libros) {
                cantidad_libros = cantidad_libros - libros_venta;
            } else if (libros_venta > cantidad_libros) {
                System.out.println("No hay suficientes libros para comprar");
            }
        } catch (Exception e) {
            System.out.println("Ingrese un valor válido");
            sc.nextLine();
        }
    }

    public static void Agregar_libros() {
        int nuevos_libro = 0;
        System.out.println("---Añadir stock----");
        System.out.println("Cuantos libros desea agregar?: ");
        try {
            nuevos_libro = sc.nextInt();
            if (nuevos_libro < 0) {
                System.out.println("No se aceptan valores negativos");
                cantidad_libros += nuevos_libro;
            }  else{
                cantidad_libros += nuevos_libro;
                System.out.println("Se han agregado " + nuevos_libro + " libros exitosamente");
            }
        } catch (Exception e) {
            System.out.println("Ingrese un valor válido");
            sc.nextLine();
        }

    }



}
