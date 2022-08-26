import java.util.Scanner;
//17. Faça um programa que peça um número inteiro e determine se ele é ou não um número
//primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.
public class Exe17 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		int num = entrada.nextInt();
		int countDiv = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				countDiv++;
			}
		}
		
		if (countDiv == 2) {
			System.out.println("E primo!");
		} else {
			System.out.println("Nao e primo!");
		}
		
		entrada.close();	
	}
	
}
