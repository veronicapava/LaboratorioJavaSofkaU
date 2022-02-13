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

    public Electrodomestico(double precio, double peso, String color, char consumo){
        this.precio = precio;
        this.peso = peso;
        this.color = comprobarColor(color);
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

    public Constantes.Colores comprobarColor(String color){
        Constantes.Colores[] colores = Constantes.Colores.values();

        for(Constantes.Colores colorito : colores){
            if(colorito.toString().equals(color)){
                return colorito;
            }
        }
        return Constantes.Colores.BLANCO;
    }

    public double precioFinal(){
        double recargoConsumo = 0;
        double recargoPeso = 0;

        switch(consumo){
            case A:
                recargoConsumo = 100;
                break;
            case B:
                recargoConsumo = 80;
                break;
            case C:
                recargoConsumo = 60;
                break;
            case D:
                recargoConsumo = 50;
                break;
            case E:
                recargoConsumo = 30;
                break;
            case F:
                recargoConsumo = 10;
                break;
        }

        if(peso >= 0 && peso < 20){
            recargoPeso = 10;
        }
        else if(peso >= 20 && peso < 50){
            recargoPeso = 50;
        }
        else if(peso >= 50 && peso <80){
            recargoPeso = 80;
        }
        else if(peso >= 80){
            recargoPeso = 100;
        }
        else {
            System.out.println("Error: Precio no puede ser negativo");
        }
        precio = precio + recargoConsumo + recargoPeso;
        return precio;
    }
}
