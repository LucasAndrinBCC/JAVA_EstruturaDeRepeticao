import java.util.Scanner;
//7. Faça um programa que receba dois números inteiros e gere os números inteiros que estão
//no intervalo compreendido por eles.
public class Exe7 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean flag = true;
		
		do {		
			System.out.print("Entre com o intervalo inicial: ");
			int a = entrada.nextInt();
			System.out.print("Entre com o intervalo final: ");
			int b = entrada.nextInt();
			
			if (a < b) {
				geraNumerosInteiros(a, b);
				flag = false;
			} else if (a > b) {
				geraNumerosInteiros(b, a);
				flag = false;
			} else {
				System.out.println("Entre com intervalos diferentes");
			}
			
		} while (flag);
		
		entrada.close();		
	}
	
	public static void geraNumerosInteiros(int inicialInterval, int finalInterval) {
		for (int i = inicialInterval; i <= finalInterval; i++) {
			System.out.print(i);
			
			if (i < finalInterval) {
				
				if (i % 10 == 0) {
					System.out.println(", ");
				} else {
					System.out.print(", ");
				}
				
			}
		}
	}
	
}
