

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scanner.next();

        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = scanner.next();

        System.out.println("Entre com a matricula");
        aluno.matricula = scanner.next();

        aluno.nomeDisciplinas = new String[3];
        aluno.notasDisciplinas = new double [3] [4];
        for(int i=0; i<aluno.nomeDisciplinas.length;i++){
            System.out.println("Entre com o nome da diciplina " + i);
            aluno.nomeDisciplinas[i] = scanner.next();
        }

        for(int i=0; i<aluno.notasDisciplinas.length;i++){
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for(int j=0; j<aluno.notasDisciplinas[i].length;j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scanner.nextDouble();
            }
        }

        aluno.mostrarInfo();

    }
}
