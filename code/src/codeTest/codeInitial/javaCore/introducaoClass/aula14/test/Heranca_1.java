package codeTest.codeInitial.javaCore.introducaoClass.aula14.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula14.dominio.heranca.Funcionario;

public class Heranca_1 {
    public  static void main(String[] arg){
        Funcionario funcionario = new Funcionario("laerte",21);
        funcionario.setOcupacao("cordenadora");

        funcionario.showInformacao();
    }
}
