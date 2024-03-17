package tarefa04;
import java.util.Scanner;
public class Exe05 {


public static void main(String[] args) {	
Scanner scanner = new Scanner(System.in);
System.out.println("Conversor de Real em Dolar");	


// *********************************Solicita o valor da cotação do dólar*********************************
System.out.print("Digite o valor da cotação do dólar: ");
float cotacaoDolar = scanner.nextFloat();

// *********************************Solicita a quantidade de reais***************************************
System.out.print("Digite a quantidade de reais: ");
float quantidadeReais = scanner.nextFloat();

// *********************************Realiza a conversão para dólares*************************************
float valorDolares = quantidadeReais / cotacaoDolar;

// *********************************Apresenta o valor convertido*****************************************
System.out.printf("O valor de R$ %.2f em dólares é: $ %.2f", quantidadeReais, valorDolares);

scanner.close();

	}

}
