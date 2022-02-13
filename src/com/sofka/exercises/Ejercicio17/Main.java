package com.sofka.exercises.Ejercicio17;

import static com.sofka.exercises.Ejercicio17.Constantes.Colores.*;

public class Main {

    public static void main(String[] args) {
       Electrodomestico[] electros = new Electrodomestico[10];
       electros[0] = new Television(100,100);
       electros[1] = new Lavadora(50,500);
       electros[2] = new Electrodomestico(10,200,"AZUL",'C');
       electros[3] = new Lavadora(5, 30,230,"ROJO",'B');
       electros[4] = new Television(100,5,50,true,'B', "Blue");
       electros[5] = new Electrodomestico();
       electros[6] = new Television(50,10,60,false,'D',"GRIS");
       electros[7] = new Lavadora(40, 65,800,"NEGRO", 'A');
       electros[8] = new Television(350,50);
       electros[9] = new Lavadora(10,650);

       double precioFinalLavadoras = 0;
       double precioFinalTelevisores = 0;
       double precioFinalElectrodomesticos = 0;

       for (int i = 0; i < 9; i++){
           if(electros[i] instanceof Lavadora){
               precioFinalLavadoras += electros[i].precioFinal();
           }
           if(electros[i] instanceof Television){
               precioFinalTelevisores += electros[i].precioFinal();
           }
           if(electros[i] instanceof Electrodomestico){
               precioFinalElectrodomesticos += electros[i].precioFinal();
           }
       }

        System.out.println("Precio total de lavadoras: " + precioFinalLavadoras);
        System.out.println("Precio total de televisores: " + precioFinalTelevisores);
        System.out.println("Precio total de electrodomesticos: " + precioFinalElectrodomesticos);

        System.out.println("Precio de todos los electrodomesticos: " + (precioFinalLavadoras + precioFinalTelevisores + precioFinalElectrodomesticos));
    }
}
