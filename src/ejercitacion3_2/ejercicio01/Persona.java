package ejercitacion3_2.ejercicio01;

public class Persona {
    private String nombre;
    private int edad;

    /*
     * EXPLICACION TECNICA (Stack vs Heap)
     *
     * Al ejecutar: Persona p = new Persona();
     *
     * - STACK: se aloja la variable de referencia "p". Solo guarda la DIRECCION
     *   en memoria del objeto (un puntero), NO el objeto en si. Es de tamaño fijo.
     *
     * - HEAP: se reserva el espacio para el OBJETO Persona. Alli viven los
     *   valores de los atributos (nombre, edad) y el espacio para los metodos
     *   de la clase. El heap es memoria dinamica y administrada por el GC.
     *
     * - Al hacer p.nombre = "Carlos" no se copia nada: se escribe DENTRO del
     *   objeto en el heap usando la direccion que guarda la referencia del stack.
     *
     * - Al perder la referencia "p" (Sale del ambito / se la reasigna), el objeto
     *   del heap queda huerfano y el recolector de basura (GC) puede liberarlo.
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Carlos";
        persona1.edad = 35;

        Persona persona2 = new Persona();
        persona2.nombre = "Ana";
        persona2.edad = 22;

        System.out.println("--- DATOS DE LAS INSTANCIAS ---");
        System.out.println("Persona 1: " + persona1.nombre + ", " + persona1.edad + " anios.");
        System.out.println("Persona 2: " + persona2.nombre + ", " + persona2.edad + " anios.");

        System.out.println("\n--- LAS AMBAS VARIABLES APUNTAN A OBJETOS DISTINTOS ---");
        System.out.println("persona1 == persona2: " + (persona1 == persona2));
    }
}
