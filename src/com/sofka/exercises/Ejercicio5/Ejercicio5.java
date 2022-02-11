package com.sofka.exercises.Ejercicio5;

public class Ejercicio5 {
    //Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.

    public static void main(String[] args) {
        int numMinimo = 1;
        int numMaximo = 100;

        while (numMinimo <= numMaximo){
            if(numMinimo % 2 == 0){
                System.out.println(numMinimo + " es par.");
            } else {
                System.out.println(numMinimo + " es impar.");
            }
            numMinimo++;
        }
    }
}
