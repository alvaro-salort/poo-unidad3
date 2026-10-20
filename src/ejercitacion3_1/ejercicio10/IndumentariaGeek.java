package ejercitacion3_1.ejercicio10;

public class IndumentariaGeek extends ProductoGeek {
    private String talle;
    private String material;

    public IndumentariaGeek(String codigo, String nombre, double precioBase, String talle, String material) {
        super(codigo, nombre, precioBase);
        this.talle = talle;
        this.material = material;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
