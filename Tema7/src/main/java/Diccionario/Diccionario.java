package Diccionario;

import java.util.HashMap;
import java.util.Random;

public class Diccionario {
    private HashMap<String, String> diccionario;
    Random random = new Random();

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    // Metodo para añadir parejas de palabras al diccionario
    public void nuevoPar(String palabraEspanol, String palabraIngles) {
        diccionario.put(palabraEspanol, palabraIngles);
    }

    // Metodo para traducir una palabra del Inglés al Español
    public String traduce(String palabraEspanol) {
        return diccionario.get(palabraEspanol);
    }

    // Metodo para devolver una palabra aleatorio del diccionario
    public String palabraAleatoria() {
        // Si el diccionario está vacío devolvemos null, ya que si no peta el programa
        if (diccionario.isEmpty()) {
            return null;
        }
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        return palabras[random.nextInt(palabras.length)];
    }

    // Metodo para devolver la primera letra de la palabra traducida al Inglés
    public String primeraLetraTraduccion(String palabraEspanol) {
        String traduccion = traduce(palabraEspanol);

        if (traduccion != null) {
            return traduccion.substring(0, 1);
        } else {
            return null;
        }
    }
}
