package codeTest.codeInitial.introduce.aula03;

import java.util.zip.Deflater;

public class EstruturaDeCondicao {
    public static void main (String[] arg){
        double valorPlacaMae = 207;
        double valorFonte = 180;
        double valorPlacaDeVideo = 142;
        double valorSSD = 140;
        double valorPc = valorPlacaMae + valorFonte + valorPlacaDeVideo + valorSSD;

        // operação com o if

        if (valorPc <= 500){
            System.out.println("pc compravel ");
        }else if (valorPc <= 800){
            System.out.println("pc pensavel");
        }else {
            System.out.println("pc não compravel");
        }

        // operação ternaria.mas não recomendado

        String sintuacaoPc =  valorPc <= 500 ? "Pc compravel" : valorPc <= 800 ? "pc pensavel": "pc não compravel";

        //operação com switch

        int days = 6;
        String menssgem;
        switch (days){
            case 0:
                menssgem = "Domingo";
                break;
            case 1:
                menssgem = "Segunda";
                break;
            case 2:
                menssgem = "Têrça";
                break;
            case 3:
                menssgem = "Quarta";
                break;
            case 4:
                menssgem = "quinta";
                break;
            case 5:
                menssgem = "Sexta";
                break;
            case 6:
                menssgem = "Sábado";
                break;
            default:
                menssgem = "";
        }
        System.out.println(menssgem);

    }

}
