package tarefa04;

import java.util.Scanner;

public class Exe01 {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Calculadora: Variavéis A, B, C e D");
    
    //****************************************Lê os quatro números inteiros****************************************
    System.out.print("Digite o valor de A: ");
    int A = scanner.nextInt();
    System.out.print("Digite o valor de B: ");
    int B = scanner.nextInt();
    System.out.print("Digite o valor de C: ");
    int C = scanner.nextInt();
    System.out.print("Digite o valor de D: ");
    int D = scanner.nextInt();
    
    //****************************************Realiza as operações de adição***************************************
    int somaAB = A + B;
    int somaAC = A + C;
    int somaAD = A + D;
    int somaBC = B + C;
    int somaBD = B + D;
    int somaCD = C + D;
    //****************************************Realiza as operações da multiplicação********************************
    int multAB = A * B;
    int multAC = A * C;
    int multAD = A * D;
    int multBC = B * C;
    int multBD = B * D;
    int multCD = C * D;
    
    //****************************************Apresenta os resultados da Adição*********************************************
    System.out.println("Resultados das Adições:");
    System.out.println("A + B = " + somaAB);
    System.out.println("A + C = " + somaAC);
    System.out.println("A + D = " + somaAD);
    System.out.println("B + C = " + somaBC);
    System.out.println("B + D = " + somaBD);
    System.out.println("C + D = " + somaCD);
    
    //****************************************Apresenta os resultados da Multiplicação*************************************
    System.out.println("Resultados das Multiplicações:");
    System.out.println("A * B = " + multAB);
    System.out.println("A * C = " + multAC);
    System.out.println("A * D = " + multAD);
    System.out.println("B * C = " + multBC);
    System.out.println("B * D = " + multBD);
    System.out.println("C * D = " + multCD);
    
    scanner.close();
}
}


