package codeTest.codeInitial.introduce.aula01;

/**
 * int, double, float, char, byte, short, long, boolean
 */
public class typePrimitivos {
    public static void main (String[] args){
        byte numberByte = 10; // numero inteiro que suporta ate 8 bits -128 ou 127
        short numberShort = 20; // numero inteiro que suporta ate 16 bits
        int number = 30; // numero inteiro que suporta ate 32 bits
        long numberLong = 40; // numero inteiro que suporta ate 64 bits

        float numberFloat = 45.5f; //tipo futuante que pode receber ate 32 bites
        double numberDouble = 45.5; //tipo futuante que pode receber ate 64 bites

        boolean trueOuFalse = true;

        String allType = "byte:"+numberByte+" short:"+numberShort+ "int;"+number+ "long:"+ numberLong+ "Float:"+ numberFloat+ "Double:"+ numberDouble + "boolean:" + trueOuFalse;

        System.out.println(allType);

    }
}
