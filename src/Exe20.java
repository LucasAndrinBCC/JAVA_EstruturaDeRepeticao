import java.util.Scanner;
//20. Faça um programa que calcule e mostre a média aritmética de N notas
public class Exe20 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de notas: ");
		int qtdNotas = entrada.nextInt();
		float media = 0f;
				
		for (int i = 0; i < qtdNotas; i++) {
			
			System.out.print("Informe uma nota: ");
			media += entrada.nextFloat();
			
		}
		
		media /= qtdNotas;
		
		System.out.println("Média: " + media);
		
		entrada.close();
	}
	
}
