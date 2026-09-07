import java.util.Scanner;

/*
Casos de teste:

1) Preço do produto: 50.00
   Quantidade: 3
   Subtotal esperado: 150.00
   Desconto esperado: 0.00
   Valor final esperado: 150.00

2) Preço do produto: 50.00
   Quantidade: 4
   Subtotal esperado: 200.00
   Desconto esperado: 20.00
   Valor final esperado: 180.00
   Caso de fronteira: subtotal igual a 200.00
*/

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double precoProduto = entrada.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        double subtotal = precoProduto * quantidade;
        double desconto;

        if (subtotal >= 200.00) {
            desconto = subtotal * 0.10;
        } else {
            desconto = 0.00;
        }

        double valorFinal = subtotal - desconto;

        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        entrada.close();
    }
}
