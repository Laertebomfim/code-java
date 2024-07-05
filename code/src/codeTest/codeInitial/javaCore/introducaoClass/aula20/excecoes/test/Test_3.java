package codeTest.codeInitial.javaCore.introducaoClass.aula20.excecoes.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula20.excecoes.dominio.Test_3TryCath;

import java.io.IOException;

public class Test_3 {
    public static void main(String[] args) {

    }
    public static void conequicaoComBanco() {
        try(Test_3TryCath bancoDeDados = new Test_3TryCath()) {
            bancoDeDados.OpenBence();

        }catch (Exception e ){
            e.printStackTrace();

        }

    }
}
