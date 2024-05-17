package codeTest.codeInitial.javaCore.introducaoClass.aula7.dominio;

public class MetodoCar {

 public void showCar(Carro carro){
  System.out.print(carro.velocidade+"-");
  System.out.print( carro.cor+"-");
  System.out.print(carro.quantidadePorta+"-");
  System.out.print(carro.ano);
 }
 public void setAno(Carro carro, int valueAno){
  carro.ano=valueAno;
 }

}
