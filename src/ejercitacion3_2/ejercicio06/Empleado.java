package ejercitacion3_2.ejercicio06;

public class Empleado {
    private String legajo;
    private String nombre;
    private double sueldoBase;
    private int antiguedad;

    // el constructor protege el invariante: nunca quedan valores negativos
    public Empleado(String legajo, String nombre, double sueldoBase, int antiguedad) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBase = (sueldoBase < 0) ? 0.0 : sueldoBase;
        this.antiguedad = (antiguedad < 0) ? 0 : antiguedad;
    }

    public void aplicarAumento(double porcentaje) {
        if (porcentaje > 0) {
            this.sueldoBase += this.sueldoBase * (porcentaje / 100.0);
            System.out.printf("Aumento del %.2f%% aplicado. Sueldo base: $%.2f%n", porcentaje, this.sueldoBase);
        } else {
            System.out.println("Aumento no aplicado: el porcentaje debe ser mayor a 0.");
        }
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public static void main(String[] args) {
        // empleado valido
        Empleado empleado1 = new Empleado("L-100", "Laura Sanchez", 850000.0, 5);
        System.out.println("--- EMPLEADO VALIDO ---");
        System.out.printf("Legajo: %s | Nombre: %s | Sueldo base: $%.2f | Antiguedad: %d anios%n",
                empleado1.getLegajo(), empleado1.getNombre(), empleado1.getSueldoBase(), empleado1.getAntiguedad());

        // empleado con sueldo negativo: el constructor lo corrige a 0.0
        System.out.println("\n--- EMPLEADO CON SUELDO NEGATIVO (INVALIDO) ---");
        Empleado empleado2 = new Empleado("L-200", "Carlos Diaz", -500000.0, -3);
        System.out.printf("Legajo: %s | Nombre: %s | Sueldo base: $%.2f | Antiguedad: %d anios%n",
                empleado2.getLegajo(), empleado2.getNombre(), empleado2.getSueldoBase(), empleado2.getAntiguedad());

        // aumento valido
        System.out.println("\n--- AUMENTO VALIDO ---");
        empleado1.aplicarAumento(20.0);

        // aumento invalido: porcentaje negativo o cero
        System.out.println("\n--- AUMENTO NO VALIDO ---");
        empleado1.aplicarAumento(-10.0);
        empleado1.aplicarAumento(0.0);
    }
}
