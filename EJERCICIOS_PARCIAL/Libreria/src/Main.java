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

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---MENU---");
            System.out.println("1. Ver libros disponibles \n 2. Comprar libros \n 3. Agregar libros \n 4. Salir");
            System.out.println("Selecciona una opcion: ");
            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        Métodos.Imprimir_libros();
                        break;
                    case 2:
                        Métodos.Venta_libros();
                        break;

                    case 3:
                        Métodos.Agregar_libros();
                        break;
                    case 4:
                        System.out.println("Saliendo........");

                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            } catch (Exception e) {
                System.out.println("Ingrese una opcion valida");
            }
        } while (opcion != 4);
    }
}