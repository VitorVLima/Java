

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){
        this.numPassageiros = 4;
    }
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel);
    }

    double obterAutonomia(){
        System.out.println("Metodo obterAutonomia foi chamado. ");
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
