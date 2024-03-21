package Quiz_01;

public class Producto {

    static private int numeroProductos = 1;
    static private double precioTotal = 0.0;
    static private boolean flag = true;

    private String nombre;
    private Integer index;
    private Double precio;

    public Producto(String nombre, Integer index, Double precio) {
        this.nombre = nombre;
        this.index = index;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public static int getNumeroProductos() {
        return numeroProductos++;
    }

    public static void setNumeroProductos(int numeroProductos) {
        Producto.numeroProductos = numeroProductos;
    }

    public static double getPrecioTotal() {
        return precioTotal;
    }

    public static void setPrecioTotal(double precioTotal) {
        Producto.precioTotal = precioTotal;
    }

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        Producto.flag = flag;
    }

    public static void addToPrecioTotal(Double precio) {
        precioTotal += precio;
    }

}
