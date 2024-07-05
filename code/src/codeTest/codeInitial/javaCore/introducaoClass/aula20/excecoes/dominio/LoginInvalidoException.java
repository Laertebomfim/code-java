package codeTest.codeInitial.javaCore.introducaoClass.aula20.excecoes.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
