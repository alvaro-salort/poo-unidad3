package ejercitacion3_2.ejercicio04;

public class CalculadoraFinanciera {
    private double tasaInteresAnualBase;

    public CalculadoraFinanciera(double tasaInteresAnualBase) {
        this.tasaInteresAnualBase = tasaInteresAnualBase;
    }

    // Interés simple = Capital x (TasaAnual / 100) x (Días / 365)
    public double calcularInteresSimple(double capital, int dias) {
        return capital * (this.tasaInteresAnualBase / 100.0) * (dias / 365.0);
    }

    public static void main(String[] args) {
        CalculadoraFinanciera calculadora = new CalculadoraFinanciera(12.5);

        System.out.printf("Tasa de interes anual base: %.2f%%%n", calculadora.tasaInteresAnualBase);

        // primer calculo
        double capital1 = 100000.0;
        int dias1 = 90;
        double interes1 = calculadora.calcularInteresSimple(capital1, dias1);
        System.out.printf("%nCapital: $%.2f | Dias: %d%n", capital1, dias1);
        System.out.printf("Interes simple: $%.2f%n", interes1);

        // segundo calculo con otros valores
        double capital2 = 250000.0;
        int dias2 = 365;
        double interes2 = calculadora.calcularInteresSimple(capital2, dias2);
        System.out.printf("%nCapital: $%.2f | Dias: %d%n", capital2, dias2);
        System.out.printf("Interes simple: $%.2f%n", interes2);
    }
}
