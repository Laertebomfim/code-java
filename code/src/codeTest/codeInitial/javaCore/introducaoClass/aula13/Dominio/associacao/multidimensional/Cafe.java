package codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.multidimensional;

public class Cafe {
    private String teorDoCafe;
    private String nome;
    private Pessoa[] degustadores;

    public Cafe(String nome, String teorDoCafe){
        this.nome = nome;
        this.teorDoCafe = teorDoCafe;
    }

    public String getNome() {
        return nome;
    }

    public void  showDegustadores(){
        if (degustadores == null ) return;

        System.out.println("=== pessoas que estão tomando café ===");
        for (Pessoa p : degustadores) {
            System.out.println(p.getNome());
            System.out.println(p.getApreciaCafe());
            System.out.println("____________________");
        }
    }

    public void setDegustadores(Pessoa[] degustador) {
        this.degustadores = degustador;
    }

    public String getTeorDoCafe() {
        return teorDoCafe;
    }
}
