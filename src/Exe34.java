import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa que leia uma quantidade indeterminada de números positivos e conte
 * quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
 * de dados deverá terminar quando for lido um número negativo.
 */
public class Exe34 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, intervalo25, intervalo50, intervalo75, intervalo100;
		intervalo25 = intervalo50 = intervalo75 = intervalo100 = 0;
		
		do {
			System.out.print("Entre com um número: ");
			num = entrada.nextInt();
			if (num >= 0) {
				if (num <= 25) {
					intervalo25++;
				} else if (num <= 50) {
					intervalo50++;
				} else if (num <= 75) {
					intervalo75++;
				} else if (num <= 100) {
					intervalo100++;
				}
			}
		} while (num >= 0);
		
		System.out.println("[0, 25]: " + intervalo25);
		System.out.println("[26, 50]: " + intervalo50);
		System.out.println("[51, 75]: " + intervalo75);
		System.out.println("[76, 100]: " + intervalo100);
		
		entrada.close();		
	}
	
}
