package br.digitalhouse.exercicio1;

public class TestaCadastro {
    public static void main(String[] args) {

        Data dataCecilia = new Data(21, 6,1990);
        Data dataKadu = new Data(1, 8,1988);
        Data dataPatricia = new Data(14, 5,1992);
        Cliente cecilia = new Cliente("Cecilia", dataCecilia);
        Gerente kadu = new Gerente("Kadu", dataKadu);
        Funcionario patricia = new Funcionario("Patricia", dataPatricia);
        CadastroPessoa cadastroPrincipal = new CadastroPessoa();

        cadastroPrincipal.cadastraPessoa(cecilia);
        cadastroPrincipal.imprimeCadastro();

        cadastroPrincipal.cadastraPessoa(patricia);
        cadastroPrincipal.cadastraPessoa(kadu);
        cadastroPrincipal.imprimeCadastro();
    }
}
