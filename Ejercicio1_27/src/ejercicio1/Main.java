package ejercicio1;

import java.util.Scanner;
import static ejercicio1.Conversiones_Datos.*;


public class Main {
    public static void main(String[] args) {
        int menu = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("CONVERSION DE DATOS (M y GB)");
            System.out.println("1. Megas a Gygavytes \n2. Gygabytes a Megas \n3. Salir del programa \nIngrese la opcion:");
            menu = sc.nextInt();


            switch (menu) {
                case 1:
                    System.out.println("----Megas a Gygavytes----");
                    SolicitarDatos();
                    valor_final = CovertirMG_G(valor_inicial);
                    imprimir();
                    break;


                case 2:
                    System.out.println("----Gygabytes a Megas----");
                    SolicitarDatos();
                    valor_final = CovertirG_MG(valor_inicial);
                    imprimir();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...........");
                    break;

                default:
                    System.out.println("Valor ingresado no valido");
            }
        }while(menu != 3);

    }
}