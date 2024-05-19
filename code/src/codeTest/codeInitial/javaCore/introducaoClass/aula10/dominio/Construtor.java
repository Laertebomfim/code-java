package codeTest.codeInitial.javaCore.introducaoClass.aula10.dominio;

public class Construtor {
    private String nome;
    private int paginas;
    private String type;
    private int ano;

    public Construtor(String nome, int paginas, String type, int ano){
        this.nome = nome;
        this.paginas = paginas;
        this.type = type;
        this.ano = ano;
    }
    public Construtor(){}

    public void showBook (){
        System.out.println(nome);
        System.out.println(paginas);
        System.out.println(type);
        System.out.println(ano);
    }
}
