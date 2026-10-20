package ejercitacion3_1.ejercicio06;

public class GestorEtiquetado {

    // el parametro es una referencia de la superclase: puede recibir cualquier subclase
    public void imprimirEtiqueta(ProductoGeek producto) {
        System.out.printf("Nombre: %-22s | Precio de venta: $%.2f%n",
                producto.getNombre(), producto.calcularPrecioVenta());
    }

    public static void main(String[] args) {
        Comic comic = new Comic("CG-001", "Berserk", 9500.0, 41);
        FiguraColeccionable figura = new FiguraColeccionable("FC-200", "Figura Gojo", 120000.0, true);

        GestorEtiquetado gestor = new GestorEtiquetado();

        System.out.println("--- ETIQUETADO POLIMORFICO ---");
        gestor.imprimirEtiqueta(comic);
        gestor.imprimirEtiqueta(figura);

        System.out.println("\n--- MISMA FIRMA, DISTINTO COMPORTAMIENTO EN TIEMPO DE EJECUCION ---");
        ProductoGeek referencia = comic;
        gestor.imprimirEtiqueta(referencia);
        referencia = figura;
        gestor.imprimirEtiqueta(referencia);
    }
}
