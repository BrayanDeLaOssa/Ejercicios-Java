package com.mycompany.ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        HashMap<Integer, Runnable> menuinter = new HashMap<>();

        Calculadora calculadora = new Calculadora();
        TablasMultiplicar tablasMultiplicar = new TablasMultiplicar();
        NumeroEntero numeroEntero = new NumeroEntero(leer); // pasar el mismo Scanner

        menuinter.put(1, () -> calculadora.OperacionesCaluladora());
        menuinter.put(2, () -> tablasMultiplicar.TablesM());
        menuinter.put(3, () -> numeroEntero.XumEntero());

        int opcion = 0;
        while (opcion != 4) {

            System.out.println("==< Menu Principal >==");
            System.out.println("1 Calculadora");
            System.out.println("2 tablas de multiplicar");
            System.out.println("3 numero entero");
            System.out.println("4 salir");

            opcion = leer.nextInt();

            Runnable accion = menuinter.get(opcion);

            if (accion != null) {
                accion.run();
            } else if (opcion != 4) {
                System.out.println("Opción inválida");
            }
        }
        leer.close();
    }
}
