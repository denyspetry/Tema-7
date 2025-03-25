package Diccionario;

import java.util.Scanner;

public class AplicaciónDiccionario {
    public static void main(String[] args) {
        // Creamos el diccionario y añadimos algunas palabras en español y el inglés
        Diccionario diccionario = new Diccionario();
        diccionario.nuevoPar("Perro", "Dog");
        diccionario.nuevoPar("Gato", "Cat");
        diccionario.nuevoPar("Mesa", "Table");
        diccionario.nuevoPar("Coche", "Car");

        Scanner entrada = new Scanner(System.in);
        int totalPreguntas = 0;
        int totalAciertos = 0;
        int totalErrores = 0;

        System.out.println("BIENVENIDO AL CUESTIONARIO DE TRADUCCIÓN ESPAÑOL - INGLÉS!");

        while (true) {
            String palabraEspanol = diccionario.palabraAleatoria();

            // Si el diccionario está vacío salimos del bucle
            if (palabraEspanol == null) {
                System.out.println("El diccionario está vacío.");
                break;
            }

            String primeraLetra = diccionario.primeraLetraTraduccion(palabraEspanol);
            System.out.println(palabraEspanol + ": " + primeraLetra + "...");
            System.out.print("Indique la respuesta: ");

            String respuesta = entrada.nextLine().trim();

            // Comprobamos si la respuesta introducida es fin, en cuyo caso se sale del bucle y termina el programa
            if (respuesta.equalsIgnoreCase("fin")) {
                break;
            }

            String traduccionCorrecta = diccionario.traduce(palabraEspanol);
            totalPreguntas++;

            if (respuesta.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡CORRECTO!");
                totalAciertos++;
            } else {
                System.out.println("¡NO! La respuesta correcta es " + traduccionCorrecta);
                totalErrores++;
            }
        }

        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + totalPreguntas);
        System.out.println("Total aciertos: " + totalAciertos);
        System.out.println("Total errores: " + totalErrores);
        System.out.println("Aciertos: " + (totalAciertos * 100.0 / totalPreguntas) + "%");

    }
}
