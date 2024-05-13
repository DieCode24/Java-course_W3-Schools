package Seccion01_JavaTutorial.Clase06_Comments;

// Este es un comentario de una sola línea que explica la función o propósito de la siguiente línea.
/* 
   Multiple
   linea 
*/
public class TiposDeComentarios {

  /**
   * Este es un comentario Javadoc.
   * Se usa para documentar métodos, clases, o campos.
   * 
   * @param nombre El nombre de la persona a la que se le da la bienvenida.
   * @return Un mensaje de bienvenida para la persona.
   */
  public String saludar(String nombre) {
    // Creamos un mensaje de bienvenida usando el parámetro "nombre".
    return "Hola, " + nombre + "!";
  }

  public static void main(String[] args) {
    // Creamos una instancia de la clase.
    TiposDeComentarios ejemplo = new TiposDeComentarios();

    // Obtenemos un mensaje de saludo.
    String mensaje = ejemplo.saludar("Mundo");

    // Imprimimos el mensaje en la consola.
    System.out.println(mensaje); // Salida: "Hola, Mundo!"
  }
}
