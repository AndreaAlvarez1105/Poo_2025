package com.abc;

/**
 * @author Andrea Álvarez
 * @version 2.1
 * */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Ejercicio1.solicitardatos();
            Ejercicio1.ContabilizarEdad(Ejercicio1.edad);
        }
        Ejercicio1.imprimir();

    }
}