package ejercitacion3_1.ejercicio10;

import java.util.ArrayList;

public class PromocionGeek {

    // determina el descuento segun el tipo de producto (instanceof)
    public double obtenerDescuento(ProductoGeek p) {
        if (p instanceof Comic) {
            return 0.10;
        } else if (p instanceof FiguraColeccionable) {
            return 0.05;
        }
        return 0.0;
    }

    public String obtenerCategoria(ProductoGeek p) {
        if (p instanceof Comic) {
            return "Comic";
        } else if (p instanceof FiguraColeccionable) {
            return "Figura coleccionable";
        }
        return "Producto general";
    }

    // liquida un lote variado de articulos de la tienda
    public void procesarLote(ArrayList<ProductoGeek> lote) {
        double totalLote = 0;
        int numeroTransaccion = 1;

        System.out.println("--- LIQUIDACION DE STOCK ---");
        for (ProductoGeek producto : lote) {
            double precioVenta = producto.calcularPrecioVenta();
            double descuento = obtenerDescuento(producto);
            double precioFinal = precioVenta - (precioVenta * descuento);
            totalLote += precioFinal;

            System.out.printf("Transaccion %02d | %-20s | %-22s | Venta: $%.2f | Descuento: %.0f%% | Total: $%.2f%n",
                    numeroTransaccion, producto.getNombre(), obtenerCategoria(producto),
                    precioVenta, descuento * 100, precioFinal);
            numeroTransaccion++;
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("Total liquidado: $%.2f%n", totalLote);
    }

    public static void main(String[] args) {
        ArrayList<ProductoGeek> lote = new ArrayList<>();
        lote.add(new Comic("CG-001", "Berserk", 9500.0, 41));
        lote.add(new FiguraColeccionable("FC-200", "Figura Gojo", 120000.0, true));
        lote.add(new IndumentariaGeek("IG-300", "Remera IT Guy", 12999.0, "M", "Algodon"));
        lote.add(new ProductoGeek("PG-100", "Mouse Gamer", 45000.0));

        PromocionGeek promocion = new PromocionGeek();
        promocion.procesarLote(lote);
    }
}
