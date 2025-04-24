package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversiones_Datos {
    static float valor_inicial;
    static float valor_final;

    public static void SolicitarDatos() {
        boolean  continuar = true;
        Scanner sc = new Scanner(System.in);

        while (continuar == true) {
            try {
                System.out.print("Ingrese valor a convertir: ");
                valor_inicial = sc.nextFloat();
                continuar = false;
            } catch (InputMismatchException e) {
                System.out.println("Error en ingreso de valor -> " + e);
                continuar = true;
            }
        }

    }

    public static float CovertirMG_G (float valor_inicial){
        return valor_inicial/1000;
    }

    public static float CovertirG_MG (float valor_inicial){
        return valor_inicial*1000;
    }

    public static void imprimir (){

        System.out.println("Valor inicial: " + valor_inicial);
        System.out.println("Valor_final Gigabytes: " + valor_final);
    }



}
