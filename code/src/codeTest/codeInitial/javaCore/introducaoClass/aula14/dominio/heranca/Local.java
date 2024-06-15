package codeTest.codeInitial.javaCore.introducaoClass.aula14.dominio.heranca;

public class Local {
    private String cep;
    private String rua;

    public Local(String cep, String rua){
        this.cep = cep;
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }
    public String getRua(){
        return rua;
    }
}
