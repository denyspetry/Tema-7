package org.example;

import java.util.Objects;

public class Informe {
    private int codigo;
    private TipoTarea tipo;

    public Informe(int codigo, TipoTarea tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public TipoTarea getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Informe informe = (Informe) obj;
        return codigo == informe.codigo && Objects.equals(tipo, informe.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }

    @Override
    public String toString() {
        return "Informe{" + "codigo=" + codigo + ", tipo=" + tipo + '}';
    }
}
