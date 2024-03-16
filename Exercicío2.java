import java.util.Scanner;

public class Exercicío2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor da compra e o valor pago
        System.out.print("Valor da compra (R$): ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Valor pago (R$): ");
        double valorPago = scanner.nextDouble();

        // Verifica se o valor pago é suficiente para a compra
        if (valorPago < valorCompra) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
            return;
        }

        // Calcula o troco
        double troco = valorPago - valorCompra;

        // Calcula o número de notas de cada valor
        int notas50 = (int) (troco / 50);
        troco %= 50;

        int notas20 = (int) (troco / 20);
        troco %= 20;

        int notas10 = (int) (troco / 10);
        troco %= 10;

        int notas5 = (int) (troco / 5);
        troco %= 5;

        int notas2 = (int) (troco / 2);
        troco %= 2;

        int notas1 = (int) troco;

        // Exibe o resultado
        System.out.println("\nTroco: R$" + String.format("%.2f", troco));
        System.out.println("Notas de R$ 50,00: " + notas50);
        System.out.println("Notas de R$ 20,00: " + notas20);
        System.out.println("Notas de R$ 10,00: " + notas10);
        System.out.println("Notas de R$ 5,00: " + notas5);
        System.out.println("Notas de R$ 2,00: " + notas2);
        System.out.println("Notas de R$ 1,00: " + notas1);
    
    }
}