package br.digitalhouse.exercicio2;

public class Ingresso {
    private Float valor = 100f;

    public Ingresso (){
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println(valor);
    }


}
