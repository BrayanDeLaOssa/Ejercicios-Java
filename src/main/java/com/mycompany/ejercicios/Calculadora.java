package com.mycompany.ejercicios;

import java.io.InputStream;
import java.util.Scanner;
//import java.util.ArrayList;

public class Calculadora {

    public boolean OperacionesCaluladora() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la caluladora ");

        System.out.println("Digite un numero :");
        int a = scanner.nextInt();

        System.out.println("Digite un segundo numero :");
        int b = scanner.nextInt();

        System.out.println("---Ingrese que operacion desea realizar----");
        System.out.println("1 Suma :");
        System.out.println("2 Resta :");
        System.out.println("3 Multiplicacion :");
        System.out.println("4 Division :");

        int opcion = scanner.nextInt();
        double resultado = 0;
        switch (opcion) {
            case 1:
                resultado = a + b;
                System.out.println("el resultado de la suma es :" + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println("el resultado de la resta es :" + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("el resultado de la multiplicacion  es :" + resultado);
                break;

            case 4:
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("el resultado de la division es :" + resultado);
                } else {

                    System.out.println("Error no se puede dividir entre 0 ");

                }
                break;
            default:
                System.out.println("porfavor digite una opcion valida 1 al 4");
                break;
        }
        scanner.close();
        return true;

    }

}
