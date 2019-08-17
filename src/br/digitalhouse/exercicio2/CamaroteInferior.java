package br.digitalhouse.exercicio2;

public class CamaroteInferior extends ClasseVIP{
    private Integer localizacaoIngresso;

    public CamaroteInferior(Integer novaLocalizacaoIngresso) {
        localizacaoIngresso = novaLocalizacaoIngresso;
    }

    public Integer getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(Integer localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public void acessarLocalizacao(){
        getLocalizacaoIngresso();
    }

    public void imprimirLocalizacao() {
        System.out.println(getLocalizacaoIngresso());
    }
}
