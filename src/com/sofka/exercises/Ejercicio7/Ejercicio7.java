package com.sofka.exercises.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    //Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
    // si no lo es lo volverá a pedir (do while), después muestra ese número por consola

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingresa un número: ");
            numero = sc.nextInt();
        }while(numero <= 0);

        System.out.println("El número ingresado es: " + numero);

    }
}
