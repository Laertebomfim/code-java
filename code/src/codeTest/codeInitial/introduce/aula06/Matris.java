package codeTest.codeInitial.introduce.aula06;

public class Matris {
    public static void main(String[] arg){
     int[][] number = new int[10][5];

        for (int i = 0; i < number.length ; i++) {
            number[i][4] = 1;
            for (int j = 0; j < number[i].length; j++) {
                number[i][j]= number[i][4]++*10;
            }
        }
        for (int[] num:number) {
            for(int num2:num){
                System.out.print(num2);
            }
            System.out.println("\n_________________");
        }

        // instanciando arrays de arrays segunda forma
        int[][] var = new int[3][];
        var[0] = new int[2];
        var[1] = new int[3];
        var[2] = new int[4];

        // terceira forma
        int[][] var2 = {{12,45},{65,38,15},{48,28,48,48}};
    }
}
