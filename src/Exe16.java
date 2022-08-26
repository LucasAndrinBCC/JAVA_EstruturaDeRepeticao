import java.util.Scanner;
//16. Faça um programa que, dado um conjunto de N números, determine o menor valor, o
//maior valor e a soma dos valores.
public class Exe16 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade de números: ");
		int quantidadeNumeros = entrada.nextInt();
		
		int[] num = new int[quantidadeNumeros];
		
		int menor, maior, soma;
		
		menor = maior = soma = 0;
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.print("Entre com um número: ");
			num[i] = entrada.nextInt();
			
			if (num[i] < num[menor]) {
				menor = i;
			} else if (num[i] > num[maior]) {
				maior = i;
			}
			soma += num[i];
		}
		
		System.out.println("Maior: " + num[maior]);
		System.out.println("Menor: " + num[menor]);
		System.out.println("Soma: " + soma);
		
		entrada.close();
	}
	
}
