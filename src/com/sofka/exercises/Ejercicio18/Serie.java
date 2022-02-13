package com.sofka.exercises.Ejercicio18;

public class Serie implements Entregable{
    String titulo = "";
    int numTemporadas = 3;
    boolean entregado = false;
    String genero = "";
    String creador = "";

    public Serie(){
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador){
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString(){
        return "-Título: " + titulo +
                "\n-Número de temporadas: " + numTemporadas +
                "\n-Entregado: " + entregado +
                "\n-Género: "+ genero +
                "\n-Creador: " + creador;
    }

    @Override
    public boolean entregar() {
        return this.entregado = true;
    }

    @Override
    public boolean devolver() {
        return this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return  this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        Serie serieAComparar = (Serie) a;
        return this.numTemporadas > serieAComparar.getNumTemporadas();
    }
}
