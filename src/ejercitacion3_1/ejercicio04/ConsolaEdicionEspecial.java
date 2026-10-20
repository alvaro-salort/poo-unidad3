package ejercitacion3_1.ejercicio04;

public class ConsolaEdicionEspecial extends HardwareGeek {
    private String nombreFranquicia;

    public ConsolaEdicionEspecial(double precioCosto, String numeroSerie, String nombreFranquicia) {
        super(precioCosto, numeroSerie);
        this.nombreFranquicia = nombreFranquicia;
    }

    public double calcularGananciaEstimada(double precioPVP) {
        // precioCosto es protected: se accede DIRECTAMENTE porque la subclase puede
        // ver los miembros protected de su superclase
        double ganancia = precioPVP - this.precioCosto;

        // numeroSerie es private: NO se puede acceder directamente (error de compilacion),
        // hay que invocar el getter publico que expone la superclase
        System.out.printf("Numero de serie consultado via getter: %s%n", getNumeroSerie());

        return ganancia;
    }

    public String getNombreFranquicia() {
        return nombreFranquicia;
    }

    public void setNombreFranquicia(String nombreFranquicia) {
        this.nombreFranquicia = nombreFranquicia;
    }

    public static void main(String[] args) {
        ConsolaEdicionEspecial consola = new ConsolaEdicionEspecial(250000.0, "NS-77A-0092", "Nintendo Switch OLED");

        System.out.println("--- ACCESO A MIEMBROS DE LA SUPERCLASE ---");
        System.out.printf("Franquicia:    %s%n", consola.getNombreFranquicia());
        System.out.printf("Precio costo:  $%.2f%n", consola.getPrecioCosto());
        System.out.printf("Numero serie:  %s%n", consola.getNumeroSerie());

        System.out.println("\n--- GANANCIA ESTIMADA ---");
        double pvp = 399999.0;
        System.out.printf("Precio PVP:      $%.2f%n", pvp);
        System.out.printf("Ganancia:        $%.2f%n", consola.calcularGananciaEstimada(pvp));
    }
}
