package tarefa04;
import java.util.Scanner;
public class Exe08 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Calculadora: Calculo de Valores ");	

        
// *************************************Leitura dos quatro valores inteiros*************************************

System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        
System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();
        
System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();
        
System.out.print("Digite o valor de D: ");
        int D = scanner.nextInt();
        
// *************************************Cálculo do produto e da soma*******************************************
        
        int P = A * C;
        int S = B + D;
        
// *************************************Apresentação dos resultados********************************************
        
System.out.println("O produto de A e C é: " + P);
System.out.println("A soma de B e D é: " + S);
        
        scanner.close();
    }
}