//numeros primos

public class exercicio{
    public static void main(String[] args) {
       Conta primeiraConta = new Conta();
       Conta segundaConta = new Conta();
       Cliente vitor = new Cliente();
       vitor.setNome("vitor");
       vitor.setProfissao("dev");
       vitor.setCPF("07646604380");
       primeiraConta.setSaldo(200); 
       segundaConta.setSaldo(300);
       System.out.println(primeiraConta.getSaldo());
       System.out.println(segundaConta.getSaldo());
       segundaConta.tranferir(200,primeiraConta);
       System.out.println(primeiraConta.getSaldo());
       System.out.println(segundaConta.getSaldo());
       primeiraConta.setTitular(vitor);
       System.out.println(primeiraConta.getTitular().getProfissao());
    }
}