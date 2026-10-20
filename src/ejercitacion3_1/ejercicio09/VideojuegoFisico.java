package ejercitacion3_1.ejercicio09;

public class VideojuegoFisico extends ProductoGeek {
    private String plataforma;
    private double pesoGramos;

    public VideojuegoFisico(String codigo, String nombre, double precioBase, String plataforma, double pesoGramos) {
        super(codigo, nombre, precioBase);
        this.plataforma = plataforma;
        this.pesoGramos = pesoGramos;
    }

    // metodo final: ninguna subclase puede sobrescribirlo
    @Override
    public final double calcularPrecioVenta() {
        return super.calcularPrecioVenta() * 1.10;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(double pesoGramos) {
        this.pesoGramos = pesoGramos;
    }
}
