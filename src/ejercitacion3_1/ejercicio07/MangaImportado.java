package ejercitacion3_1.ejercicio07;

public class MangaImportado extends Comic {
    private String paisOrigen;
    private double impuestoAduana;

    public MangaImportado(String codigo, String nombre, double precioBase, int numeroTomo,
                          String paisOrigen, double impuestoAduana) {
        // tercer nivel de la jerarquia: los parametros llegan hasta ProductoGeek
        super(codigo, nombre, precioBase, numeroTomo);
        this.paisOrigen = paisOrigen;
        this.impuestoAduana = impuestoAduana;
    }

    // el impuesto de aduana se suma al precio ya calculado por la superclase
    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + this.impuestoAduana;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getImpuestoAduana() {
        return impuestoAduana;
    }

    public void setImpuestoAduana(double impuestoAduana) {
        this.impuestoAduana = impuestoAduana;
    }

    public static void main(String[] args) {
        MangaImportado manga = new MangaImportado("MI-500", "One Piece", 8500.0, 103, "Japon", 1350.0);
        Comic comic = new Comic("CG-001", "Berserk", 9500.0, 41);

        System.out.println("--- JERARQUIA DE TRES NIVELES ---");
        System.out.println("Nivel 1: ProductoGeek");
        System.out.println("Nivel 2: Comic");
        System.out.println("Nivel 3: MangaImportado\n");

        System.out.println("--- DATOS HEREDADOS Y PROPIOS ---");
        System.out.printf("Codigo:      %s (nivel 1)%n", manga.getCodigo());
        System.out.printf("NumeroTomo:  %d (nivel 2)%n", manga.getNumeroTomo());
        System.out.printf("Pais origen: %s (nivel 3)%n", manga.getPaisOrigen());
        System.out.printf("Impuesto:    $%.2f (nivel 3)%n", manga.getImpuestoAduana());

        System.out.println("\n--- PRECIO DE VENTA CON IMPUESTO ---");
        System.out.printf("Comic (nivel 2):       $%.2f%n", comic.calcularPrecioVenta());
        System.out.printf("MangaImportado:       $%.2f%n", manga.calcularPrecioVenta());
    }
}
