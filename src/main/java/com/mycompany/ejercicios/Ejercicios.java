package com.mycompany.ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        HashMap<Integer, Runnable> menuinter = new HashMap<>();

        Calculadora calculadora = new Calculadora();
        TablasMultiplicar tablasMultiplicar = new TablasMultiplicar();

        // System.out.println("elija el programa que desea usar");
        menuinter.put(1, () -> calculadora.OperacionesCaluladora());
        menuinter.put(2, () -> tablasMultiplicar.TablesM());
        // int opcion = leer.nextInt();
        int opcion = 0;
        while (opcion != 3) {

            System.out.println("==< Menu Principal >==");
            System.out.println("1 Calculadora");
            System.out.println("2 tablas de multiplicar");
            System.out.println("no found");
            System.out.println("no found");

            opcion = leer.nextInt();
            //leer.close();

            Runnable accion = menuinter.get(opcion);

            if (accion != null) {
                accion.run();
            } else if (opcion != 3) {
                System.out.println("Operacion invalidad");
                // break;
            }

        }
        leer.close();
    }
}
