package com.abc;

import java.util.Scanner;

public class Ejercicio1 {
    static int contadorMayor = 0;
    static int contadorMenor = 0;
    static int edad = 0;
    static int[] arregloMayor = new int[5];
    static int[] arregloMenor = new int[5];


    public static void solicitardatos() {
        Scanner sc = new Scanner(System.in);
        boolean error = true;
        while (error == true) {
            try {
                System.out.print("Ingrese el edad: ");
                edad = sc.nextInt();
                error = false;
            } catch (Exception e) {

                System.out.println("El dato ingresado no es valido " + e);

            }
        }


    }


    public static int ContabilizarEdad(int edad) {

        if (edad >= 18) {
            arregloMayor[contadorMayor] = edad;
            return contadorMayor++;

        } else {
            arregloMenor[contadorMenor] = edad;
            return contadorMenor++;
        }
    }

    public static void imprimir() {
        System.out.println("Cantidad de edades mayores: " + contadorMayor + ": ");
        for (int i = 0; i < contadorMayor; i++) {
            System.out.println(arregloMayor[i]);
        }
        System.out.println("Cantidad de edades menores: " + contadorMenor + ": ");
        for (int i = 0; i < contadorMenor; i++) {
            System.out.println(arregloMenor[i]);
        }
    }

    }

