package com.sofka.exercises.Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    //Crear un programa que pida un numero por teclado y que imprima por
    //pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();
        int secuencia;
        System.out.println("Conteo:");
        for(secuencia = numero; secuencia <= 1000 ;secuencia +=2){
            System.out.println(secuencia);
        }
    }
}
