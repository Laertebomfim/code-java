package codeTest.codeInitial.javaCore.introducaoClass.aula15.Dominio;

import codeTest.codeInitial.javaCore.introducaoClass.aula7.dominio.Carro;

public class CarroParaVenda extends Carro {
    private String nomeCarro;
    private String marcaCarro;

    public CarroParaVenda(String nomeCarro, String marcaCarro){
        this.nomeCarro = nomeCarro;
        this.marcaCarro = marcaCarro;

    }

    public void showCarro(){
        System.out.println(this.nomeCarro);
        System.out.println(this.marcaCarro);
        System.out.println(this.ano);
        System.out.println(this.cor);
        System.out.println(this.velocidade);
        System.out.println(this.quantidadePorta);
    }
}
