package com.sofka.exercises.Ejercicio16;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private long dni = 0;
    private char sexo = 'H';
    private int peso = 0;
    private int altura = 0;
    private char[] letras ={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};


    private int bajoPeso = -1;
    private int pesoNormal = 1;
    private int sobrepeso = 1;

    public Persona(String nombre, int edad, int peso, double altura) {
    }


    public void Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;

    }

    public void Persona(String nombre, int edad, long dni, char sexo, int peso, int altura){
        this.nombre = nombre;
        this.edad=edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    //metodos

    public int calcularIMC(int peso, int altura){
        int IMC = (int) (peso / (Math.pow(altura, 2)));
        if(IMC < 20 ){
            System.out.println("Estas por debajo de tu peso ideal");
        } else if(IMC >= 20 && IMC <= 25){
            System.out.println("Estas en tu peso ideal");
        } else if(IMC > 25){
            System.out.println("Tienes sobrepeso");
        }else{
            System.out.println("Ingresa un valor para calcular tu IMC");
            return 0;
        }
        return IMC;
    }

    public boolean esMayorDeEdad(int edad){
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
            return true;
        }else {
            System.out.println("No eres mayor de edad");
            return false;
        }
    }

    public char comprobarSexo(String sexo){
        if(sexo == 'M'){
            return 'M';
        } else {
            return  'H';
        }
    }

    public String toSting(){
        return "-Nombre: " + this.nombre +
                "\n-Edad: " + this.edad +
                "\n-Sexo:" + this.sexo +
                "\n-DNI: " + this.generarDNI() +
                "\n--Peso: " + this.peso +
                "\n-Altura: " + this.altura;
    }

    public String generarDNI(){
        int numeroDNI = (int) (Math.random() * (99999999 - 10000000) + 10000000);
        int residuo = numeroDNI % 23;
        char letraDNI = letras[residuo];
        String DNI = String.valueOf(numeroDNI) + letraDNI;
        return DNI;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}

