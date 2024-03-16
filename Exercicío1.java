import java.util.Scanner;

public class Exercicío1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int  numero1;
    int  numero2;
    int  numero3;
    double  media;
    int maior;
    int menor;
    
    System.out.print(" Digite o primero número: ");
    numero1 = scanner.nextInt();

    System.out.print(" Digite o segundo número: ");
    numero2 = scanner.nextInt();

    System.out.print(" Digite o terceiro número: ");
    numero3 = scanner.nextInt();

    maior = Math.max( numero1, Math.max(numero2 , numero3));
    
    menor = Math.min( numero1, Math.min(numero2 , numero3));

    media = (numero1 + numero2 + numero3) / 3;

    System.out.printf("\n O maior número é:  " + maior);
    
    System.out.printf("\n O menor número é:  " + menor);
    
    System.out.printf("\n A média desses números é: " + media);
    
    scanner.close();
  }
}