package codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.execissio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade= especialidade;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
