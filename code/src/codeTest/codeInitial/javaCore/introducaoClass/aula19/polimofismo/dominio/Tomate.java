package codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.dominio;

public class Tomate extends Produto{
    private static final double TAXA_PRODUTO= 0.3;
    public enum qualidadeTomete{
        VERDE,
        MADURO
    };

    private qualidadeTomete MaduroOuVerde;

    public Tomate(String nomeProduto, double valor) {
        super(nomeProduto, valor);
    }

    public qualidadeTomete getMaduroOuVerde() {
        return MaduroOuVerde;
    }

    @Override
    public double calculoTaxa() {
        return this.valor + this.valor * TAXA_PRODUTO;
    }

    public void setMaduroOuVerde(qualidadeTomete maduroOuVerde) {
        MaduroOuVerde = maduroOuVerde;
    }
}
