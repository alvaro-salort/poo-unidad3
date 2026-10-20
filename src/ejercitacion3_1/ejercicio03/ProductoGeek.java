package ejercitacion3_1.ejercicio03;

public class ProductoGeek {
    protected String codigo;
    protected String nombre;
    protected double precioBase;

    public ProductoGeek(String codigo, String nombre, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // comportamiento heredado por defecto: el precio de venta es el precio base
    public double calcularPrecioVenta() {
        return this.precioBase;
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
