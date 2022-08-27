import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 *
 * Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o
 * número do aluno e o segundo representando a sua altura em centímetros. Encontre o aluno
 * mais alto e o mais baixo. Mostre o número do aluno mais alto e o número do aluno mais
 * baixo, junto com suas alturas.
 */
public class Exe31 {
	
	private int numero;
	private float altura;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean first = true;
		
		Exe31 aluno = new Exe31(), alunoMaior = new Exe31(), alunoMenor = new Exe31();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Entre como numero do aluno: ");
			aluno.numero = entrada.nextInt();
			
			System.out.print("Entre com a altura do aluno: ");
			aluno.altura = entrada.nextFloat();
			
			if (first) {
				first = false;
				alunoMaior = alunoMenor = aluno;
			} else {
				if (aluno.altura > alunoMaior.altura) {
					alunoMaior = aluno;
				} else if (aluno.altura < alunoMenor.altura) {
					alunoMenor = aluno;
				}
			}
		}
		
		System.out.println("\nAluno Mais Alto {");
		System.out.println("	numero: " + alunoMaior.numero);
		System.out.println("	altura: " + alunoMaior.altura + "cm");
		System.out.println("}");
		
		System.out.println("Aluno Mais Baixo {");
		System.out.println("	numero: " + alunoMenor.numero);
		System.out.println("	altura: " + alunoMenor.altura + "cm");
		System.out.println("}");		
		
		entrada.close();		
	}
	
}
