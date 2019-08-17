package br.digitalhouse.exercicio2;

public class CamaroteSuperior extends ClasseVIP {

    private Float valorMaisCaro = 25f;

    public CamaroteSuperior() {
    }

    public Float getValorMaisCaro() {
        return valorMaisCaro;
    }

    public void setValorMaisCaro(Float valorMaisCaro) {
        this.valorMaisCaro = valorMaisCaro;
    }

    public void imprimeValor(){
        System.out.println(valorMaisCaro + getValorAdicional() + getValor());
    }



}
