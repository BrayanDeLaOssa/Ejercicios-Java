package com.mycompany.ejercicios;

import java.util.Scanner;

public class NumeroEntero {

    private Scanner scan;

    // Constructor que recibe el Scanner
    public NumeroEntero(Scanner scan) {
        this.scan = scan;
    }

    public void XumEntero() {
        System.out.println("Ingrese un número :");
        int numero = scan.nextInt();

        int contador = 0;
        int negativo = Math.abs(numero);

        if (negativo == 0) {
            contador = 1;
        } else {
            while (negativo > 0) {
                negativo = negativo / 10;
                contador++;
            }
        }
        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");
    }
}
