import java.util.Scanner;
//15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37.
public class Exe15 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float soma = 0f;
		float contador = 1;
		for (int i = 38; i > 1; i--) {
			
			System.out.println("S = (" + (i - 1) + "*" + i + ")/" + contador + " ");
			
			soma += ((i - 1) * i) / contador;
			
			contador++;
			
		}
		
		System.out.println("S = " + soma);
		
		entrada.close();		
	}
	
}
