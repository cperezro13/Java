//el registro de un estudiante tipo SIA Declararse 5 variables de objetos y 3 de clase
package Entrega_00;

public class Entrega_00 {
    static Entrega_00 obj = new Entrega_00();
    Estudiante estudiante01 = new Estudiante("Criko", "cperez123", "1025524640", 20, "2do Semestre");
    Estudiante estudiante02 = new Estudiante("Pepe", "123456789", "1025430971", 54, "11vo Semestre");

    public static void main(String[] args) {

        obj.imprimirDatos();

    }

    public void imprimirDatos() {

        // Estudiante 01

        System.out.println("Nombre de la universidad: " + Estudiante.getUniversidad());

        System.out.println("Nombre de usuario estudiante 1: " + estudiante01.getUsuario());

        System.out.println("Contraseña estudiante 1: " + estudiante01.getContraseña());

        System.out.println("Documento estudiante 1: " + estudiante01.getCedula());

        System.out.println("Edad estudiante 1: " + estudiante01.getEdad() + "años");

        System.out.println("Semestre estudiante 1: " + estudiante01.getSemestre());

        System.out.println("Año academico actual: " + Estudiante.getañoAcademicoActual());

        System.out.println("Duracion del semestre: " + Estudiante.getDuracionSemestre());

        // Estudiante 02

        System.out.println("Nombre de la universidad: " + Estudiante.getUniversidad());

        System.out.println("Nombre de usuario estudiante 2: " + estudiante02.getUsuario());

        System.out.println("Contraseña estudiante 2: " + estudiante02.getContraseña());

        System.out.println("Documento estudiante 2: " + estudiante02.getCedula());

        System.out.println("Edad estudiante 2: " + estudiante02.getEdad() + "años");

        System.out.println("Semestre estudiante 2: " + estudiante02.getSemestre());

        System.out.println("Año academico actual: " + Estudiante.getañoAcademicoActual());

        System.out.println("Duracion del semestre: " + Estudiante.getDuracionSemestre());

    }
}