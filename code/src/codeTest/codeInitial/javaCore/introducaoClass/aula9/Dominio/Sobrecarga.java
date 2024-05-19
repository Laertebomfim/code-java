package codeTest.codeInitial.javaCore.introducaoClass.aula9.Dominio;

public class Sobrecarga {
    private String nome;
    private int paginas;
    private String type;
    private int ano;

    public void init (String nome, int paginas, String type){
        this.nome = nome;
        this.paginas = paginas;
        this.type = type;
    }

    public void init (String nome, int paginas, String type, int ano){
        init(nome,paginas,type);
        this.ano = ano;

    }
    public void showBook (){
        System.out.println(nome);
        System.out.println(paginas);
        System.out.println(type);
        System.out.println(ano);
    }
}
