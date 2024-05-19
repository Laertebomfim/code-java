package codeTest.codeInitial.javaCore.introducaoClass.aula11.dominio;

public class BlocoInicializacao {
    private  int[] num = new int[10];

    {
        for (int i = 0; i < num.length ;i++){
            num[i] = i + 1;
        }
    }
    public  void  showNum (){
        for (int i : num) System.out.print(i);
    }

    public int[] getNum() {
        return num;
    }
}
