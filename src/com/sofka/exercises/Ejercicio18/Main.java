package com.sofka.exercises.Ejercicio18;

public class Main {

    public static void main(String[] args) {
        Serie[] misSeries = new Serie[5];
        Videojuego[] misVideoJuegos = new Videojuego[5];

        misSeries[0] = new Serie("The Vampire Diaries", 8, "Cine romántico/Terror", "Kevin Williamson");
        misSeries[1] = new Serie("Hannah Montana", 4, "Musical", "Michael Poryes");
        misSeries[2] = new Serie("Teen Wolf", 6, "Drama adolescente/Horror", "Jeff Davis");
        misSeries[3] = new Serie("Jonas Brothers", 2, "Comedia", "Michael Curtis");
        misSeries[4] = new Serie("The good doctor", 4, "Drama médico", "David Shore");


        misVideoJuegos[0] = new Videojuego("Crash Bandicoot N. Sane Trilogy", 40, "Acción", "Activision");
        misVideoJuegos[1] = new Videojuego("Candy Crush Saga", 523, "Lógica", "King");
        misVideoJuegos[2] = new Videojuego("Zombie Tsunami", 100, "Plataforma", "Mobigame");
        misVideoJuegos[3] = new Videojuego("Just Dance", 10, "Música", "Ubisoft");
        misVideoJuegos[4] = new Videojuego("Super Mario Bros", 30, "Aventura", "Nintendo");

        misSeries[0].entregar();
        misSeries[3].entregar();
        misVideoJuegos[0].entregar();
        misVideoJuegos[3].entregar();

        int totalSeriesEntregadas = 0;
        int totalJuegosEntregados = 0;

        for (int i = 0; i < misSeries.length; i++) {
            if (misSeries[i].isEntregado()) {
                totalSeriesEntregadas++;
            }
            if (misVideoJuegos[i].isEntregado()) {
                totalJuegosEntregados++;
            }
        }

        System.out.println("Series entregadas: " + totalSeriesEntregadas);
        System.out.println("Videojuegos entregados: " + totalJuegosEntregados);

        System.out.println("\nJuego mas largo es:");
        Videojuego juegoMAsLargo = reducerJuegos(misVideoJuegos);
        System.out.println(juegoMAsLargo.toString());

        System.out.println("\nSerie mas larga es:");
        Serie serieMasLarga = reducerSerie(misSeries);
        System.out.println(serieMasLarga.toString());

    }

    public static Videojuego reducerJuegos (Videojuego[] juegos){
        Videojuego juegoMayorDuracion = juegos[0];
        for (int i = 0; i < juegos.length - 1; i++) {
            Videojuego juegoSiguiente = juegos[i + 1];
            juegoMayorDuracion = (juegoMayorDuracion.compareTo(juegoSiguiente)) ? juegoMayorDuracion : juegoSiguiente;
        }
        return juegoMayorDuracion;
    }

    public static Serie reducerSerie (Serie[] series){
        Serie serieMayorDuracion = series[0];
        for (int i = 0; i < series.length - 1; i++) {
            Serie serieSiguiente = series[i + 1];
            serieMayorDuracion = (serieMayorDuracion.compareTo(serieSiguiente)) ? serieMayorDuracion : serieSiguiente;
        }
        return serieMayorDuracion;
    }


}
