import java.util.Scanner;
//Faça um programa que mostre os n termos da Série a seguir:
//• S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
public class Exe14 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número de termos: ");
		int numeroTermos = entrada.nextInt();
		float denominador = 1f, soma = 0f;
		
		System.out.print("S = ");
		for (int i = 1; i <= numeroTermos; i++) {
			soma += i / denominador;
			System.out.print(i + "/" + denominador);
			if (i < numeroTermos) {
				System.out.print(" + ");
			}
			denominador += 2;
		}
		
		System.out.print(" = " + soma);
		
		entrada.close();		
	}
	
}
