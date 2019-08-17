package br.digitalhouse.exercicio2;

public class ClasseVIP extends Ingresso {
    private Float valorAdicional = 50f;

    public ClasseVIP() {
    }

    public Float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void imprimeValor(){
        System.out.println(valorAdicional + getValor());
    }
}
