package ejercitacion3_2.ejercicio09;

public class Termostato {
    private double temperaturaLimite;

    public Termostato(double temperaturaLimite) {
        this.temperaturaLimite = temperaturaLimite;
    }

    public double getTemperaturaLimite() {
        return temperaturaLimite;
    }

    public void setTemperaturaLimite(double temperaturaLimite) {
        this.temperaturaLimite = temperaturaLimite;
    }

    // recibe la referencia del sensor y le envia un mensaje para pedir la temperatura
    public void evaluarRiesgo(SensorTemperatura sensor) {
        double temperatura = sensor.getTemperaturaActual();
        if (temperatura > this.temperaturaLimite) {
            System.out.printf("[ALERTA] Riesgo de sobrecalentamiento: %.1f C supera el limite de %.1f C%n",
                    temperatura, this.temperaturaLimite);
        } else {
            System.out.printf("[OK] Temperatura de %.1f C dentro del limite de %.1f C%n",
                    temperatura, this.temperaturaLimite);
        }
    }
}
