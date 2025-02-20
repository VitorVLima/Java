import java.util.Scanner;

public class exercicio{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String nome = scanner.nextLine();
        System.out.println("Seu nome completo é: " + nome);
    }
}