package ejercitacion3_1.ejercicio05;

public class IndumentariaGeek extends ProductoGeek {
    private String talle;
    private String material;

    public IndumentariaGeek(String codigo, String nombre, double precioBase, String talle, String material) {
        super(codigo, nombre, precioBase);
        this.talle = talle;
        this.material = material;
    }

    // super.toString() reutiliza la representacion en texto de la superclase
    @Override
    public String toString() {
        return super.toString() + " | Talle: " + talle + " | Material: " + material;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static void main(String[] args) {
        IndumentariaGeek remera = new IndumentariaGeek("IG-300", "Remera IT Guy", 12999.0, "M", "Algodon");

        // al imprimir el objeto se invoca automaticamente toString()
        System.out.println("--- IMPRESION DIRECTA DEL OBJETO ---");
        System.out.println(remera);

        System.out.println("\n--- CADENA DE LLAMADAS A toString() ---");
        System.out.println("remera.toString()   -> " + remera.toString());
    }
}
