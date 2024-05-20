package codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.umParaMuintos;

public class Passageiro {
    private String nome;
    private int idade;
    private Onibus onibus;

    public Passageiro(String nome, int idade, Onibus onibus){
        this.nome = nome;
        this.idade = idade;
        this.onibus = onibus;
    }
    public void showOnibus(){
        System.out.println("--- passageiro / lugar ---");
        System.out.print(this.nome +" - ");
        System.out.print(onibus.getDestino());
    }

}
