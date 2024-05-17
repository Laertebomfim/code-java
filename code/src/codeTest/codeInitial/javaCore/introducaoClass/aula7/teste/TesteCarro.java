package codeTest.codeInitial.javaCore.introducaoClass.aula7.teste;

import codeTest.codeInitial.javaCore.introducaoClass.aula7.dominio.Carro;
import codeTest.codeInitial.javaCore.introducaoClass.aula7.dominio.MetodoCar;

public class TesteCarro {
    public static void main (String[] arg){
        Carro Civic = new Carro();
        MetodoCar metodoCar = new MetodoCar();
        
        Civic.cor = "prata";
        Civic.quantidadePorta = 4;
        Civic.velocidade = 300;

        metodoCar.setAno( Civic,2015);
        metodoCar.showCar(Civic);
    }
}
