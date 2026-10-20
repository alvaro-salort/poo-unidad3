package ejercitacion3_1.ejercicio09;

public class ConsolaEdicionEspecial extends ProductoGeek {
    private String nombreFranquicia;

    public ConsolaEdicionEspecial(String codigo, String nombre, double precioBase, String nombreFranquicia) {
        super(codigo, nombre, precioBase);
        this.nombreFranquicia = nombreFranquicia;
    }

    public String getNombreFranquicia() {
        return nombreFranquicia;
    }

    public void setNombreFranquicia(String nombreFranquicia) {
        this.nombreFranquicia = nombreFranquicia;
    }

    /*
     * Si se intentara heredar de VideojuegoFisico y sobrescribir el metodo final,
     * el compilador rechaza el codigo con el error:
     *
     *   error: cannot override final method in VideojuegoFisico
     *
     * Por eso la clase se extiende directamente de ProductoGeek:
     *
     * public class ConsolaHijo extends VideojuegoFisico {
     *     @Override
     *     public double calcularPrecioVenta() {   // <-- no compila
     *         return 0;
     *     }
     * }
     */
}
