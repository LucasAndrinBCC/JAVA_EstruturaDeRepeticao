import java.util.Scanner;
//12. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um
//programa capaz de gerar a série até o n−ésimo termo.
public class Exe12 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre como número de termos: ");		
		int numeroDeTermos = entrada.nextInt();
		
		int a = 0, b = 1, alternancia = 1;
		
		for (int i = 0; i < numeroDeTermos; i++) {
			System.out.print(alternancia);
			if (i < numeroDeTermos -1) {
				System.out.print(", ");
			}
			
			alternancia = a + b;
			
			a = b;
			b = alternancia;
		}
		
		entrada.close();
	}
	
}
