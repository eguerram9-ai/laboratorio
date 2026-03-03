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

    // ➕ Agrega estudiante con validación de nombre
    public static void agregarEstudiante(Scanner scanner) {

        String nombre;

        // Validar nombre no vacío
        while (true) {
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre = scanner.nextLine().trim();

            if (!nombre.isEmpty()) {
                break;
            }
            System.out.println("El nombre no puede estar vacío.");
        }

        double calificacion = leerCalificacion(scanner);

        estudiantes.add(nombre);
        calificaciones.add(calificacion);

        System.out.println("Estudiante agregado correctamente.");
    }

    // 🔎 Lee calificación validando formato y rango
    public static double leerCalificacion(Scanner scanner) {

        while (true) {
            try {
                System.out.print("Ingrese la calificación del estudiante (0–100): ");
                double calificacion = Double.parseDouble(scanner.nextLine());

                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("La calificación debe estar entre 0 y 100.");
                    continue;
                }

                return calificacion;

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
            }
        }
    }

    // 📄 Mostrar estudiantes (mejor práctica de formato)
    public static void mostrarEstudiantes() {

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\n=== Lista de estudiantes ===");

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.printf("%d. %s - Calificación: %.2f%n",
                    (i + 1),
                    estudiantes.get(i),
                    calificaciones.get(i));
        }
    }

    // 📊 Calcular promedio
    public static void calcularPromedio() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
            return;
        }

        double suma = 0;

        for (double calificacion : calificaciones) {
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();
        System.out.printf("El promedio de calificaciones es: %.2f%n", promedio);
    }

    // 🏆 Mostrar mejor estudiante
    public static void mostrarMejorEstudiante() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
            return;
        }

        double maxCalificacion = calificaciones.get(0);
        String estudianteMax = estudiantes.get(0);

        for (int i = 1; i < calificaciones.size(); i++) {
            if (calificaciones.get(i) > maxCalificacion) {
                maxCalificacion = calificaciones.get(i);
                estudianteMax = estudiantes.get(i);
            }
        }

        System.out.printf(
                "El estudiante con la calificación más alta es: %s con %.2f%n",
                estudianteMax,
                maxCalificacion
        );
    }
}