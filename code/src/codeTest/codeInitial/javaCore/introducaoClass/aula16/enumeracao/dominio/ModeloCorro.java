package codeTest.codeInitial.javaCore.introducaoClass.aula16.enumeracao.dominio;

import codeTest.codeInitial.javaCore.introducaoClass.aula15.Dominio.CarroParaVenda;

public class ModeloCorro extends CarroParaVenda {
    public TipoCarro tipoCarro;

    public ModeloCorro(String nome, String marcaCarro, TipoCarro tipoCarro) {
        super(nome,marcaCarro);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public void showCarro(){
//        super.showCarro();
        System.out.println(tipoCarro.litroKm(1.5));
    }
}
