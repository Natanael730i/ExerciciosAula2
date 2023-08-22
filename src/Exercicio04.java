import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int somaDasIdades = 0;

        for (int i = 0; i < 20; i++){
            System.out.println("Digite a idade de uma pessoa: ");
            int idade = ler.nextInt();

            somaDasIdades = somaDasIdades + idade;
        }

        System.out.println("A soma das idade é: " + somaDasIdades);
        ler.close();
    }
}
