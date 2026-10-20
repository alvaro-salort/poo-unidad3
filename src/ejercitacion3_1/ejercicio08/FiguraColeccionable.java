package ejercitacion3_1.ejercicio08;

public class FiguraColeccionable extends ProductoGeek {
    private boolean esEdicionLimitada;

    public FiguraColeccionable(String codigo, String nombre, double precioBase, boolean esEdicionLimitada) {
        super(codigo, nombre, precioBase);
        this.esEdicionLimitada = esEdicionLimitada;
    }

    @Override
    public double calcularPrecioVenta() {
        if (this.esEdicionLimitada) {
            return this.precioBase * 1.25;
        }
        return super.calcularPrecioVenta();
    }

    public boolean isEsEdicionLimitada() {
        return esEdicionLimitada;
    }

    public void setEsEdicionLimitada(boolean esEdicionLimitada) {
        this.esEdicionLimitada = esEdicionLimitada;
    }
}
