import java.time.Instant;
import java.util.Scanner;
/*
 * Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro
 * fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele
 * executou para encontrar os números primos
 */
public class Exe19 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o limite: ");
		int finalInterval = entrada.nextInt();
		int numeroDivisoes, countPrimos;
		boolean ehPrimo;
		
		numeroDivisoes = countPrimos = 0;
		
		long msInicial = Instant.now().toEpochMilli();
		for (int i = 2; i < finalInterval; i++) {

			ehPrimo = true;
			for (int j = 2; j < i; j++) {
				
				numeroDivisoes++;
				if (i % j == 0) {
					ehPrimo = false;
					break;
				}
				
			}
			
			if (ehPrimo) {
				countPrimos++;
			}
			
		}
		long msFinal = Instant.now().toEpochMilli();
		
		System.out.println("\nNumero de divisoes: " + numeroDivisoes);
		System.out.println("Quantidade de primos: " + countPrimos);
		System.out.println("Tempo de execucao: " + (msFinal - msInicial) + "ms");
		
		entrada.close();
	}
	
}
