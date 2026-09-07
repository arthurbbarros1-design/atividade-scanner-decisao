import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço unitário do produto: ");
        double preco = entrada.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        double subtotal = preco * quantidade;
        double desconto;

        if (subtotal >= 200.0) {
            desconto = subtotal * 0.05;
        } else {
            desconto = 0.0;
        }

        double valorFinal = subtotal - desconto;

        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        entrada.close();
    }
}
