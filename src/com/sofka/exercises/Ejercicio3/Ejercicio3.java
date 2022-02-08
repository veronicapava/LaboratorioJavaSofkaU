package com.sofka.exercises.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    //Haz una aplicación que calcule el área de un círculo(pi*R2).
    // El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculemos el área de un circulo");

        System.out.println("Por favor ingresa el radio del círculo");
        double radio = sc.nextDouble();
        final double PI = Math.PI;
        double area = PI * (Math.pow(radio,2));

        System.out.println("El área del círculo es: " + area);
    }
}
