package com.sofka.exercises.Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    //Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una frase y te la mostraré sin espacios :) ");

        String frase = sc.nextLine();

        String frase2 = frase.replaceAll("\\s+","");

        System.out.println(frase2);
    }
}
