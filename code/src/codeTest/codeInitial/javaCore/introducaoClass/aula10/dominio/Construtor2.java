package codeTest.codeInitial.javaCore.introducaoClass.aula10.dominio;

public class Construtor2 {
    private String nome;
    private int paginas;
    private String type;
    private int ano;
    
    public Construtor2(String nome, int paginas, String type, int ano){
        this(nome,paginas,type);
        this.ano = ano;
        System.out.println("fala 1");
    }

    public Construtor2(String nome, int paginas, String type){
        this();
        this.nome = nome;
        this.paginas = paginas;
        this.type = type;
        System.out.println("fala 2");
    }

    public Construtor2(){
        System.out.println("fala 3");
    }

    public void showBook (){
        System.out.println(nome);
        System.out.println(paginas);
        System.out.println(type);
        System.out.println(ano);
    }
}
