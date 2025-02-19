//numeros primos

public class exercicio{
    public static void main(String[] args) {
        System.out.println("Numeros primos:");
        for(int i=2;i<=100;i++){
            int divisor=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    divisor++;
                }
            }
            if(divisor==2){
                System.out.print(i+" ");
            }
        }
    }
}