package Practica_00;

public class Practica_00 {

    // private static int cantMotos;
    // private static Integer NumTempo;
    private float nivelPrac;
    private int edad;

    public static void main(String[] args) {

        // int val;
        Practica_00 practicante1 = new Practica_00();
        Motos moto1 = new Motos("Honda");

        System.out.println("Este es el nivel del obj1: " + practicante1.nivelPrac);

        System.out.println("Esta es la marca de moto: " + moto1.getMarca());

        System.out.println("Este es el nombre del practicante: " + Integer.valueOf(practicante1.edad));
        // Realizar el registro de un estudiante tipo SIA Declararse 5 variables de
        // objetos y 3 de clase

    }

    // private static void Entrenar() {

    // }

}
