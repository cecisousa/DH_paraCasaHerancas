package br.digitalhouse.exercicio1;

import java.util.Date;

public abstract class Pessoa {
    private String nome;
    private Data nascimento;
    public abstract void imprimeDados(Float dados);

    Pessoa(String novoNome, Data novoNascimento){
        nome = novoNome;
        nascimento = novoNascimento;
    }

    public String getNome(){
        return nome;
    }

    public Data getNascimento(){
        return nascimento;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setNascimento(Data novoNascimento){
        nascimento = novoNascimento;
    }


}
