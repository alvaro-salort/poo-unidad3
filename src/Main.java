import java.util.Scanner;

import ejercitacion3_1.ejercicio01.Comic;
import ejercitacion3_1.ejercicio02.VideojuegoFisico;
import ejercitacion3_1.ejercicio03.FiguraColeccionable;
import ejercitacion3_1.ejercicio04.ConsolaEdicionEspecial;
import ejercitacion3_1.ejercicio05.IndumentariaGeek;
import ejercitacion3_1.ejercicio06.GestorEtiquetado;
import ejercitacion3_1.ejercicio07.MangaImportado;
import ejercitacion3_1.ejercicio08.CarritoCompras;
import ejercitacion3_1.ejercicio09.VerificadorGarantia;
import ejercitacion3_1.ejercicio10.PromocionGeek;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = -1;
        do {
            System.out.println("\n==================================================");
            System.out.println("       MENÚ PRINCIPAL - EJERCITACIONES POO        ");
            System.out.println("==================================================");
            System.out.println("1. Ejercitación 3.E.1 (Ejercicios 1 a 10)");
            System.out.println("0. Salir");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    menuEjercitacion3_1();
                    break;
                case 0:
                    System.out.println("\n¡Gracias por revisar las ejercitaciones!");
                    break;
                default:
                    System.out.println("\n[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void menuEjercitacion3_1() {
        int opcion = -1;
        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("              EJERCITACIÓN 3.E.1                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("1.  Ejercicio 1: ProductoGeek y Comic");
            System.out.println("2.  Ejercicio 2: VideojuegoFisico");
            System.out.println("3.  Ejercicio 3: FiguraColeccionable");
            System.out.println("4.  Ejercicio 4: ConsolaEdicionEspecial");
            System.out.println("5.  Ejercicio 5: IndumentariaGeek");
            System.out.println("6.  Ejercicio 6: GestorEtiquetado");
            System.out.println("7.  Ejercicio 7: MangaImportado");
            System.out.println("8.  Ejercicio 8: CarritoCompras");
            System.out.println("9.  Ejercicio 9: VerificadorGarantia");
            System.out.println("10. Ejercicio 10: PromocionGeek");
            System.out.println("0.  Volver al menú principal");
            System.out.println("--------------------------------------------------");
            System.out.print("Seleccione un ejercicio a ejecutar: ");

            opcion = leerEntero();
            System.out.println();

            switch (opcion) {
                case 1:
                    Comic.main(new String[0]);
                    pausa();
                    break;
                case 2:
                    VideojuegoFisico.main(new String[0]);
                    pausa();
                    break;
                case 3:
                    FiguraColeccionable.main(new String[0]);
                    pausa();
                    break;
                case 4:
                    ConsolaEdicionEspecial.main(new String[0]);
                    pausa();
                    break;
                case 5:
                    IndumentariaGeek.main(new String[0]);
                    pausa();
                    break;
                case 6:
                    GestorEtiquetado.main(new String[0]);
                    pausa();
                    break;
                case 7:
                    MangaImportado.main(new String[0]);
                    pausa();
                    break;
                case 8:
                    CarritoCompras.main(new String[0]);
                    pausa();
                    break;
                case 9:
                    VerificadorGarantia.main(new String[0]);
                    pausa();
                    break;
                case 10:
                    PromocionGeek.main(new String[0]);
                    pausa();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (Exception e) {
            return -1;
        }
    }

    private static void pausa() {
        System.out.println("\nPresione ENTER para continuar...");
        scanner.nextLine();
    }
}
// Hecho con ayuda de la buena IA
