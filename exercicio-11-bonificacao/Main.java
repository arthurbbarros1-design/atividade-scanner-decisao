import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorReferenciaBonificacao = 1000.00;
        double valorBonificacao = 100.00;

        System.out.print("Digite o nome do trabalhador: ");
        String nome = entrada.nextLine();

        System.out.print("Digite as horas trabalhadas: ");
        double horasTrabalhadas = entrada.nextDouble();

        System.out.print("Digite o valor da hora: R$ ");
        double valorHora = entrada.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double bonificacao;

        if (salarioBruto >= valorReferenciaBonificacao) {
            bonificacao = valorBonificacao;
        } else {
            bonificacao = 0.00;
        }

        double valorFinal = salarioBruto + bonificacao;

        System.out.println("Trabalhador: " + nome);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Bonificação: R$ " + bonificacao);
        System.out.println("Valor final a pagar: R$ " + valorFinal);

        entrada.close();
    }
}
