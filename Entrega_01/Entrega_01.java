package Entrega_01;

import java.util.Scanner;

public class Entrega_01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese un boolean (True or false): ");
        boolean b = s.nextBoolean();
        System.out.println("Boolean: " + b);
        System.out.println("El tamaño de un bool en bytes es 1 byte");

        System.out.print("Ingrese un char (Caracter unicode): ");
        char c = s.next().charAt(0);
        System.out.println("Char: " + c);
        System.out.println("El tamaño de un char en bytes es: " + Character.SIZE / Byte.SIZE + " bytes.");

        System.out.print("Ingrese un byte (Entero de 8 bits): ");
        byte by = s.nextByte();
        System.out.println("byte: " + by);
        System.out.println("El tamaño de un byte en bytes es: " + Byte.SIZE / Byte.SIZE + " bytes.");

        System.out.print("Ingrese un short (Entero de 16 bits): ");
        short sh = s.nextShort();
        System.out.println("short: " + sh);
        System.out.println("El tamaño de un short en bytes es: " + Short.SIZE / Byte.SIZE + " bytes.");

        System.out.print("Ingrese un int (Entero de 32 bits): ");
        int i = s.nextInt();
        System.out.println("int: " + i);
        System.out.println("El tamaño de un int en bytes es: " + Integer.SIZE / Byte.SIZE + " bytes.");

        System.out.print("Ingrese un long (Entero de 64 bits): ");
        long l = s.nextLong();
        System.out.println("long: " + l);
        System.out.println("El tamaño de un long en bytes es: " + Long.SIZE / Byte.SIZE + " bytes.");

        System.out.print("Ingrese un float (Numero flotante de 32bits): ");
        float f = s.nextFloat();
        System.out.println("float: " + f);
        System.out.println("El tamaño de un float en bytes es: " + Float.SIZE / Byte.SIZE + " bytes.");

        System.out.print("Ingrese un double (Numero flotante de 64bits): ");

        double d = s.nextDouble();
        System.out.println("double: " + d);
        System.out.println("El tamaño de un double en bytes es: " + Double.SIZE / Byte.SIZE + " bytes.");

        s.close();
    }
}
