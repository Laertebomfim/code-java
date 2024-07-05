package codeTest.codeInitial.javaCore.introducaoClass.aula20.excecoes.test;

import java.io.IOException;

public class Test_2 {
    public static void main(String[] args) {
        int[] veto = new int[]{1,5,4};
        showNumero(veto,3);
    }
    public static void showNumero( int[] veto, int local) {
        try {
            System.out.println(veto[local]);
            throw new  IOException();

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("exceção ArrayIndexOutOfBoundsException ");

        }catch (IndexOutOfBoundsException | IOException e){
            e.printStackTrace();
            System.out.println("exeção RuntimeException");

        }

    }
}
