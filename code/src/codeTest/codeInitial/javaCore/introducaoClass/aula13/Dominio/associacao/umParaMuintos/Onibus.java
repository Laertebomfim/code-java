package codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.umParaMuintos;

public class Onibus {
    private int assentos;
    private  String cor;
    private  String destino;


    public Onibus(int assentos,String cor, String destino){
        this.assentos = assentos;
        this.cor = cor;
        this.destino = destino;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLugares(int assentos) {
        this.assentos = assentos;
    }

    public int getLugares() {
        return assentos;
    }

    public String getCor() {
        return cor;
    }

    public String getDestino() {
        return destino;
    }
}
