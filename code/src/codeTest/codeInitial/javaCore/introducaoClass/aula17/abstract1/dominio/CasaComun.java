package codeTest.codeInitial.javaCore.introducaoClass.aula17.abstract1.dominio;

public class CasaComun extends Casa{
    public CasaComun() {
        super("siza", 5);
    }

    @Override
    public void almentoTaxa(int quantidadePessoas) {
        this.Taxa = 0.5;
    }
}
