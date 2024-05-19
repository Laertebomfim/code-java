package codeTest.codeInitial.javaCore.introducaoClass.aula9.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula9.Dominio.Sobrecarga;

public class Test {
    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga();
        sobrecarga.init("meu pé",500,"áventura");
        sobrecarga.showBook();
        sobrecarga.init("Sobre fonito",300,"áção",2015);
        sobrecarga.showBook();

    }
}
