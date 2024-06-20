package codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.dominio;

public class Computado  extends Produto{
    private static final double TAXA_PRODUTO = 0.2;
    private int Nucleo;
    private int processadorLogico;

    public Computado(String nomeProduto, double valor) {
        super(nomeProduto, valor);
    }

    @Override
    public double calculoTaxa() {
        return this.valor + this.valor * TAXA_PRODUTO;
    }


    public int getNucleo() {
        return Nucleo;
    }

    public int getProcessadorLogico() {
        return processadorLogico;
    }

    public void setNucleo(int nucleo) {
        Nucleo = nucleo;
    }

    public void setProcessadorLogico(int processadorLogico) {
        this.processadorLogico = processadorLogico;
    }
}
