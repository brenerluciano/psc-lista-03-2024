import java.util.Scanner;

public class Exercicío3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os coeficientes da equação ax^2 + bx + c = 0:");
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        // Verificando se 'a' é diferente de zero
        if (a == 0) {
            System.out.println("O coeficiente 'a' não pode ser igual a zero. A equação não é do segundo grau.");
        }

        // Calculando o discriminante (delta)
        double delta = b * b - 4 * a * c;

        // Verificando o valor do discriminante
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raizUnica = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: x = %.2f%n", raizUnica);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais distintas:%n");
            System.out.printf("x1 = %.2f%n", raiz1);
            System.out.printf("x2 = %.2f%n", raiz2);
        }

        scanner.close();
    }
}