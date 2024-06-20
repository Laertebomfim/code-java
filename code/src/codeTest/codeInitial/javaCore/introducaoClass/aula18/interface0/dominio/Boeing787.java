package codeTest.codeInitial.javaCore.introducaoClass.aula18.interface0.dominio;

public class Boeing787 implements Aeronave {

    protected int passageiros;
    protected int alturaEmPes = 0;
    protected int velocidadeEmKm;

    public Boeing787(int passageiros){
        this.passageiros= passageiros;
    }

    @Override
    public void almentaVelocidade() {
        if(alturaEmPes == 0 && velocidadeEmKm <= 5000) {
            velocidadeEmKm += 1000;
        }else if (alturaEmPes < 1500 && velocidadeEmKm <= 30000){
            velocidadeEmKm +=1000;
        }
    }

    @Override
    public void alturaAtingida(int alturaAtingida) {
        this.alturaEmPes = alturaAtingida;
    }

    @Override
    public void quantasTurbinas() {
        Aeronave.super.quantasTurbinas();
    }

}
