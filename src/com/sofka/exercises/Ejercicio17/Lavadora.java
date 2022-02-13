package com.sofka.exercises.Ejercicio17;

public class Lavadora extends Electrodomestico {
    double carga = Constantes.cargaDefecto;

    public Lavadora(){
    }

    public Lavadora(double peso, double precio) {
        this.peso = peso;
        this.precio = precio;
    }
    public Lavadora(double carga, double peso, double precio, String color, char consumo){
        super(precio,peso,color,consumo);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(){
        if(carga > 30) {
            precio = precio + 50;
        }
        super.precioFinal();
        return precio;
    }







}

