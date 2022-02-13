package com.sofka.exercises.Ejercicio18;

public class Videojuego implements Entregable {
     String titulo = "";
     double horasEstimadas = 10;
     boolean entregado = false;
     String genero = "";
     String compania = "";

     public Videojuego(){

     }

     public Videojuego(String titulo, double horasEstimadas){
         this.titulo = titulo;
         this.horasEstimadas = horasEstimadas;
     }

     public Videojuego(String titulo, double horasEstimadas, String genero, String compania){
         this.titulo = titulo;
         this.horasEstimadas = horasEstimadas;
         this.genero = genero;
         this.compania = compania;
     }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString(){
        return "-Título: " + titulo +
                "\n-Número de horas de juego: " + horasEstimadas +
                "\n-Entregado: " + entregado +
                "\n-Género: "+ genero +
                "\n-Compañia: " + compania;
    }

    @Override
    public boolean entregar() {
            return this.entregado = true;
    }

    @Override
    public boolean devolver() {
         return this.entregado =false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
         Videojuego videoJuegoAComparar = (Videojuego) a;
         return this.horasEstimadas > videoJuegoAComparar.getHorasEstimadas();

    }
}
