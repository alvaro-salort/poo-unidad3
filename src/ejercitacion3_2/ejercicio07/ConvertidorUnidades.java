package ejercitacion3_2.ejercicio07;

public class ConvertidorUnidades {

    // version 1: metros a centimetros
    public double convertir(double metros) {
        return metros * 100.0;
    }

    // version 2: metros a kilometros o a milimetros
    public double convertir(double metros, boolean aKilometros) {
        if (aKilometros) {
            return metros / 1000.0;
        }
        return metros * 1000.0;
    }

    // version 3: pies a metros
    public double convertir(int pies) {
        return pies * 0.3048;
    }

    public static void main(String[] args) {
        ConvertidorUnidades convertidor = new ConvertidorUnidades();

        System.out.println("--- LAS TRES VERSIONES SOBRECARGADAS ---");

        // version 1: un solo argumento double
        double metros = 150.0;
        System.out.printf("convertir(%.1f)            -> %.2f cm%n",
                metros, convertidor.convertir(metros));

        // version 2: dos argumentos (double, boolean)
        System.out.printf("convertir(%.1f, true)      -> %.4f km%n",
                metros, convertidor.convertir(metros, true));
        System.out.printf("convertir(%.1f, false)     -> %.2f mm%n",
                metros, convertidor.convertir(metros, false));

        // version 3: un argumento int
        int pies = 10;
        System.out.printf("convertir(%d)               -> %.4f m%n",
                pies, convertidor.convertir(pies));
    }
}
