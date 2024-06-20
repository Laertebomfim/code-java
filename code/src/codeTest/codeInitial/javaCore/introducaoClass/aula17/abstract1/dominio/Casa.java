package codeTest.codeInitial.javaCore.introducaoClass.aula17.abstract1.dominio;

public abstract class Casa extends Abrigo {
    protected int numComodus;
    protected String cor;
    protected double Taxa;

    public Casa(String cor, int numComodos){
        this.cor = cor;
        this.numComodus = numComodos;
    }
    public abstract void almentoTaxa(int quantidadePessoas);

    @Override
    public void tamanhoComodo() {
    }

    @Override
    public String toString() {
        return "Casa\n{" +
                "numComodus=" + numComodus +
                ", cor='" + cor + '\'' +
                ", Taxa=" + Taxa +
                '}';
    }
}
