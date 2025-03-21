package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GestorInforme {
    private Stack<Informe> pilaInformes;
    Set<TipoTarea> tiposDiferentes = new HashSet<>();

    public GestorInforme() {
        pilaInformes = new Stack<>();
    }

    public void apilarInforme(Informe informe) {
        pilaInformes.push(informe);
    }

    public Informe desapilarInforme() {
        if (pilaInformes.isEmpty()) {
            return null;
        } else {
            return pilaInformes.pop();
        }
    }

    public void mostrarInformes() {
        System.out.println("Informes en la pila:");
        for (Informe informe : pilaInformes) {
            System.out.println(informe);
        }
    }

    public int contarTiposInformes() {
        for (Informe informe : pilaInformes) {
            tiposDiferentes.add(informe.getTipo());
        }
        return tiposDiferentes.size();
    }
}
