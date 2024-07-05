package codeTest.codeInitial.javaCore.introducaoClass.aula20.excecoes.test;

import codeTest.codeInitial.javaCore.introducaoClass.aula20.excecoes.dominio.LoginInvalidoException;

import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args) {
        String nome = "Nana";
        String senha = "153";

        try {
            login(nome,senha);
            System.out.println("login correto");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("exception capiturado");
        }
    }

    public static void login(String nome, String senha) throws LoginInvalidoException {
        Scanner plintTela = new Scanner(System.in);

        System.out.println("Usuário");
        String imputNome = plintTela.nextLine();

        System.out.println("Senha");
        String imputSenha = plintTela.nextLine();

        if (!senha.equals(imputSenha) && nome.equals(imputNome)){
            throw new LoginInvalidoException();
        }

    }
}
