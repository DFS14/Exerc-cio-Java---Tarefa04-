package tarefa04;
import java.util.Scanner;
public class Exe09 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora: Reajuste Salarial");	

        
// ************************************Solicita o salário mensal*******************************************

System.out.print("Digite o salário mensal: ");
float SM = scanner.nextFloat();
        
// ************************************Solicita o percentual de reajuste***********************************

System.out.print("Digite o percentual de reajuste: ");
float PR = scanner.nextFloat();
        
// ************************************Calcula o novo salário**********************************************

float NS = SM + (SM * PR / 100);
        
// ************************************Apresenta o novo salário********************************************

System.out.printf("O novo salário é: R$ %.2f", NS);
        
        scanner.close();
    }
}