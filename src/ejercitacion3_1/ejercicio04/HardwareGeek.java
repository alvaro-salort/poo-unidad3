package ejercitacion3_1.ejercicio04;

public class HardwareGeek {
    // protected: accesible directamente desde las subclases del mismo paquete
    protected double precioCosto;
    // private: invisible para las subclases, hay que usar el getter publico
    private String numeroSerie;

    public HardwareGeek(double precioCosto, String numeroSerie) {
        this.precioCosto = precioCosto;
        this.numeroSerie = numeroSerie;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
