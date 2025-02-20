//saldo, agencia, numero e titular.

public class Conta{

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setTitular(Cliente cliente){
        this.titular = cliente;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

}


