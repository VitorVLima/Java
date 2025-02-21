

public class Aluno {
    String nome;;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas;
    double[] [] notasDisciplinas;

    public void mostrarInfo(){
        System.out.println("O nome do aluno é: " + this.nome);
        System.out.println("A matricula do aluno É " + this.matricula);
        System.out.println("O nome do curso é: " + this.nomeCurso);

        for(int i=0; i<this.nomeDisciplinas.length;i++){
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for(int j=0;j<notasDisciplinas[i].length;j++){
                System.out.print(this.notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
