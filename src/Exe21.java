import java.util.Scanner;
/*
 * Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
 * verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
 * dizer se a turma é jovem, adulta ou idosa, conforme a média calculad
 */
public class Exe21 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pessoas: ");
		int numeroPessoas = entrada.nextInt();
		float media = 0f;
		for (int i = 0; i < numeroPessoas; i++) {
			
			System.out.print("Informe a nota: ");
			media += entrada.nextFloat();
			
		}
		
		media /= numeroPessoas;
		
		if (media < 26) {
			System.out.println("Tuma jovem!");
		} else if (media < 60) {
			System.out.println("Tuma adulta!");
		} else {
			System.out.println("Turma idosa!");
		}
		
		entrada.close();		
	}
	
}
