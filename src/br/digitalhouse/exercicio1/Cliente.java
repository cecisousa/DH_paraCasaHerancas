package br.digitalhouse.exercicio1;

import java.util.Date;

public class Cliente extends Pessoa{
    private int codigo;

    public Cliente(String novoNome, Data novoNascimento) {
        super(novoNome, novoNascimento);
    }

    @Override
    public void imprimeDados(Float dados) {

    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int novoCodigo){
        codigo = novoCodigo;
    }


}


