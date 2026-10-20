package ejercitacion3_2.ejercicio03;

public class Auto {
    private String marca;
    private String modelo;
    // primitivo boolean: por defecto vale false, no hace falta inicializarlo
    private boolean encendido;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("El " + marca + " " + modelo + " se ha encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("El " + marca + " " + modelo + " se ha apagado.");
    }

    public void mostrarEstado() {
        if (this.encendido) {
            System.out.println("Estado: ENCENDIDO.");
        } else {
            System.out.println("Estado: APAGADO.");
        }
    }

    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Etios");

        // estado inicial: apagado por defecto
        System.out.println("--- ESTADO INICIAL ---");
        auto.mostrarEstado();

        // secuencia de encendido
        System.out.println("\n--- ENCENDIDO ---");
        auto.encender();
        auto.mostrarEstado();

        // secuencia de apagado
        System.out.println("\n--- APAGADO ---");
        auto.apagar();
        auto.mostrarEstado();
    }
}
