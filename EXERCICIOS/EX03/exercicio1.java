import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args) {
        int[] notas = new int[10];
        Random random = new Random();
        for(int nota: notas){
            nota = random.nextInt(10);
            System.out.println(nota);
            
        }
    }
}