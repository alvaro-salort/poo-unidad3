package ejercitacion3_1.ejercicio08;

import java.util.ArrayList;

public class CarritoCompras {
    // la lista es heterogenea: puede guardar distintas subclases de ProductoGeek
    private ArrayList<ProductoGeek> listaProductos;

    public CarritoCompras() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(ProductoGeek p) {
        if (p != null) {
            this.listaProductos.add(p);
        }
    }

    // for-each + llamada polimorfica a calcularPrecioVenta() de cada elemento
    public double calcularTotalCarrito() {
        double total = 0;
        for (ProductoGeek producto : this.listaProductos) {
            total += producto.calcularPrecioVenta();
        }
        return total;
    }

    public int cantidadProductos() {
        return this.listaProductos.size();
    }

    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarProducto(new Comic("CG-001", "Berserk", 9500.0, 41));
        carrito.agregarProducto(new FiguraColeccionable("FC-200", "Figura Gojo", 120000.0, true));
        carrito.agregarProducto(new IndumentariaGeek("IG-300", "Remera IT Guy", 12999.0, "M", "Algodon"));
        carrito.agregarProducto(new ProductoGeek("PG-100", "Mouse Gamer", 45000.0));

        System.out.println("--- CARRITO CON COLECCION HETEROGENEA ---");
        System.out.printf("Productos en el carrito: %d%n", carrito.cantidadProductos());
        for (ProductoGeek producto : carrito.listaProductos) {
            System.out.printf("- %-20s $%.2f%n", producto.getNombre(), producto.calcularPrecioVenta());
        }
        System.out.println("----------------------------------------------");
        System.out.printf("Total del carrito: $%.2f%n", carrito.calcularTotalCarrito());
    }
}
