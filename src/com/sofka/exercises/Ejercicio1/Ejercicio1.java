package com.sofka.exercises.Ejercicio1;

public class Ejercicio1 {
    //Declara 2 variables numericas(con el valor que desees), he indica cual es mayor de los dos.
    // Si son iguales indicarlo tambien. Ve cambiando los valores para comprobar que funciona

    public static void main(String[] args) {
        int variableA = 50;
        int variableB = 50;

        if(variableA > variableB){
            System.out.println("La variable A es mayor que variable B");
        } else if (variableA == variableB ){
            System.out.println("Las variables tienen el mismo valor");
        } else if(variableB > variableA){
            System.out.println("La variable B es mayor que la variable A");
        }
    }

}
