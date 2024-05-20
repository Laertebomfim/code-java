package codeTest.codeInitial.javaCore.introducaoClass.aula13.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.muintosParaUm.Casa;
import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.muintosParaUm.Morador;

public class muintosParaUm {

    // muintos casa para um moradores
    // a associação se ler de baixo para cima

    public static void main(String[] args) {
        Morador m1 = new Morador("valmar", "H", 65);
        Morador m2 = new Morador("luis", "H", 62);
        Morador m3 = new Morador("rodrigo", "H", 35);
        Morador m4 = new Morador("flaviana", "M", 43);

        Morador[] moradores = {m1,m2,m3,m4};
        Casa recintoDoSul = new Casa(moradores);

        recintoDoSul.showCasa();
        recintoDoSul.showMorado();
    }
}
