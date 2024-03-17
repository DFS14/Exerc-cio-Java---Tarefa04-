package tarefa04;
import java.util.Scanner;
public class Exe03 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);	

System.out.println("Calculadora: Quadrado da Diferença");
	
     
// ******************************Lê os valores inteiros para as variáveis A e B*********************************

System.out.print("Digite o valor de A: ");
int A = scanner.nextInt();
        
System.out.print("Digite o valor de B: ");
int B = scanner.nextInt();
        
// ******************************Calcula o quadrado da diferença entre A e B************************************

int resultado = (A - B) * (A - B);
        
// ******************************Imprime o resultado************************************************************

System.out.println("O resultado do quadrado da diferença é: " + resultado);
        
        
scanner.close();

    }
}
