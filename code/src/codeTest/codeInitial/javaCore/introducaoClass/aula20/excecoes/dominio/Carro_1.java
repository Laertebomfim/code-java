package codeTest.codeInitial.javaCore.introducaoClass.aula20.excecoes.dominio;

import codeTest.codeInitial.javaCore.introducaoClass.aula7.dominio.Carro;

import java.io.IOException;

public class Carro_1 extends Carro {

    public void pintura() throws RuntimeException, IOException {
        System.out.println("preto");
    }

}
