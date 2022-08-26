import java.util.Scanner;
//Altere o programa anterior para mostrar no final a soma dos números.
public class Exe8 {
	
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
		int soma = 0;
		for (int i = inicialInterval; i <= finalInterval; i++) {
			soma += i;
		}
		System.out.println("Soma: " + soma);
	}
	
}
