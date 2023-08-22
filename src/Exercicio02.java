public class Exercicio02 {
    public static void main(String[] args) {
        int valorTotal = 0;
        for (int i = 0 ; i <= 15; i++){
            valorTotal = i + valorTotal;
        }
        System.out.println("Valor total é: " + valorTotal);
    }
}