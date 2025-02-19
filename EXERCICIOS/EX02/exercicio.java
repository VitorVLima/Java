//numeros primos

public class exercicio{
    public static void main(String[] args) {
       Conta primeiraConta = new Conta();
       Conta segundaConta = new Conta();
       primeiraConta.saldo = 200; 
       segundaConta.saldo = 300;
       System.out.println(primeiraConta.saldo);
       System.out.println(segundaConta.saldo);
       segundaConta.tranferir(200,primeiraConta);
       System.out.println(primeiraConta.saldo);
       System.out.println(segundaConta.saldo);
    }
}