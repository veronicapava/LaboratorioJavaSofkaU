package com.sofka.exercises.Ejercicio6;

public class Ejercicio6 {

    //Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un ciclo for.

    public static void main(String[] args) {
        int numMin = 1;
        int numMax = 100;

        for (int i = numMin; i <= numMax; i++){
            if( i % 2 == 0){
                System.out.println(i + " es par.");
            } else {
                System.out.println(i + " es impar.");
            }
        }
    }
}
