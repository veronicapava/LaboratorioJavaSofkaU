package com.sofka.exercises.Ejercicio16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("Ingresa tu peso en kg");
        double peso = sc.nextDouble();
        System.out.println("Ingresa tu altura en cm");
        double altura = sc.nextDouble();


        Persona p1 = new Persona(nombre,edad, (int) peso,altura);
        p1.setNombre(nombre);
        p1.setEdad(edad);
        p1.calcularIMC((int) peso, (int) altura);
        p1.esMayorDeEdad(edad);

    }

}
