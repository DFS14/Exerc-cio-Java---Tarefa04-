package tarefa04;
import java.util.Scanner;
public class Exe10 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Apuração de Votos");

//**********************************************Leitura da quantidade de votos válidos para cada candidato************************************

System.out.print("Digite a quantidade de votos válidos para o candidato A: ");
int votosA = scanner.nextInt();
System.out.print("Digite a quantidade de votos válidos para o candidato B: ");
int votosB = scanner.nextInt();
System.out.print("Digite a quantidade de votos válidos para o candidato C: ");
int votosC = scanner.nextInt();

//**********************************************Leitura da quantidade de votos nulos e em branco**********************************************

System.out.print("Digite a quantidade de votos nulos: ");
int votosNulos = scanner.nextInt();
System.out.print("Digite a quantidade de votos em branco: ");
int votosBrancos = scanner.nextInt();

//**********************************************Cálculo do número total de eleitores e percentuais********************************************

int totalEleitores = votosA + votosB + votosC + votosNulos + votosBrancos;
float percentualValidos = (float)(votosA + votosB + votosC) / totalEleitores * 100;
float percentualA = (float)votosA / totalEleitores * 100;
float percentualB = (float)votosB / totalEleitores * 100;
float percentualC = (float)votosC / totalEleitores * 100;
float percentualNulos = (float)votosNulos / totalEleitores * 100;
float percentualBrancos = (float)votosBrancos / totalEleitores * 100;

//**********************************************Apresentação dos resultados*******************************************************************

System.out.println("Número total de eleitores: " + totalEleitores);
System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
System.out.printf("Percentual de votos válidos do candidato A: %.2f%%\n", percentualA);
System.out.printf("Percentual de votos válidos do candidato B: %.2f%%\n", percentualB);
System.out.printf("Percentual de votos válidos do candidato C: %.2f%%\n", percentualC);
System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
System.out.printf("Percentual de votos em branco: %.2f%%\n", percentualBrancos);

	scanner.close();

	}
}