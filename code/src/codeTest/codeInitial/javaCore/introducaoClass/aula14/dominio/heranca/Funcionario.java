package codeTest.codeInitial.javaCore.introducaoClass.aula14.dominio.heranca;

public class Funcionario extends Pessoa{
    private String ocupacao;

    public Funcionario(String nome, int idade){
        super(nome,idade);
    }
    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    @Override
    public void showInformacao(){
        super.showInformacao();
        System.out.println(this.ocupacao);
    }
}
