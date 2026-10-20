package ejercitacion3_2.ejercicio10;

public class Computadora {
    private String marca;
    private int ramGB;
    // atributo de tipo referencia: la computadora tiene un procesador
    private Procesador cpu;

    public Computadora(String marca, int ramGB, Procesador cpu) {
        this.marca = marca;
        this.ramGB = ramGB;
        this.cpu = cpu;
    }

    public void mostrarEspecificaciones() {
        System.out.println("--- ESPECIFICACIONES DE LA COMPUTADORA ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("RAM:   " + this.ramGB + " GB");
        // delegacion: la computadora delega la impresion del procesador a su toString()
        System.out.println(this.cpu.toString());
    }

    public static void main(String[] args) {
        Procesador procesador = new Procesador("AMD", "Ryzen 7 5800X", 4.4);
        Computadora computadora = new Computadora("CompuTron", 32, procesador);

        computadora.mostrarEspecificaciones();
    }
}
