package com.sofka.exercises.Ejercicio17;


public class Electrodomestico {
    double precio = 100;
    Constantes.Colores color = Constantes.Colores.BLANCO;
    Constantes.Consumo consumo = Constantes.Consumo.F;
    double peso = 5;

    public Electrodomestico(){
    }

    public Electrodomestico(double precio, double peso){
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico(double precio, double peso, Constantes.Colores color, char consumo){
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = comprobarConsumoEnergetico(consumo);
    }

    //Metodos

    public double getPrecio() {
        return precio;
    }

    public Constantes.Colores getColor() {
        return color;
    }

    public Constantes.Consumo getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    public Constantes.Consumo comprobarConsumoEnergetico(char letra){
        Constantes.Consumo[] tiposConsumos = Constantes.Consumo.values();
        String l = String.valueOf(letra);

        for(Constantes.Consumo consumo : tiposConsumos){
            if(consumo.toString().equals(l)){
                return consumo;
            }
        }
        return Constantes.Consumo.F;
    }




}
