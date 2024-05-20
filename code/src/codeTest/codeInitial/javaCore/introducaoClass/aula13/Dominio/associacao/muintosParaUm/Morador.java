package codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.muintosParaUm;

public class Morador {
    private String nome;
    private String sexo;
    private int idade;

    public Morador(String nome, String sexo, int idade){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
}
