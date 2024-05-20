package codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.multidimensional;


public class Pessoa {
    private String nome;
    private boolean apreciaCafe;
    private Cafe cafe;

    public Pessoa(String nome, boolean apreciaCafe, Cafe cafe) {
        this.nome = nome;
        this.apreciaCafe = apreciaCafe;
        this.cafe = cafe;
    }
    public void showCafe(){
        if(cafe == null) return;
        System.out.println("--- café que esta sendo tomado pelas pessoas ---" );
        System.out.println(cafe.getNome());
        System.out.println(cafe.getTeorDoCafe());
    }

    public String getNome() {
        return nome;
    }

    public boolean getApreciaCafe() {
        return apreciaCafe;
    }
}
