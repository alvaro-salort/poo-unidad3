package ejercitacion3_1.ejercicio02;

public class VideojuegoFisico extends ProductoGeek {
    private String plataforma;
    private double pesoGramos;

    public VideojuegoFisico(String codigo, String nombre, double precioBase, String plataforma, double pesoGramos) {
        // super(...) debe ser SIEMPRE la primera instruccion del constructor de la subclase
        super(codigo, nombre, precioBase);
        System.out.println("Ejecutando constructor de VideojuegoFisico");
        this.plataforma = plataforma;
        this.pesoGramos = pesoGramos;
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

    public static void main(String[] args) {
        System.out.println("=== ORDEN DE EJECUCION DE LOS CONSTRUCTORES ===\n");

        VideojuegoFisico juego = new VideojuegoFisico("VG-045", "Elden Ring", 45999.0, "PS5", 480.0);

        System.out.println("\n--- DATOS DEL VIDEOJUEGO ---");
        System.out.printf("Codigo:      %s%n", juego.getCodigo());
        System.out.printf("Nombre:      %s%n", juego.getNombre());
        System.out.printf("PrecioBase:  $%.2f%n", juego.getPrecioBase());
        System.out.printf("Plataforma:  %s%n", juego.getPlataforma());
        System.out.printf("Peso:        %.2f gr%n", juego.getPesoGramos());
    }
}
