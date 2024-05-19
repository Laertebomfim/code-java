package codeTest.codeInitial.javaCore.introducaoClass.aula12.dominio;

public class Estatico {
    private String nome;
    private String cor;
    public static int speedCar;

    {
        speedCar = 300;
    }

    public Estatico(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }

    public void showCar(){
        System.out.println(this.nome);
        System.out.println(this.cor);
        System.out.println(Estatico.speedCar);
    }
    public static void setSpeedCar (int speedCar){
        Estatico.speedCar = speedCar;
    }
    public static int getSpeedCar (){
        return Estatico.speedCar;
    }
}
