import java.util.Scanner;

//10. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
//número elevado ao segundo número. Não utilize a função de potência da linguagem.

public class Exe10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a base: ");
		int base = entrada.nextInt();
		
		System.out.print("Entre com o expoente: ");
		int expoente = entrada.nextInt();
		
		int resultado = 1;
		
		for (int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);
		
		entrada.close();		
	}
	
}
