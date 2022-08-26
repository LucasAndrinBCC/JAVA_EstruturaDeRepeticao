import java.util.Scanner;
/**
 * @author Lucas Andrin
 * 
 * Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a
 * quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter
 * mais de 40 alunos.
 */
public class Exe23 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de turmas: ");
		int numTurmas = entrada.nextInt(), alunos;
		float media =0;
		int i = 0;
		while (i < numTurmas) {
			System.out.print("Informe a quantidade de alunos da turma: ");
			alunos = entrada.nextInt();
			
			if (alunos <= 40) {
				media += alunos;
				i++;
			} else {
				System.out.println("Não pode ter mais que 40 alunos");
			}
		}
		
		media /= numTurmas;
		
		System.out.println("Média de alunos por turma: " + media);
		
		entrada.close();		
	}
	
}
