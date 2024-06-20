package codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.dominio;

public abstract class Produto implements Funcionalidade {
    protected String nomeProduto;
    protected double valor;

    public Produto(String nomeProduto, double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValor() {
        return valor;
    }
}
