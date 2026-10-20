package ejercitacion3_2.ejercicio05;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // getters de todos los atributos
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // setter solo para el titular: el saldo y el numero de cuenta no se tocan
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a depositar debe ser mayor a 0.");
            return;
        }
        this.saldo += monto;
        System.out.printf("Deposito de $%.2f realizado. Saldo actual: $%.2f%n", monto, this.saldo);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor a 0.");
            return;
        }
        if (monto > this.saldo) {
            System.out.printf("Error: saldo insuficiente. Saldo disponible: $%.2f%n", this.saldo);
            return;
        }
        this.saldo -= monto;
        System.out.printf("Retiro de $%.2f realizado. Saldo actual: $%.2f%n", monto, this.saldo);
    }

    public static void main(String[] args) {
        /*
         * Los atributos son private, por lo que desde OTRA clase no se pueden tocar:
         *
         *   cuenta.saldo = 500000;      // no compila: saldo es private
         *   cuenta.getSaldo() = 500;    // no compila: un getter no es asignable
         *
         * El unico camino para modificar el saldo son los metodos de negocio.
         */
        CuentaBancaria cuenta = new CuentaBancaria("CBU-00123", "Nicolas Gomez", 150000.0);

        System.out.println("--- DATOS DE LA CUENTA ---");
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Titular:          " + cuenta.getTitular());
        System.out.printf("Saldo:            $%.2f%n", cuenta.getSaldo());

        // cambio de titular (unico setter permitido)
        System.out.println("\n--- CAMBIO DE TITULAR ---");
        cuenta.setTitular("Nicolas Gomez Lopez");
        System.out.println("Nuevo titular: " + cuenta.getTitular());

        // deposito valido
        System.out.println("\n--- DEPOSITOS ---");
        cuenta.depositar(50000.0);

        // deposito invalido: monto negativo
        System.out.println("\n--- DEPOSITO CON MONTO NEGATIVO ---");
        cuenta.depositar(-1000.0);

        // retiro valido
        System.out.println("\n--- RETIRO VALIDO ---");
        cuenta.retirar(30000.0);

        // retiro invalido: supera el saldo
        System.out.println("\n--- RETIRO QUE SUPERA EL SALDO ---");
        cuenta.retirar(9999999.0);

        System.out.println("\n--- ESTADO FINAL ---");
        System.out.printf("Saldo: $%.2f%n", cuenta.getSaldo());
    }
}
