package com.sofka.exercises.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
    // El IVA sera una constante que sera del 21%.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculemos el IVA del producto");
        System.out.println("Ingresa el valor del producto");
        double precioProducto = sc.nextDouble();

        final double IVA = 0.21;

        double ivaFinal = (IVA * precioProducto);

        double precioFinal = precioProducto + ivaFinal;

        System.out.println("Este es el precio del producto con IVA: " + precioFinal);
    }

}
