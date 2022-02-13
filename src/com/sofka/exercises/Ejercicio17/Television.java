package com.sofka.exercises.Ejercicio17;

public class Television extends Electrodomestico {
    double resolucion = 20;
    boolean sintonizadorTDT = false;

    public Television(){
        super();
    }

    public Television(double precio, double peso){
        this.precio = precio;
        this.peso = peso;
    }

    public Television( double precio,double peso, double resolucion, boolean sintonizadorTDT,char consumo, String color){
        super(precio,peso, color, consumo);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal(){
        if(resolucion > 40) {
            precio = precio*1.3; //30%
        }
        if(sintonizadorTDT){
            precio += 50;
        }
        super.precioFinal();
        return precio;
    }


}
