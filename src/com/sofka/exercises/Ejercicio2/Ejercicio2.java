package com.sofka.exercises.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    //Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Por favor ingresa un número");
        int valor1 = sc.nextInt();
        System.out.println("Por favor ingresa un número");
        int valor2 = sc.nextInt();

        if(valor1 > valor2){
            System.out.println("El valor 1 es mayor al valor 2");
        } else if (valor1 == valor2 ){
            System.out.println("Los dos valores son iguales.");
        } else if(valor2 > valor1){
            System.out.println("El valor 2 es mayor que el valor 1");
        }






    }
}
