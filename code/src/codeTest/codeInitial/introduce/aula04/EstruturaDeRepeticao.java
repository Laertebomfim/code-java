package codeTest.codeInitial.introduce.aula04;

public class EstruturaDeRepeticao {
    // ctrl+f2 para o codigo
    public static void main (String[] arg){

        //while
        int number = 5;
        while (number >= 0 ){
            System.out.println(number--);
        }
        // do while
        number=5;
        System.out.println("___________________");
        do {
            System.out.println(number--);
        }while (number > 0);

        System.out.println("---------------------");
        // for
        for(int i = 0 ; i < 5 ; ++i){
            System.out.println(i);
        }

        // enprimir números parares de 1 até 100
        System.out.println("___________________");
        for(int i = 0; i <= 100;i+=2){
            System.out.println(i);
        }

    }
}
