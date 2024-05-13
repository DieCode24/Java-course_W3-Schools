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
                case 1:
                    clearConsoleSafely(); // Limpiar la consola y manejar excepciones
                    System.out.println("Opción (" + opcion + ") | Tipos de datos primitivos");
                    divisorConsole(); // Imprimir un divisor
                    
                    showPrimitiveDataTypesInfo();

                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 2:
                    clearConsoleSafely(); // Limpiar la consola
                    
                    System.out.println("Opción (" + opcion + ") | Instruccion opcion 2");
                    
                    divisorConsole(); // Divisor visual
                    
                    // Aquí se explica la información sobre los tipos de datos primitivos en Java
                    System.out.println("Números en Java");
                    
                    System.out.println("\nLos tipos de números primitivos se clasifican en dos grupos:");
                    // Explicación sobre los tipos enteros y de punto flotante
                    System.out.println("\n1) Tipos enteros => almacenan números enteros, positivos o negativos (como 123 o -456), sin decimales. Los tipos válidos son byte, short, int y long. El tipo que debes usar depende del valor numérico.");
                    System.out.println("\n2)Tipos de punto flotante => representan números con una parte fraccionaria, que contienen uno o más decimales. Hay dos tipos: float y double.");

                    // Descripción de los tipos enteros
                    System.out.println("\nTipos enteros:");

                    // Descripción y uso del tipo byte
                    System.out.println("\tByte => El tipo de dato byte puede almacenar números enteros desde -128 hasta 127. Esto puede usarse en lugar de int u otros tipos enteros para ahorrar memoria cuando estás seguro de que el valor estará dentro de -128 y 127:");
                    System.out.println("\n\t\t=> byte myNum = 100;");
                    System.out.println("\t\t=> System.out.println(myNum);");

                    // Descripción y uso del tipo short
                    System.out.println("\n\n\tShort => El tipo de dato short puede almacenar números enteros desde -32768 hasta 32767:");
                    System.out.println("\n\t\t=> short myNum = 5000;");
                    System.out.println("\t\t=> System.out.println(myNum);");

                    // Descripción y uso del tipo int
                    System.out.println("\n\n\tInt => El tipo de dato int puede almacenar números enteros desde -2147483648 hasta 2147483647. En general, y en nuestro tutorial, el tipo de dato int es el preferido cuando creamos variables con un valor numérico.");
                    System.out.println("\n\t\t=> int myNum = 100000;");
                    System.out.println("\t\t=> System.out.println(myNum);");

                    // Descripción y uso del tipo long
                    System.out.println("\n\n\tLong => El tipo de dato long puede almacenar números enteros desde -9223372036854775808 hasta 9223372036854775807. Se utiliza cuando int no es lo suficientemente grande para almacenar el valor. Nota que debes terminar el valor con una \"L\":");
                    System.out.println("\n\t\t=> long myNum = 15000000000L;");
                    System.out.println("\t\t=> System.out.println(myNum);");

                    // Descripción de los tipos de punto flotante
                    System.out.println("\n\n\nTipos de punto flotante:");

                    // Descripción y uso del tipo float
                    System.out.println("\n\tFloat y Double => Debes usar un tipo de punto flotante siempre que necesites un número con un decimal, como 9.99 o 3.14515. Los tipos de datos float y double pueden almacenar números fraccionarios. Nota que debes terminar el valor con una \"f\" para floats y \"d\" para doubles:");
                    System.out.println("\n\t\t=> float myNum = 5.75f;");
                    System.out.println("\t\t=> System.out.println(myNum);");
                    System.out.println("\t\t=> double myNum = 19.99d;");
                    System.out.println("\t\t=> System.out.println(myNum);");

                    // Descripción sobre cuál tipo de punto flotante usar
                    System.out.println("\n\n¿Usar float o double?");
                    System.out.println("\n\t=> La precisión de un valor de punto flotante indica cuántos dígitos puede tener el valor después del punto decimal. La precisión de float es solo de seis o siete dígitos decimales, mientras que las variables double tienen una precisión de aproximadamente 15 dígitos. Por lo tanto, es más seguro usar double para la mayoría de los cálculos.");

                    // Descripción sobre números científicos
                    System.out.println("\n\nNúmeros científicos => Un número de punto flotante también puede ser un número científico con una \"e\" para indicar la potencia de 10:");
                    System.out.println("\n\t=> float f1 = 35e3f;");
                    System.out.println("\t=> double d1 = 12E4d;");
                    System.out.println("\t=> System.out.println(f1);");
                    System.out.println("\t=> System.out.println(d1);");

                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 3:
                    clearConsoleSafely(); // Limpiar la consola
                    System.out.println("Opción (" + opcion + ") | Instruccion opcion 3");
                    divisorConsole(); // Divisor visual
                    
                    // Instruccion opcion 3

                    pause(scanner); // Pausar para que el usuario vea el resultado
                    clearConsoleSafely(); // Limpiar nuevamente antes de regresar al menú
                    break;

                case 4:
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
