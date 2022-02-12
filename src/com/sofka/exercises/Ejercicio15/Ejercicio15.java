package com.sofka.exercises.Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
   /* Hacer un programa que muestre el siguiente menú de opciones
    ****** GESTION CINEMATOGRÁFICA ********
    1-NUEVO ACTOR
    2-BUSCAR ACTOR
    3-ELIMINAR ACTOR
    4-MODIFICAR ACTOR
    5-VER TODOS LOS ACTORES
    6- VER PELICULAS DE LOS ACTORES
    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
    8-SALIR

    EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU
    Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
    PISTA: COMBINAR SWITCH Y ALGUNO DE LOS BUCLES.*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("\n*************GESTION CINEMATOGRÁFICA*************");
            System.out.println("1- NUEVO ACTOR");
            System.out.println("2- BUSCAR ACTOR");
            System.out.println("3- ELIMINAR ACTOR");
            System.out.println("4- MODIFICAR ACTOR");
            System.out.println("5- VER TODO LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7- VER CATEGORÍA DE LAS PELÍCULAS DE LOS ACTORES");
            System.out.println("8- SALIR");

            System.out.println("Ingrese un número para la acción que desee realizar: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Nuevo actor :)");
                    break;
                case 2:
                    System.out.println("Busca a tu actor favorito :)");
                    break;
                case 3:
                    System.out.println("Eliminar actor :(");
                    break;
                case 4:
                    System.out.println("Modifica la información del actor");
                    break;
                case 5:
                    System.out.println("Ver la lista de los actores");
                    break;
                case 6:
                    System.out.println("Ver películas de los actores");
                    break;
                case 7:
                    System.out.println("Ver categoría de las películas de los actores");
                    break;
                case 8:
                    System.out.println("Saliendo!!!");
                    break;
                    default:
                        System.out.println("OPCIÓN INCORRECTA");
            }
        } while (opcion != 8);

    }


}
