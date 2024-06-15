package codeTest.codeInitial.javaCore.introducaoClass.aula13.test;


import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.execissio.Aluno;
import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.execissio.Local;
import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.execissio.Professor;
import codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.execissio.Seminario;

public class Execissio {
    public static void main(String[] args) {

        Local local = new Local("rua do carvalho");
        Aluno aluno = new Aluno("douglas",19);
        Aluno aluno2 = new Aluno("Angel",11);
        Aluno aluno3 = new Aluno("Manuel",12);

        Aluno[]  alunos = {aluno, aluno2, aluno3};

        Seminario seminario = new Seminario("conservação do pleneta", alunos, local);
        Professor profesor1 = new Professor("Marcelo","Conportamento homano");

        Seminario[] seminarios = {seminario};
        profesor1.setSeminarios(seminarios);

        seminarios[0].setProfesor(profesor1);

        for(Seminario sem : seminarios){
            sem.ShowSeminario();
        }

    }
}