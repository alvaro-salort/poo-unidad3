package ejercitacion3_1.ejercicio07;

public class Comic extends ProductoGeek {
    private int numeroTomo;

    public Comic(String codigo, String nombre, double precioBase, int numeroTomo) {
        super(codigo, nombre, precioBase);
        this.numeroTomo = numeroTomo;
    }

    public int getNumeroTomo() {
        return numeroTomo;
    }

    public void setNumeroTomo(int numeroTomo) {
        this.numeroTomo = numeroTomo;
    }
}
