package ejercitacion3_1.ejercicio09;

public class VerificadorGarantia {

    public void analizarGarantia(ProductoGeek p) {
        if (p instanceof VideojuegoFisico) {
            // downcasting seguro: solo se ejecuta si la comprobacion fue verdadera
            VideojuegoFisico juego = (VideojuegoFisico) p;
            System.out.println("[OK] Videojuego fisico | Plataforma: " + juego.getPlataforma()
                    + " | Peso: " + juego.getPesoGramos() + " gr");
        } else if (p instanceof ConsolaEdicionEspecial) {
            ConsolaEdicionEspecial consola = (ConsolaEdicionEspecial) p;
            System.out.println("[OK] Consola edicion especial | Franquicia: " + consola.getNombreFranquicia());
        } else {
            System.out.println("[?] Producto generico sin garantia extendida | " + p.getNombre());
        }
    }

    public static void main(String[] args) {
        ProductoGeek juego = new VideojuegoFisico("VG-045", "Elden Ring", 45999.0, "PS5", 480.0);
        ProductoGeek consola = new ConsolaEdicionEspecial("CE-070", "Switch OLED", 399999.0, "Nintendo");
        ProductoGeek mouse = new ProductoGeek("PG-100", "Mouse Gamer", 45000.0);

        VerificadorGarantia verificador = new VerificadorGarantia();

        System.out.println("--- ANALISIS CON instanceof ---");
        verificador.analizarGarantia(juego);
        verificador.analizarGarantia(consola);
        verificador.analizarGarantia(mouse);

        System.out.println("\n--- PRECIO DE VENTA CON METODO final ---");
        System.out.printf("%-22s $%.2f%n", juego.getNombre(), juego.calcularPrecioVenta());
    }
}
