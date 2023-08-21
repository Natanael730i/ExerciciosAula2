import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numerDigitado = 0;
        int numerosMaiores = 0;
        for(int i = 0; i < 20; i++){
            System.out.println("Digite um número: ");
            numerDigitado = ler.nextInt();

            if(numerDigitado > 8 ){
                numerosMaiores ++;
            }
        }

        System.out.println("Essas foram as vezes que um número maior que 8 foi digitado: " + numerosMaiores);
        ler.close();
    }
}
