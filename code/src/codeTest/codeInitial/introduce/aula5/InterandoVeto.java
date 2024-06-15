package codeTest.codeInitial.introduce.aula5;

public class InterandoVeto {
    public static void  main(String[] arg){
        int[] number = new int[10];
        number[9] = 1;

        // caso eu precise do índici
        for(int i = 0;i < number.length; i++){
            number[i]=number[9]++*10;
        }

        // o VALOR que ésta em cada espaço do veto
        for(int num:number) {
            System.out.println(num);
        }
    }
}
