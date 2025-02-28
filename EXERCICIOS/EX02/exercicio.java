//numeros primos

public class exercicio{
    public static void main(String[] args) {
        Cliente vitor = new Cliente("07646604280","vitor","dev");
        Cliente rodrigo = new Cliente("09347828363","rodrigo","medico");
       Conta primeiraConta = new Conta(0,1466,20,vitor);
       Conta segundaConta = new Conta(0,1465,22,rodrigo);
       primeiraConta.setSaldo(200); 
       segundaConta.setSaldo(300);
       System.out.println(primeiraConta.getSaldo());
       System.out.println(segundaConta.getSaldo());
       segundaConta.tranferir(200,primeiraConta);
       System.out.println(primeiraConta.getSaldo());
       System.out.println(segundaConta.getSaldo());
       System.out.println(primeiraConta.getTitular().getProfissao());
       System.out.println(segundaConta.getTitular().getProfissao());
    }
}