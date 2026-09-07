import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em km: ");
        double distancia = entrada.nextDouble();

        System.out.print("Digite a quantidade de litros consumidos: ");
        double litros = entrada.nextDouble();

        double consumo = distancia / litros;

        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros consumidos: " + litros);
        System.out.println("Consumo: " + consumo + " km/l");

        if (consumo >= 12.0) {
            System.out.println("Classificação: econômico");
        } else {
            System.out.println("Classificação: alto consumo");
        }

        entrada.close();
    }
}
