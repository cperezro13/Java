package Entrega_00;

public class Estudiante {

    // Variables de Clase
    private static String universidad = "Universidad Nacional";
    private static String añoAcademicoActual = "2023-01";
    private static String duracionSemestre = "16 semanas";

    // Variables de Objeto
    private String usuario;
    private String contraseña;
    private String cedula;
    private int Edad;
    private String Semestre;

    public Estudiante(String usuario, String contraseña, String cedula, int Edad, String Semestre) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cedula = cedula;
        this.Edad = Edad;
        this.Semestre = Semestre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }

    public static String getUniversidad() {
        return universidad;
    }

    public static void setUniversidad(String universidad) {
        Estudiante.universidad = universidad;
    }

    public static String getañoAcademicoActual() {
        return añoAcademicoActual;
    }

    public static void setTotalEstudiantesRegistrados(String añoAcademicoActual) {
        Estudiante.añoAcademicoActual = añoAcademicoActual;
    }

    public static String getDuracionSemestre() {
        return duracionSemestre;
    }

    public static void setDuracionSemestre(String duracionSemestre) {
        Estudiante.duracionSemestre = duracionSemestre;
    }

}
