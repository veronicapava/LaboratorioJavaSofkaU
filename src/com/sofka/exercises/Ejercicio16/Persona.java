package com.sofka.exercises.Ejercicio16;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private SexType sexo = SexType.H;
    private float peso = 0.1f;
    private float altura = 0.1f;  // Para evitar division por cero
    private char[] letrasDNI ={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
    private String dni = generarDNI();

    public Persona() {}

    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }


    public Persona(String nombre, int edad, String sexo, float peso, float altura){
        this.nombre = nombre;
        this.edad=edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String printAttributes(){
        return "-Nombre: " + this.nombre +
                "\n-Edad: " + this.edad +
                "\n-Sexo: " + this.sexo +
                "\n-DNI: " + this.dni +
                "\n-Peso: " + this.peso +
                "\n-Altura: " + this.altura;
    }

    private SexType comprobarSexo(String sex){
        if (!sex.equals(SexType.M.toString()) && !sex.equals(SexType.H.toString())) {
            System.out.println("No es un sexo correcto, configurado H por defecto");
            return SexType.H;
        }
        return (sex.equals(SexType.M.toString())) ? SexType.M: SexType.H;
    }


    public void setSexo(String sex) {
        this.sexo =  (sex.equals(SexType.M.toString())) ? SexType.M: SexType.H;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean esMayorDeEdad(){
        boolean esMayor = edad >= 18;
        String out = (esMayor) ? "Eres ": "No eres ";
        System.out.println(out + "mayor de edad");
        return esMayor;
    }


    public int calcularIMC(){
        double IMC = (peso / (altura * altura));
        System.out.println("Tu valor IMC: " + String.format("%.1f",IMC));
        int out = 0;

        if(IMC < 20 ){
            System.out.println("Estas por debajo de tu peso ideal");
            out = -1;
        }
        if(IMC >= 20 && IMC <= 25){
            System.out.println("Estas en tu peso ideal");
            out = 0;
        }
        if(IMC > 25){
            System.out.println("Tienes sobrepeso");
            out = 1;
        }
        return out;
    }

    // metodo usando esta formula https://www.letranif.com/formula-para-calcular-nif/
    public String generarDNI(){
        int numeroDNI = (int) (Math.random() * (99999999 - 10000000) + 10000000);
        int indice = numeroDNI % 23;
        char letraDNI = letrasDNI[indice];
        return numeroDNI + "-" + letraDNI;
    }
}

