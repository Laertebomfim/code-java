package codeTest.codeInitial.javaCore.introducaoClass.aula8.dominio;

public class Varargs {

    private int[] number;

    public void atribuirValor(int... numbers){
        int value=0;
        for (int n : numbers){
            value += n;
        }
        System.out.println(value);
    }
    public void getValue(String name, int... number){}

    public void setNumber(int[] number) {
        this.number = number;
    }

    public int[] getNumber(){
        return this.number;
    }

}
