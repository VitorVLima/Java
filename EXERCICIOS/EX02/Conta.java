//saldo, agencia, numero e titular.

public class Conta{

    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){
        if(this.saldo > 0 && this.saldo>valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            System.out.println("Não há saldo suficiente, saldo negado");
            return false;
        }
    }

    public boolean tranferir(double valor, Conta destino){
        if(valor > this.saldo){
            System.out.println("Não há saldo suficiente, saldo negado");
            return false;
        }else{
            this.saldo = this.saldo - valor;
            destino.deposita(valor);
            System.out.println("Valor transferido com sucesso");
            return true;
        }
    }

}


