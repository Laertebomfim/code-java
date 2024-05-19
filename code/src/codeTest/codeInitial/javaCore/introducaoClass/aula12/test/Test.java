package codeTest.codeInitial.javaCore.introducaoClass.aula12.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula12.dominio.Estatico;

public class Test {
    public static void main(String[] args) {
        Estatico estatico = new Estatico("civic","prata");
        Estatico.speedCar=350;
        Estatico.setSpeedCar(515);
        estatico.showCar();
    }
}
