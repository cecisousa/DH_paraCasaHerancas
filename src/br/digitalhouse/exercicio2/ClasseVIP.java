package br.digitalhouse.exercicio2;

public class ClasseVIP extends Ingresso {
    private Float valorAdicional;

    public Float valorIngressoVIP(){
        return valor + valorAdicional;
    }
}
