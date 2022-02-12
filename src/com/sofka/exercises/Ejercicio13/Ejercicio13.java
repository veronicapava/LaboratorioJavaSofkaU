package com.sofka.exercises.Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    //Realizar un algoritmo que permita consultar la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

    public static void main(String[] args) {
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora actual:  \n"+fecha.format(LocalDateTime.now()));
    }
}
