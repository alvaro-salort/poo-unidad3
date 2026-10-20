package ejercitacion3_2.ejercicio02;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    // constructor parametrizado: garantiza un estado inicial valido
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);
        Mascota mascota2 = new Mascota("Michi", "Gato", 7);
        Mascota mascota3 = new Mascota("Koki", "Loro", 2);

        System.out.println("--- DESCRIPCION DE LAS MASCOTAS ---");
        System.out.println(String.format("Mascota 1: %-10s | Especie: %-8s | Edad: %d anios",
                mascota1.nombre, mascota1.especie, mascota1.edad));
        System.out.println(String.format("Mascota 2: %-10s | Especie: %-8s | Edad: %d anios",
                mascota2.nombre, mascota2.especie, mascota2.edad));
        System.out.println(String.format("Mascota 3: %-10s | Especie: %-8s | Edad: %d anios",
                mascota3.nombre, mascota3.especie, mascota3.edad));
    }
}
