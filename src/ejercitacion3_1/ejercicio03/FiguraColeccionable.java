package ejercitacion3_1.ejercicio03;

public class FiguraColeccionable extends ProductoGeek {
    private boolean esEdicionLimitada;

    public FiguraColeccionable(String codigo, String nombre, double precioBase, boolean esEdicionLimitada) {
        super(codigo, nombre, precioBase);
        this.esEdicionLimitada = esEdicionLimitada;
    }

    // sobrescritura: la figura limitada vale un 25% mas que el precio base
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

    public static void main(String[] args) {
        ProductoGeek producto = new ProductoGeek("PG-100", "Mouse Gamer", 45000.0);
        FiguraColeccionable figura = new FiguraColeccionable("FC-200", "Figura Luffy", 80000.0, true);

        System.out.println("--- COMPORTAMIENTO DIFERENCIAL DE calcularPrecioVenta() ---");
        System.out.printf("%-28s $%.2f%n", producto.getNombre(), producto.calcularPrecioVenta());
        System.out.printf("%-28s $%.2f%n", figura.getNombre(), figura.calcularPrecioVenta());

        System.out.println("\n--- MISMO METODO, DISTINTO COMPORTAMIENTO ---");
        System.out.printf("ProductoGeek        -> $%.2f%n", producto.calcularPrecioVenta());
        System.out.printf("FiguraColeccionable -> $%.2f (base + 25%%)%n", figura.calcularPrecioVenta());
    }
}
