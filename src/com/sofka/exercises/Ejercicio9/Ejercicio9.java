package com.sofka.exercises.Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    //Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e,
    // adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.


    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String nuevaFrase = frase.replace("a", "e");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una linda frase :) : ");

        String lindaFrase = sc.nextLine();

        String lindaFrase2 = lindaFrase.replace("a", "e");

        System.out.println( nuevaFrase + " " + lindaFrase2);

    }
}
