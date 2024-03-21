/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica_01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Practica_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                System.out.println("Hola mundo");
                //Variable, referencia , calse , objeto , instancia
		Scanner lector = new Scanner(System.in);

                System.out.println("Ingrese un numero Int: ");
                int val = lector.nextInt();
                byte valb = (byte)val;
                System.out.println("Este es su numero Int: "+val);
                System.out.println("Y este es el tamaño de la variable:" +valb);
                
                
                Estudiante obj1 = new Estudiante();
                
                obj1.Estudiar();
                
                //String name;
                
                //variable local
        lector.close();
    }
}    

