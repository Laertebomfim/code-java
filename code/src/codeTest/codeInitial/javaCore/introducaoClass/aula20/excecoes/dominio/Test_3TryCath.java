package codeTest.codeInitial.javaCore.introducaoClass.aula20.excecoes.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Test_3TryCath implements Closeable {
    public void OpenBence(){
        System.out.println("abri banco");
    }
    @Override
    public void close() throws IOException {
        System.out.println("fecha banco-de-dado");
    }
}
