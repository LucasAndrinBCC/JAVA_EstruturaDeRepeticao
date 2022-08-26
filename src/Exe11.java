import java.util.Scanner;
//11. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
//números pares e a quantidade de números impares.
public class Exe11 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] num = new int[10];
		int par, impar;
		par = impar = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Informe um número inteiro: ");
			num[i] = entrada.nextInt();
			
			if (num[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Pares: " + par);
		System.out.println("Ímpares: " + impar);
		
		entrada.close();		
	}
	
}
