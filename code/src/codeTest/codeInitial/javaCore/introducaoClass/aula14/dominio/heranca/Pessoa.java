package codeTest.codeInitial.javaCore.introducaoClass.aula14.dominio.heranca;

public class Pessoa extends Object{
    private String nome;
    private int idade;

    public Pessoa (String nome, int idade){
        this(nome);
        this.idade = idade;
    }

    public Pessoa(String nome){
        this.nome= nome;
    }

    public void showInformacao(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome( String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
