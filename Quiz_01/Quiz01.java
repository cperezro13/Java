package Quiz_01;

import java.util.Scanner;

public class Quiz01 {
    static Quiz01 obj = new Quiz01();
    Scanner s = new Scanner(System.in);

    Producto hamburguesa = new Producto("Hamburguesa", 1, 10.20);
    Producto papas = new Producto("Papas", 2, 2.50);
    Producto helado = new Producto("Helado", 3, 3.75);
    Producto gaseosa = new Producto("Gaseosa", 4, 2.50);

    public static void main(String[] args) {
        obj.imprimirMenu();
    }

    public void imprimirMenu() {
        while (Producto.isFlag()) {
            System.out.println("\nIngrese el numero de su producto del menu:");
            System.out.println(
                    "[" + hamburguesa.getIndex() + "] " + hamburguesa.getNombre() + " $" + hamburguesa.getPrecio());
            System.out.println(
                    "[" + papas.getIndex() + "] " + papas.getNombre() + " $" + papas.getPrecio());
            System.out.println(
                    "[" + helado.getIndex() + "] " + helado.getNombre() + " $" + helado.getPrecio());
            System.out.println(
                    "[" + gaseosa.getIndex() + "] " + gaseosa.getNombre() + " $" + gaseosa.getPrecio());
            System.out.println("[0] Salir");

            int input = s.nextInt();

            if (input == hamburguesa.getIndex()) {
                Producto.addToPrecioTotal(hamburguesa.getPrecio());
                System.out.println("Usted ha elegido hamburguesa !");

            } else if (input == papas.getIndex()) {
                Producto.addToPrecioTotal(papas.getPrecio());
                System.out.println("Usted ha elegido papas!");

            } else if (input == helado.getIndex()) {
                Producto.addToPrecioTotal(helado.getPrecio());
                System.out.println("Usted ha elegido helado!");

            } else if (input == gaseosa.getIndex()) {
                System.out.println("Usted ha elegido gaseosa!");
                Producto.addToPrecioTotal(gaseosa.getPrecio());

            } else if (input == 0) {
                System.out.println("Saliendo del programa...");
                Producto.setFlag(false);

            } else {
                System.out.println("Opción inválida. Por favor, elija un número válido del menú.");
            }
            System.out.println("Numero de productos elegidos: " + Producto.getNumeroProductos());
            System.out.println("Precio de productos elegidos: " + Producto.getPrecioTotal());

        }
        s.close();
    }
}
