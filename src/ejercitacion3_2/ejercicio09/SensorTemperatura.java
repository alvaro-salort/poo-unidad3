package ejercitacion3_2.ejercicio09;

public class SensorTemperatura {
    private double temperaturaActual;

    public SensorTemperatura(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura(18.5);
        Termostato termostato = new Termostato(25.0);

        System.out.println("--- LECTURA INICIAL DEL SENSOR ---");
        System.out.printf("Temperatura actual: %.1f C | Limite: %.1f C%n",
                sensor.getTemperaturaActual(), termostato.getTemperaturaLimite());
        termostato.evaluarRiesgo(sensor);

        // se modifica la temperatura del sensor y se vuelve a evaluar
        System.out.println("\n--- LA TEMPERATURA SUBE POR ENCIMA DEL LIMITE ---");
        sensor.setTemperaturaActual(31.2);
        System.out.printf("Temperatura actual: %.1f C | Limite: %.1f C%n",
                sensor.getTemperaturaActual(), termostato.getTemperaturaLimite());
        termostato.evaluarRiesgo(sensor);
    }
}
