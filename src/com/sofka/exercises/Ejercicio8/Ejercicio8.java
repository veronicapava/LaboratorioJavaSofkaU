package com.sofka.exercises.Ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    //Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un día de la semana");
        String dia = sc.nextLine().toLowerCase();

        //TODO: ignorar signos de puntuacion

        switch (dia){
            case "lunes":
                System.out.println("Es un día laboral");
                break;
            case "martes":
                System.out.println("Es un día laboral");
                break;
            case "miercoles":
                System.out.println("Es un día laboral");
                break;
            case "jueves":
                System.out.println("Es un día laboral");
                break;
            case "viernes":
                System.out.println("Es un día laboral");
                break;
            case "sabado":
                System.out.println("No es un día laboral");
                break;
            case "domingo":
                System.out.println("No es un día laboral");
                break;
        }

    }
}
