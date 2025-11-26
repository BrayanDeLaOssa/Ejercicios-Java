package com.mycompany.ejercicios;

import java.awt.Container;
import java.util.Scanner;

public class SistemaNotas {

  public boolean Calificaciones() {

    // bloque de logica
    Scanner scanner = new Scanner(System.in);

    String[] N = { "Estuddiante1", "Estudiante2", "Estudiante3" };

    int[] A = { 19, 20 };
    int[] B = { 16, 17, 18 };
    int[] C = { 13, 14, 15 };
    int[] D = { 10, 11, 12 };
    int[] E = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    for (String estudiantes : N) {
      System.out.println("Ingrese  la nota del estudiante :" + estudiantes);
      int nota = scanner.nextInt();

      if (Resultado(A, nota)) {
        System.out.println("Calificacion A+");
      } else if (Resultado(B, nota)) {
        System.out.println("Calificiacion B+");
      } else if (Resultado(C, nota)) {
        System.out.println("Calificacion C+");
      } else if (Resultado(D, nota)) {
        System.out.println("Calificacion D+");
      } else if (Resultado(E, nota)) {
        System.out.println("Calificacion E+");
      }
    }

  return true;
  }

  public boolean Resultado(int[] array, int value) {

    for (int i : array) {
      if (i == value) {
        return true;
      }
    }

    return false;
  }

}
