package Seccion01_JavaTutorial.Clase08_DataTypes;

import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario

public class DataTypes {
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
            System.out.println("=> 1. Tipos de datos primitivos.");
            System.out.println("=> 2. Opcion 2.");
            System.out.println("=> 3. Opcion 3.");
            System.out.println("=> 4. Opcion 4.");
            System.out.println("=> 0. Salir.");
            System.out.print("\n===> Elige una opción: ");

            // Leer la opción seleccionada por el usuario
            int opcion = scanner.nextInt();

            // Estructura switch-case para manejar las diferentes opciones
            switch (opcion) {
                case 1: // Opción para mostrar variables
                    clearConsoleSafely(); // Limpiar la consola y manejar excepciones
                    System.out.println("Opción (" + opcion + ") | Tipos de datos primitivos");
                    divisorConsole(); // Imprimir un divisor
                    
                    showPrimitiveDataTypesInfo();

                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 2: // Opción para limpiar la consola
                    clearConsoleSafely(); // Limpiar la consola
                    System.out.println("Opción (" + opcion + ") | Instruccion opcion 2");
                    divisorConsole(); // Divisor visual
                    
                    // Instruccion opcion 2

                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 3: // Opción para mostrar datos del estudiante
                    clearConsoleSafely(); // Limpiar la consola
                    System.out.println("Opción (" + opcion + ") | Instruccion opcion 3");
                    divisorConsole(); // Divisor visual
                    
                    // Instruccion opcion 3

                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 4: // Opción para calcular el área de un rectángulo
                    clearConsoleSafely(); // Limpiar la consola
                    System.out.println("Opción (" + opcion + ") | Instruccion opcion 4");
                    divisorConsole(); // Divisor visual
                    
                    // Instruccion opcion 4

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

    // Método para mostrar información sobre tipos de datos primitivos
    public static void showPrimitiveDataTypesInfo() {
        System.out.println("Información sobre Tipos de Datos Primitivos:");
        System.out.println("\n1) byte:");
        System.out.println("\t=> Tamaño: 1 byte");
        System.out.println("\t=> Rango: de -128 a 127");
        
        System.out.println("\n2) short:");
        System.out.println("\t=> Tamaño: 2 bytes");
        System.out.println("\t=> Rango: de -32,768 a 32,767");
        
        System.out.println("\n3) int:");
        System.out.println("\t=> Tamaño: 4 bytes");
        System.out.println("\t=> Rango: de -2,147,483,648 a 2,147,483,647");
        
        System.out.println("\n4) long:");
        System.out.println("\t=> Tamaño: 8 bytes");
        System.out.println("\t=> Rango: de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807");
        
        System.out.println("\n5) float:");
        System.out.println("\t=> Tamaño: 4 bytes");
        System.out.println("\t=> Suficiente para almacenar entre 6 y 7 dígitos decimales");
        
        System.out.println("\n6) double:");
        System.out.println("\t=> Tamaño: 8 bytes");
        System.out.println("\t=> Suficiente para almacenar hasta 15 dígitos decimales");
        
        System.out.println("\n7) boolean:");
        System.out.println("\t=> Tamaño: 1 bit");
        System.out.println("\t=> Puede almacenar valores true o false");
        
        System.out.println("\n8) char:");
        System.out.println("\t=> Tamaño: 2 bytes");
        System.out.println("\t=> Almacena un carácter o un valor ASCII");
    }
}
