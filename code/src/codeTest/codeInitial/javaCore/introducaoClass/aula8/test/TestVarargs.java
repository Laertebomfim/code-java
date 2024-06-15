package codeTest.codeInitial.javaCore.introducaoClass.aula8.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula8.dominio.Varargs;

public class TestVarargs {
    public static void main(String[] args) {
        Varargs varargs = new Varargs();

        varargs.atribuirValor(45,45,58,68,68);
        varargs.atribuirValor(new int[]{4,5,6,4});

        varargs.getValue("VALOR",50,68,28);
        int[] num = new int[]{5,6,8};
        varargs.getValue("VALOR",num);

    }
}
