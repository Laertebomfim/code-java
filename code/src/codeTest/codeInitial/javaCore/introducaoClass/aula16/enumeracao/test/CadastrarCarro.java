package codeTest.codeInitial.javaCore.introducaoClass.aula16.enumeracao.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula16.enumeracao.dominio.ModeloCorro;
import codeTest.codeInitial.javaCore.introducaoClass.aula16.enumeracao.dominio.TipoCarro;

public class CadastrarCarro {
    public static void main(String[] args) {
        ModeloCorro modeloCorro = new ModeloCorro("civc","honda", TipoCarro.CASUAL);
        modeloCorro.setAno(2015);
        modeloCorro.setCor("prata");
        modeloCorro.setVelocidade(280);
        modeloCorro.setQuantidadePorta(4);
        modeloCorro.showCarro();
    }
}
