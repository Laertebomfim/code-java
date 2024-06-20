package codeTest.codeInitial.javaCore.introducaoClass.aula17.abstract1.dominio;

public class Apartamento extends Casa {

    public Apartamento(String cor, int numComodos) {
        super(cor, numComodos);
    }

    @Override
    public void almentoTaxa(int quantidadePessoas) {
        this.Taxa += 0.1*quantidadePessoas;
    }
}
