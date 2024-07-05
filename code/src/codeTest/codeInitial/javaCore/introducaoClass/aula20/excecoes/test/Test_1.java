package codeTest.codeInitial.javaCore.introducaoClass.aula20.excecoes.test;

import java.io.File;
import java.io.IOException;

public class Test_1 {
    public static void main(String[] args) {
        File file = new File("arquivo/arquivo_text.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            e.getMessage();
        }

        int[] veto = new int[]{1,5,4};
        showNumero(veto,3);
    }

    /**
     *
     * @param veto
     * @param local não pode ser mair que 2
     * @throws ArrayIndexOutOfBoundsException pode ser lançado
     */
    public static void showNumero( int[] veto, int local) {
        try {
        System.out.println(veto[local]);

        }catch (Exception e){
            e.printStackTrace();

            throw new ArrayIndexOutOfBoundsException();
        }finally {
            System.out.println("execulção feita");
        }

    };

}
