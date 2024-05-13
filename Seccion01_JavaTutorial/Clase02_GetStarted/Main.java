// Paquete que contiene la clase principal del programa
package Seccion01_JavaTutorial.Clase02_GetStarted;

// Clase principal que contiene el punto de entrada del programa
public class Main {

  // Método principal que se ejecuta al iniciar el programa
  public static void main(String[] args) {
    // Imprime un mensaje en la consola
    System.out.println("Hello World");

    // Validación de argumentos (opcional, según la funcionalidad esperada)
    if (args.length > 0) { // Si se proporcionan argumentos
      System.out.println("Argumentos recibidos:");
      for (String arg : args) {
        System.out.println(arg); // Imprime cada argumento
      }
    } else {
      System.out.println("No se proporcionaron argumentos."); // Mensaje si no hay argumentos
    }
  }
}
