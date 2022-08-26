import java.util.Scanner;

//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
//seja inválido e continue pedindo até que o usuário informe um valor válido.

public class Exe1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float nota = 0;
		boolean validacao;
		
		do {
			validacao = false;
			
			try {
				System.out.print("Informe a nota: ");
				nota = entrada.nextFloat();
				
				if (nota < 0 || nota > 10) {
					validacao = true;
					entrada.nextLine();
				}
			} catch (Exception e) {
				System.out.println("Catch");
				validacao = true;
				entrada.nextLine();
			}			
			retornaErro(validacao);
			
		} while (validacao);
		
		System.out.println("Nota Válida! " + nota);
		
		
		entrada.close();		
	}
	
	public static void retornaErro(boolean validacao) {
		if (validacao) {
			System.out.println("Nota informada inválida!");
		}
	}
	
}
