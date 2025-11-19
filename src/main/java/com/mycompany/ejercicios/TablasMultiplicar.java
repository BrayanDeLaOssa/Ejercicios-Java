package com.mycompany.ejercicios;

import java.util.Scanner;

public class TablasMultiplicar {

    public boolean TablesM() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite un numero :");
        int numero = scanner.nextInt();

        System.out.println("ingrese el multiplicador :");
        int limite = scanner.nextInt();

        for (int i = 0; i <= limite; i++) {

            System.out.println(numero + "x" + i + "=" + (numero * i));
            //break;
        }

// scanner.close(); 
        return true;
    }

}
