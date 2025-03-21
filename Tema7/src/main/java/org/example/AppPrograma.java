package org.example;

public class AppPrograma {
    public static void main(String[] args) {
        GestorInforme gestionesLolita = new GestorInforme();

        gestionesLolita.apilarInforme(new Informe(11, TipoTarea.ADMINISTRATIVO));
        gestionesLolita.apilarInforme(new Informe(56, TipoTarea.EMPRESARIAL));
        gestionesLolita.apilarInforme(new Informe(45, TipoTarea.PERSONAL));
        gestionesLolita.apilarInforme(new Informe(69, TipoTarea.ADMINISTRATIVO));
        gestionesLolita.apilarInforme(new Informe(99, TipoTarea.EMPRESARIAL));
        gestionesLolita.mostrarInformes();

        while (gestionesLolita.desapilarInforme() != null) {
            System.out.println("Informe procesado.");
        }

        gestionesLolita.apilarInforme(new Informe(11, TipoTarea.PERSONAL));
        gestionesLolita.apilarInforme(new Informe(9, TipoTarea.ADMINISTRATIVO));
        gestionesLolita.apilarInforme(new Informe(10, TipoTarea.EMPRESARIAL));

        gestionesLolita.mostrarInformes();

    }
}
