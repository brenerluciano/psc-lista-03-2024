import java.util.Scanner;

public class Exercicío4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1. Calcular perímetro do círculo");
        System.out.println("2. Calcular área do círculo");
        System.out.println("3. Calcular volume da esfera");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.print("Digite o raio do círculo: ");
                double raioCirculo = scanner.nextDouble();
                double perimetroCirculo = 2 * Math.PI * raioCirculo;
                System.out.printf("Perímetro do círculo: %.2f%n", perimetroCirculo);
                break;
            case 2:
                System.out.print("Digite o raio do círculo: ");
                double raioCirculo2 = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raioCirculo2, 2);
                System.out.printf("Área do círculo: %.2f%n", areaCirculo);
                break;
            case 3:
                System.out.print("Digite o raio da esfera: ");
                double raioEsfera = scanner.nextDouble();
                double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raioEsfera, 3);
                System.out.printf("Volume da esfera: %.2f%n", volumeEsfera);
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}