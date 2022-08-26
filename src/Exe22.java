import java.util.Scanner;
/* Numa eleição existem três candidatos. Faça um programa que peça o número total de
 * votantes. Peça para cada votante votar e ao final mostrar o número de votos de cada
 * candidato
 */
public class Exe22 {
	
	private static final int CandA = 1;
	private static final int CandB = 2;
	private static final int CandC = 3;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o numero de votantes: ");
		int numeroVotantes = entrada.nextInt();
		int qtdA, qtdB, qtdC, voto;
		
		qtdA = qtdB = qtdC = 0;
		
		for (int i = 0; i < numeroVotantes; i++) {
			System.out.print("Entre com o cadidato (1 - Cadidato A, 2 - Candidato B, 3 - Cadidato B): ");
			voto = entrada.nextInt();
			
			if (voto == CandA) {
				qtdA++;
			} else if (voto == CandB) {
				qtdB++;
			} else if (voto == CandC) {
				qtdC++;
			}
		}
		
		System.out.println("Candidato A: " + qtdA);
		System.out.println("Candidato B: " + qtdB);
		System.out.println("Candidato C: " + qtdC);
		
		entrada.close();		
	}
	
}
