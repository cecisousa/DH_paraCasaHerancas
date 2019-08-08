package br.digitalhouse.exercicio1;

import java.util.Date;

public class Funcionario extends Pessoa {
    public Float salario;

    public Funcionario(String novoNome, Data novoNascimento) {
        super(novoNome, novoNascimento);
    }

    @Override
    public void imprimeDados(Float dados) {

    }

    public Float calculaImposto() {
        return salario * 0.03f;
    }

    public Float getSalario(){
        return salario;
    }

    public void setSalario(Float novoSalario){
        salario = novoSalario;
    }

}
