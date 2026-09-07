import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorMinimoFreteGratis = 150.00;
        double valorFixoFrete = 15.00;

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = entrada.nextDouble();

        double valorFrete;

        if (valorCompra >= valorMinimoFreteGratis) {
            valorFrete = 0.00;
        } else {
            valorFrete = valorFixoFrete;
        }

        double valorTotal = valorCompra + valorFrete;

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor do frete: R$ " + valorFrete);
        System.out.println("Valor total a pagar: R$ " + valorTotal);

        entrada.close();
    }
}
