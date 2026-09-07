import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = entrada.nextDouble();

        System.out.print("Digite o valor da hora: ");
        double valorHora = entrada.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor da hora: R$ " + valorHora);
        System.out.println("Salário bruto: R$ " + salarioBruto);

        entrada.close();
    }
}
