package ejercitacion3_1.ejercicio01;

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

    public static void main(String[] args) {
        Comic comic = new Comic("CG-001", "One Piece", 8500.0, 103);

        System.out.println("--- ACCESO A ATRIBUTOS HEREDADOS (ProductoGeek) ---");
        System.out.printf("Codigo:     %s%n", comic.getCodigo());
        System.out.printf("Nombre:     %s%n", comic.getNombre());
        System.out.printf("PrecioBase: $%.2f%n", comic.getPrecioBase());

        System.out.println("\n--- ACCESO A ATRIBUTOS PROPIOS (Comic) ---");
        System.out.printf("NumeroTomo: %d%n", comic.getNumeroTomo());

        // los atributos protected tambien se leen directo desde la subclase
        System.out.println("\n--- LECTURA DIRECTA DE ATRIBUTOS protected ---");
        System.out.printf("Codigo directo:     %s%n", comic.codigo);
        System.out.printf("NumeroTomo directo: %d%n", comic.numeroTomo);
    }
}
