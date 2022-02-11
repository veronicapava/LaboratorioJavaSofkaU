package com.sofka.exercises.Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    //Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una palabra: ");
        String palabra1String = sc.nextLine();
        System.out.println("Ingresa otra palabra: ");
        String palabra2String = sc.nextLine();

        char[] palabra1 = palabra1String.toCharArray();
        char[] palabra2 = palabra2String.toCharArray();

        int l1 = palabra1.length;
        int l2 = palabra2.length;

        boolean sonDif = false;

        int l = (l1 > l2)?l2:l1;

        for(int i = 0; i<l; i++){
            if(palabra1[i] != palabra2[i]){
                System.out.println("\nLas palabras difieren en la letra: " + (i+1));
                System.out.println("Palabra uno tiene: " + palabra1[i] + " Palabra 2 tiene: " + palabra2[i]);
                sonDif = true;
            }
        }

        if(l1 != l2 && sonDif == false){
            sonDif = true;
            System.out.println("\n Las palabras no tienen el mismo tamaño");
        }

        if(sonDif){
            System.out.println("Son diferentes");
        } else {
            System.out.println("Son iguales");
        }
    }
}
