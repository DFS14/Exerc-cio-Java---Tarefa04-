package tarefa04;
import java.util.Scanner;
public class Exe04 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	        
System.out.println("Conversor de Dolar em Real");


// *********************************Solicita o valor da cotação do dólar*********************************

System.out.print("Digite o valor da cotação do dólar: ");
float cotacaoDolar = scanner.nextFloat();
	        
// *********************************Solicita a quantidade de dólares*************************************

System.out.print("Digite a quantidade de dólares: ");
float quantidadeDolares = scanner.nextFloat();
	        
// *********************************Realiza a conversão para reais***************************************

float valorReais = quantidadeDolares * cotacaoDolar;
	        
// *********************************Apresenta o valor convertido*****************************************

System.out.printf("O valor de %.2f dólares em reais é: R$ %.2f", quantidadeDolares, valorReais);

	        
scanner.close();
	
    }
}