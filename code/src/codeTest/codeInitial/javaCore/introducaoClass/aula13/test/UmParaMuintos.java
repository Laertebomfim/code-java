package codeTest.codeInitial.javaCore.introducaoClass.aula13.test;


import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.umParaMuintos.Onibus;
import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.umParaMuintos.Passageiro;

public class UmParaMuintos {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(110,"prata","praia");
        Passageiro passageiro = new Passageiro("rodrigo",25,onibus);

        passageiro.showOnibus();

    }
}
