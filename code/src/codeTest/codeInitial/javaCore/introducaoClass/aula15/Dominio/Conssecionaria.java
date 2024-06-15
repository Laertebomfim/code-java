package codeTest.codeInitial.javaCore.introducaoClass.aula15.Dominio;

public class Conssecionaria {
    private String nome;
    private final CarroParaVenda CARRO_PARA_VENDA = new CarroParaVenda("sheby-GT-500","ford");
    {
        CARRO_PARA_VENDA.setAno(2023);
        CARRO_PARA_VENDA.setCor("azul");
        CARRO_PARA_VENDA.setQuantidadePorta(2);
        CARRO_PARA_VENDA.setVelocidade(500);
        nome = "vende tudo";
    }

    public void ShowCarroDaConssecionaria(){
        CARRO_PARA_VENDA.showCarro();
    }

}
