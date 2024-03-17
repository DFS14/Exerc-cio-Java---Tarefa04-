package tarefa04;
import java.util.Scanner;
public class Exe06 {
public static void main(String[] args) {	
Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora: Soma dos quadrados dos três valores lidos.");	


// *******************************************Leitura dos três valores*******************************************

System.out.print("Digite o valor de A: ");
float A = scanner.nextFloat();

System.out.print("Digite o valor de B: ");
float B = scanner.nextFloat();

System.out.print("Digite o valor de C: ");
float C = scanner.nextFloat();

// *******************************************Cálculo da soma dos quadrados***************************************

double somaQuadrados = Math.pow(A, 2) + Math.pow(B, 2) + Math.pow(C, 2);


// *******************************************Apresentação do resultado*******************************************

System.out.println("A soma dos quadrados dos valores lidos é: " + somaQuadrados);

scanner.close();

	}
}