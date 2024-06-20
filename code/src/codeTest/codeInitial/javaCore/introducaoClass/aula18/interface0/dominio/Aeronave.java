package codeTest.codeInitial.javaCore.introducaoClass.aula18.interface0.dominio;

public interface Aeronave {
    public static final int NUMERO_ASENTOS = 45;

    public static void TEXTO_AVIAO (){
        System.out.println("texto resevado parara a instancia avião");
    }

    void almentaVelocidade();
    void alturaAtingida(int alturaAtingida);

    default void quantasTurbinas(){
        System.out.println("Ele possui 2 torbinas");
    }

}
