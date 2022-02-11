package com.sofka.exercises.Ejercicio11;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    // Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
    // indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu frase favorita: ");

        String frase = sc.nextLine();
        String fraseSinEspacios= frase.replaceAll(" ","");
        String fraseConv = String.valueOf(fraseSinEspacios.length());

        int conteo = 0;

        char[] arrayLetras = frase.toCharArray();

        for (int i = 0; i < arrayLetras.length; i++) {
            char letraActual = arrayLetras[i];

            if (letraActual == 'a'){
                conteo++;
            }
            if (letraActual == 'e'){
                conteo++;
            }
            if (letraActual == 'i'){
                conteo++;
            }
            if (letraActual == 'o'){
                conteo++;
            }
            if (letraActual == 'u'){
                conteo++;
            }
        }

        System.out.println("La frase tiene una longitud de: " + fraseConv + " y tiene: " + conteo + " vocales.");


    }
}
