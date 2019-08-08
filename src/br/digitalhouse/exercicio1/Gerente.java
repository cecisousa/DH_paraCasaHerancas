package br.digitalhouse.exercicio1;

import java.util.Date;

public class Gerente extends Funcionario{
    private String area;

    public Gerente(String novoNome, Data novoNascimento) {
        super(novoNome, novoNascimento);
    }

    public Float calculaImposto(){
        return salario * 0.05f;
    }

    public void imprimeDados(Float dados){

    }

    public String getArea(){
        return area;
    }

    public void setArea(String novaArea){
        area = novaArea;
    }

}
