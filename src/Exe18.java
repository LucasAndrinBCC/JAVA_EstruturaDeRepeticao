import java.util.Scanner;
//18. Altere o programa de cálculo dos números primos, informando, caso o número não seja
//primo, por quais número ele é divisível.
public class Exe18 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		int num = entrada.nextInt();
		int count = 0;
		int[] divisores = new int[num];
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores[count] = i;
				count++;
			}
		}
		
		if (count == 2) {
			System.out.println("E primo!");
		} else {
			System.out.println("Nao e primo! Divisores:");
			for (int i = 0; i < count; i++) {
				System.out.print(divisores[i] + " ");
			}
		}
		
		entrada.close();
	}
	
}
