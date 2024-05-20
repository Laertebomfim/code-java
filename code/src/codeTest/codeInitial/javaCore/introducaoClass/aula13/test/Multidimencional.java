package codeTest.codeInitial.javaCore.introducaoClass.aula13.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.multidimensional.Cafe;
import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.multidimensional.Pessoa;

public class Multidimencional {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("café amanhecer","forte");

        Pessoa pessoa = new Pessoa("Romario",true,cafe);
        Pessoa pessoa2 = new Pessoa("Marselo",true,cafe);
        Pessoa pessoa3 = new Pessoa("Uesny",true,cafe);

        cafe.setDegustadores( new Pessoa[]{pessoa,pessoa2,pessoa3});

        pessoa.showCafe();
        cafe.showDegustadores();
    }
}
