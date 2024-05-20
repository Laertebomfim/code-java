package codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.muintosParaUm;

public class Casa {
    private int comodos = 4;
    private int janelas = 2;
    private Morador[] morador;


    public Casa( Morador[] morador){
        this.morador = morador;
    }
    public Casa(){}

    public void showCasa(){
        System.out.println("--- casa ---");
        System.out.println("comodos -- "+this.comodos);
        System.out.println("Janelas -- "+ this.janelas);
    }

    public void showMorado (){
        System.out.println("--- moradores ----");
        for( Morador m : morador){
            System.out.print(m.getNome()+" - ");
            System.out.print(m.getSexo()+" - ");
            System.out.print(m.getIdade()+"\n");
        }
    }
}
