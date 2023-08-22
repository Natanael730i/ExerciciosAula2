import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numerDigitado = 0;
        int numerosMaiores = 0;
        for(int i = 0; i < 20; i++){
            System.out.println("Digite uma idade: ");
            numerDigitado = ler.nextInt();

            if(numerDigitado >= 18 ){
                numerosMaiores ++;
            }
    |    }


        System.out.println("Esse é o numero de pessoas maiores de idade: " + numerosMaiores);
        ler.close();
    }
}