package codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.dominio.Computado;
import codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.dominio.Tomate;
import codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.servico.ProdutoComTaxa;

public class CriaProduto {
    public static void main(String[] args) {
        Computado computado = new Computado("intel",1200);
        Tomate tomate = new Tomate("tomate-verde", 5);

//        ProdutoComTaxa.ValorProdutoComputado(computado);
//        ProdutoComTaxa.ValorProdutoTomate(tomate);

        computado.setNucleo(12);
        computado.setProcessadorLogico(24);

        tomate.setMaduroOuVerde(Tomate.qualidadeTomete.VERDE);

        ProdutoComTaxa.ValorProdutoGenerico(tomate);
    }
}
