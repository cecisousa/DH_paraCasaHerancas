package br.digitalhouse.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    private int qtdAtual;
    private List<Pessoa> cadastrosTodos;

    public CadastroPessoa(){
        qtdAtual = 0;
        cadastrosTodos = new ArrayList<>();
    }

    public void cadastraPessoa(Pessoa pessoa){
        cadastrosTodos.add(pessoa);
        qtdAtual += 1;
    }

    public void imprimeCadastro(){
        System.out.println("Existe(m) " + qtdAtual + " cadastro(s) no sitema.");
        for (int i = 0; i < qtdAtual; i++) {
            System.out.println(cadastrosTodos.get(i).getNome());
        }
    }

}
