package introduccion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    // Variables globales compartidas entre métodos
	static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        		
        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

     // Bucle principal
        while (continuar) {

            mostrarMenu();
            int opcion = leerOpcion(scanner); // ahora siempre válida

            switch (opcion) {
                case 1:
                    agregarEstudiante(scanner);
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
                case 3:
                    calcularPromedio();
                    break;
                case 4:
                    mostrarMejorEstudiante();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    continuar = false;
                    break;
            }
        }

        scanner.close();
    }

    // ================= MÉTODOS =================

    // Muestra el menú
    public static void mostrarMenu() {
        System.out.println("\n1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio de calificaciones");
        System.out.println("4. Mostrar estudiante con la calificación más alta");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // 🔒 Lee opción hasta que sea válida
    public static int leerOpcion(Scanner scanner) {

        while (true) {
            try {
                int opcion = Integer.parseInt(scanner.nextLine());

                if (opcion >= 1 && opcion <= 5) {
                    return opcion;
                } else {
                    System.out.print("Opción fuera de rango. Intente de nuevo: ");
                }

            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Debe ingresar un número: ");
            }
        }
    }

            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {

                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la calificación del estudiante: ");
                double calificacion = Double.parseDouble(scanner.nextLine());

                estudiantes.add(nombre);
                calificaciones.add(calificacion);

                System.out.println("Estudiante agregado correctamente.");

            } else if (opcion == 2) {

                if (estudiantes.isEmpty()) {
                    System.out.println("No hay estudiantes registrados.");
                } else {
                    System.out.println("\nLista de estudiantes:");
                    for (int i = 0; i < estudiantes.size(); i++) {
                        System.out.println(estudiantes.get(i) +
                                " - Calificación: " + calificaciones.get(i));
                    }
                }

            } else if (opcion == 3) {

                if (calificaciones.isEmpty()) {
                    System.out.println("No hay calificaciones registradas.");
                } else {
                    double suma = 0;

                    for (double calificacion : calificaciones) {
                        suma += calificacion;
                    }

                    double promedio = suma / calificaciones.size();
                    System.out.println("El promedio de calificaciones es: " + promedio);
                }

            } else if (opcion == 4) {

                if (calificaciones.isEmpty()) {
                    System.out.println("No hay calificaciones registradas.");
                } else {

                    double maxCalificacion = calificaciones.get(0);
                    String estudianteMax = estudiantes.get(0);

                    for (int i = 1; i < calificaciones.size(); i++) {
                        if (calificaciones.get(i) > maxCalificacion) {
                            maxCalificacion = calificaciones.get(i);
                            estudianteMax = estudiantes.get(i);
                        }
                    }

                    System.out.println("El estudiante con la calificación más alta es: "
                            + estudianteMax + " con " + maxCalificacion);
                }

            } else if (opcion == 5) {

                System.out.println("Saliendo del sistema...");
                break;

            } else {

                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
