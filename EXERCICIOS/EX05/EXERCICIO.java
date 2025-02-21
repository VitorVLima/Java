public class EXERCICIO {
    public static void main(String[] args) {
        Carro van = new Carro();

        van.modelo = "Ducato";
        van.marca = "Fiat";
        
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numPassageiros);
    }
}
