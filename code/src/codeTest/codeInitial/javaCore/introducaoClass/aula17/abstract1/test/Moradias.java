package codeTest.codeInitial.javaCore.introducaoClass.aula17.abstract1.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula17.abstract1.dominio.Apartamento;
import codeTest.codeInitial.javaCore.introducaoClass.aula17.abstract1.dominio.Casa;
import codeTest.codeInitial.javaCore.introducaoClass.aula17.abstract1.dominio.CasaComun;

public class Moradias {
    public static void main(String[] args) {
        Apartamento apartamento = new Apartamento("sinza",4);
        apartamento.almentoTaxa(4);

        CasaComun casaComun = new CasaComun();
        casaComun.almentoTaxa(4);

        System.out.println(apartamento.toString());
        System.out.println(casaComun.toString());
    }
}
