package tarefa04;
import java.util.Scanner;
public class Exe02 {


public static void main(String[] args) {	
Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora: Volume de caixa");
	
	
	
//*************************Solicita ao usuário que insira as dimensões da caixa retangular****
System.out.print("Digite o comprimento da caixa: ");
float comprimento = scanner.nextFloat();

System.out.print("Digite a largura da caixa: ");
float largura = scanner.nextFloat();

System.out.print("Digite a altura da caixa: ");
float altura = scanner.nextFloat();


//*************************Calcula o volume da caixa******************************************
float volume = comprimento * largura * altura;


//*************************Apresenta o resultado**********************************************
System.out.printf("O volume da caixa retangular é: %.2f unidades cúbicas.%n", volume);

scanner.close();
	}
}