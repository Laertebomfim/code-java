package codeTest.codeInitial.javaCore.introducaoClass.aula13.Dominio.associacao.execissio;

public class Seminario {
    private String titulo;
    private  Aluno[] alunos;
    private  Local local;
    private  Professor profesor;

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void setProfesor(Professor profesor) {
        this.profesor = profesor;
    }
    public void ShowSeminario(){
        System.out.println("___detalhes do evento___");
        System.out.println(this.titulo);
        System.out.println(this.local.getEndereco());

        System.out.println("--- Profassor a ministra o seminario ---");
        if(this.profesor != null) System.out.println(this.profesor.getNome()+" : "+this.profesor.getEspecialidade());

        System.out.println("--- Aluno que irão participa ---");
        for(Aluno alu : alunos){
            System.out.print(alu.getNome()+" : ");
            System.out.println(alu.getIdade());
        }
    }
}
