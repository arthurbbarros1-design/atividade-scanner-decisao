import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = entrada.nextLine();

        System.out.println("\n--- Cadastro ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);

        entrada.close();
    }
}
