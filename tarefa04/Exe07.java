package tarefa04;
import java.util.Scanner;
public class Exe07 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    
System.out.println("Calculadora: Quadrado da soma dos três valores lidos.");	

    
// **********************************Leitura dos três valores**************************************************

System.out.print("Digite o valor de A: ");
float A = scanner.nextFloat();   
System.out.print("Digite o valor de B: ");
float B = scanner.nextFloat();   
System.out.print("Digite o valor de C: ");
float C = scanner.nextFloat();  
    
// **********************************Cálculo do quadrado da soma dos valores**********************************

double resultado = Math.pow(A + B + C, 2);
    
// **********************************Apresentação do resultado************************************************

System.out.println("O quadrado da soma dos valores lidos é: " + resultado);
    

    scanner.close();
    
    
	}
}