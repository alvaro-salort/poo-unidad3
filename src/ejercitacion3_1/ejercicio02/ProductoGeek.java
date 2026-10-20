package ejercitacion3_1.ejercicio02;

public class ProductoGeek {
    protected String codigo;
    protected String nombre;
    protected double precioBase;

    public ProductoGeek(String codigo, String nombre, double precioBase) {
        // mensaje de control para observar el orden de ejecucion de los constructores
        System.out.println("Ejecutando constructor de ProductoGeek");
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
