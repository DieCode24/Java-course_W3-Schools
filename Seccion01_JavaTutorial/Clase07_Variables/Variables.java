package Seccion01_JavaTutorial.Clase07_Variables;

import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario

// Clase principal que contiene el menú y sus funcionalidades
public class Variables {

    public static void main(String[] args) {
        // Intentar limpiar la consola al iniciar el programa
        try {
            clearConsole(); // Limpiar la consola usando ProcessBuilder
        } catch (Exception e) { // Manejar posibles excepciones
            System.out.println("> Error al limpiar la consola.");
            return; // Si ocurre un error, salir del programa
        }

        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Variable de control para el bucle del menú
        boolean continuar = true;

        // Bucle que mantiene activo el menú hasta que el usuario elija salir
        while (continuar) {
            // Mostrar las opciones del menú
            System.out.println("Menú Principal");
            divisorConsole(); // Imprimir un divisor visual
            System.out.println("=> 1. Mostrar Variables.");
            System.out.println("=> 2. Limpiar Consola.");
            System.out.println("=> 3. Datos del Estudiante.");
            System.out.println("=> 4. Calcular Área de un Rectángulo.");
            System.out.println("=> 0. Salir.");
            System.out.print("\n===> Elige una opción: ");

            // Leer la opción seleccionada por el usuario
            int opcion = scanner.nextInt();

            // Estructura switch-case para manejar las diferentes opciones
            switch (opcion) {
                case 1: // Opción para mostrar variables
                    clearConsoleSafely(); // Limpiar la consola y manejar excepciones
                    System.out.println("Opción (" + opcion + ") | Mostrar Variables");
                    divisorConsole(); // Imprimir un divisor
                    variablesSet(); // Llamar al método para mostrar variables
                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 2: // Opción para limpiar la consola
                    clearConsoleSafely(); // Limpiar la consola
                    System.out.println("Opción (" + opcion + ") | Limpiar Consola");
                    divisorConsole(); // Divisor visual
                    System.out.println("> Consola limpiada.");
                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 3: // Opción para mostrar datos del estudiante
                    clearConsoleSafely(); // Limpiar la consola
                    System.out.println("Opción (" + opcion + ") | Datos del Estudiante");
                    divisorConsole(); // Divisor visual
                    studentData(); // Llamar al método para mostrar datos del estudiante
                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 4: // Opción para calcular el área de un rectángulo
                    clearConsoleSafely(); // Limpiar la consola
                    System.out.println("Opción (" + opcion + ") | Calcular Área del Rectángulo");
                    divisorConsole(); // Divisor visual
                    calcularAreaRectangulo(); // Calcular y mostrar el área del rectángulo
                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 0: // Opción para salir del programa
                    clearConsoleSafely(); // Limpiar la consola
                    System.out.println("Opción (" + opcion + ") | Salir");
                    divisorConsole(); // Divisor visual
                    System.out.println("> Saliendo del programa. Adiós!");
                    continuar = false; // Cambiar el estado para salir del bucle
                    pause(scanner); // Pausar para permitir al usuario ver el mensaje final
                    break;

                default: // Manejar opciones inválidas
                    clearConsoleSafely(); // Limpiar la consola
                    System.out.println("> Opción no válida. Inténtalo de nuevo.");
                    pause(scanner); // Pausa para permitir corrección
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;
            }
        }

        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }

    // Método para mostrar las variables originales
    public static void variablesSet() {
        System.out.println("Tipos de datos:");
        System.out.println("> Entero (Integer): 5");
        System.out.println("> Flotante (Float): 5.99f");
        System.out.println("> Caracter (Char): 'D'");
        System.out.println("> Booleano (Boolean): true");
        System.out.println("> Cadena de texto (String): 'Hello'");
    }

    // Método para simular una pausa para permitir al usuario presionar Enter antes de continuar
    public static void pause(Scanner scanner) {
        System.out.println("\n\n> Presiona Enter para continuar...");
        scanner.nextLine(); // Leer cualquier entrada residual
        if (scanner.hasNextLine()) { 
            scanner.nextLine(); // Esperar hasta que el usuario presione Enter
        }
    }

    // Método para limpiar la consola de manera segura, manejando posibles excepciones
    public static void clearConsoleSafely() {
        try {
            clearConsole(); // Llamar al método para limpiar la consola
        } catch (Exception e) {
            System.out.println("> Error al limpiar la consola."); // Manejar errores
        }
    }

    // Método para limpiar la consola usando ProcessBuilder (para entornos Windows)
    public static void clearConsole() throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Ejecutar el comando cls para limpiar
    }

    // Método para agregar divisores visuales para separar secciones en la consola
    public static void divisorConsole() {
        System.out.print("##############################\n"); // Divisor visual
    }

    // Método para mostrar datos de un estudiante
    public static void studentData() {
        String studentName = "John Doe"; 
        int studentID = 15; 
        int studentAge = 23; 
        float studentFee = 75.25f; 
        char studentGrade = 'B'; 

        System.out.println("Datos del Estudiante:");
        System.out.println("> Nombre: " + studentName);
        System.out.println("> ID: " + studentID);
        System.out.println("> Edad: " + studentAge);
        System.out.println("> Cuota: " + studentFee);
        System.out.println("> Calificación: " + studentGrade);
    }

    // Método para calcular el área de un rectángulo y mostrar el resultado
    public static void calcularAreaRectangulo() {
        int length = 4; 
        int width = 6; 
        int area = length * width; 

        System.out.println("Longitud: " + length);
        System.out.println("Ancho: " + width);
        System.out.println("Área del rectángulo: " + area); // Mostrar el resultado del cálculo
    }
}