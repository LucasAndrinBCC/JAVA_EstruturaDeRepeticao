import java.util.Scanner;
//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//Ex.: 5!=5.4.3.2.1=120
public class Exe13 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = entrada.nextInt();
		
		int resultado = 1;
		
		for (int i = num; i > 1; i--) {
			resultado *= i;
		}
		
		System.out.println(num + "! = " + resultado);
		
		entrada.close();		
	}
	
}
