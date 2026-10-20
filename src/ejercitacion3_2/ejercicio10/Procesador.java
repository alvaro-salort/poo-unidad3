package ejercitacion3_2.ejercicio10;

public class Procesador {
    private String marca;
    private String modelo;
    private double frecuenciaGhz;

    public Procesador(String marca, String modelo, double frecuenciaGhz) {
        this.marca = marca;
        this.modelo = modelo;
        this.frecuenciaGhz = frecuenciaGhz;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getFrecuenciaGhz() {
        return frecuenciaGhz;
    }

    @Override
    public String toString() {
        return String.format("Procesador: %s %s | Frecuencia: %.2f GHz", this.marca, this.modelo, this.frecuenciaGhz);
    }
}
