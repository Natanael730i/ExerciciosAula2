import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int mediaDasIdades = 0;

        for (int i = 0; i < 20; i++){
            System.out.println("Digite a idade de uma pessoa: ");
            int idade = ler.nextInt();

            mediaDasIdades = mediaDasIdades + idade;
        }

        int media = mediaDasIdades / 20;
        System.out.println("A soma das idade é: " + media);
        ler.close();
    }
}