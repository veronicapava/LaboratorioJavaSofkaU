package com.sofka.exercises.Ejercicio16;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu sexo. H: Hombre y M: Mujer");
        String sexo = sc.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("Ingresa tu peso en kg");
        float peso = sc.nextFloat();
        System.out.println("Ingresa tu altura en metros");
        float altura = sc.nextFloat();


        System.out.println("\nPersona tipo1, sin valores por defecto");
        Persona pTipo1 = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println( pTipo1.printAttributes());

        System.out.println("\nPersona tipo2, con valores en nombre, edad y sexo. El resto defecto");
        Persona pTipo2 = new Persona(nombre, edad, sexo);
        System.out.println( pTipo2.printAttributes());

        System.out.println("\nPersona tipo3, valores por defecto");
        Persona pTipo3 = new Persona();
        System.out.println( pTipo3.printAttributes());

        pTipo3.setNombre(nombre);
        pTipo3.setEdad(edad);
        pTipo3.setAltura(edad);
        pTipo3.setSexo(sexo);
        pTipo3.setPeso(peso);
        pTipo3.setAltura(altura);

        System.out.println("\nPersona tipo3, con valores seteados");
        System.out.println( pTipo3.printAttributes());

        System.out.println("\nPruebas P1");
        pTipo1.calcularIMC();
        pTipo1.esMayorDeEdad();

        System.out.println("\nPruebas P2");
        pTipo2.calcularIMC();
        pTipo2.esMayorDeEdad();

        System.out.println("\nPruebas P3");
        pTipo3.calcularIMC();
        pTipo2.esMayorDeEdad();

    }
}
