import java.util.Random;
import java.util.Scanner;

public class Exercicío6 {
  
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random gerador = new Random();
    int numero1;
    int numero2;
    int aleatorio;
    int maior;
    int menor;
     System.out.print(" Digite o primeiro número: ");
     numero1 = scanner.nextInt();

     System.out.print(" Digite o segundo número: ");
     numero2 = scanner.nextInt();

     maior = Math.max( numero1, numero2);

     menor = Math.min( numero1, numero2);

     aleatorio = gerador.nextInt(100);

     if ( aleatorio % 2== 0) 
        System.out.print("\n O número " + aleatorio + " e um número par." );
      
        else 
        System.out.print("\n O número " + aleatorio + " e um número impar");
        
        System.out.printf("\n O maior número é: " + maior);
        System.out.printf("\n O menor número é: " + menor);

        scanner.close();
    
 }
}