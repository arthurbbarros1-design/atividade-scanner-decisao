import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero >= 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

        entrada.close();
    }
}
