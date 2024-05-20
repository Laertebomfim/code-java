package codeTest.codeInitial.javaCore.introducaoClass.aula11.dominio;

public class BlocoInicializacao2 {
    public String nome;
    public int aro;
    public static int[] variant;


    static {
        BlocoInicializacao2.variant=new int[]{2,5,6,1,3,83};
        for (int num : variant) System.out.print(num);
        System.out.println();
        System.out.println("fala 1");
    }
    static {
        System.out.println("fala 2");
    }
    static {
        System.out.println("fala 3");
        for (int num : variant) System.out.print(num);
    }
    public BlocoInicializacao2 (String nome, int aro){
        this.nome = nome;
        this.aro = aro;
    }

}
