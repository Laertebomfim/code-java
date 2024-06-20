package codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.servico;

import codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.dominio.Computado;
import codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.dominio.Produto;
import codeTest.codeInitial.javaCore.introducaoClass.aula19.polimofismo.dominio.Tomate;

public class ProdutoComTaxa {
    public static void ValorProdutoComputado(Computado computado){
        System.out.println(computado.getNomeProduto());
        if(computado.getValor() != 0) System.out.println("valor do computado  : " + computado.calculoTaxa());
    }
    public static void ValorProdutoTomate(Tomate tomate){
        System.out.println(tomate.getNomeProduto());
        if(tomate.getValor() != 0) System.out.println("valor do computado  : " + tomate.calculoTaxa());
    }
//  ---------polimofismo

    public static void ValorProdutoGenerico(Produto produto){
        System.out.println(produto.getNomeProduto());
        if(produto.getValor() != 0) System.out.println("valor do computado  : " + produto.calculoTaxa());

        if(produto instanceof Computado) {

            System.out.println("quantidade Núcleo: "+((Computado) produto).getNucleo());

            System.out.println("quantidade processador logico: "+((Computado) produto).getProcessadorLogico());
        }
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("qualidade do tomate: "+tomate.getMaduroOuVerde());
        }
    }
}
