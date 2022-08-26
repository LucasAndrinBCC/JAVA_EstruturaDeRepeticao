import java.util.Scanner;
//5. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois
//modifique o programa para que ele mostre os números um ao lado do outro.
public class Exe5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 20; i++) {
			System.out.print(i);
			if (i < 20) {
				System.out.print(", ");
			}
		}
		
		entrada.close();		
	}
	
}
