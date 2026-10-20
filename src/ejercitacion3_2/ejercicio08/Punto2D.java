package ejercitacion3_2.ejercicio08;

public class Punto2D {
    private double x;
    private double y;

    // constructor por defecto: el punto queda en (0, 0)
    public Punto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // constructor parametrizado
    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // distancia euclidiana entre this y el punto recibido por parametro
    public double calcularDistancia(Punto2D otroPunto) {
        double dx = this.x - otroPunto.x;
        double dy = this.y - otroPunto.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }

    public static void main(String[] args) {
        Punto2D punto1 = new Punto2D(1.5, 2.5);
        Punto2D punto2 = new Punto2D(4.0, 6.0);
        Punto2D origen = new Punto2D();

        // println invoca automaticamente el toString() sobrescrito
        System.out.println("--- REPRESENTACION TEXTUAL ---");
        System.out.println("Punto 1: " + punto1);
        System.out.println("Punto 2: " + punto2);
        System.out.println("Origen:  " + origen);

        System.out.println("\n--- DISTANCIA EUCLIDIANA ---");
        System.out.printf("Distancia entre punto 1 y punto 2: %.4f%n", punto1.calcularDistancia(punto2));
        System.out.printf("Distancia entre origen y punto 1:   %.4f%n", origen.calcularDistancia(punto1));
    }
}
