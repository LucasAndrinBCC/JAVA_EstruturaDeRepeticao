import java.util.Scanner;

//4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
//anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
//crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
//para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
//taxas de crescimento. Altere o programa anterior permitindo ao usuário informar as
//populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a
//operação.

public class Exe4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int habA, habB, anos = 0;
		float taxA, taxB;
		boolean flag = true;
		
		do {
			
			try {
				System.out.print("Habitantes do Pais A: ");
				habA = entrada.nextInt();
				
				System.out.print("Taxa de Crescimento (%) do Pais A: ");
				taxA = 1 + entrada.nextFloat()/100f;
				
				System.out.print("Habitantes do Pais B: ");
				habB = entrada.nextInt();
				System.out.print("Taxa de Crescimento (%) do Pais B: ");
				taxB = 1 + entrada.nextFloat()/100f;
				
				if (habA < habB && taxA > taxB) {
					while (habA < habB) {
						habA *= taxA;
						habB *= taxB;
						anos++;
					}
					
					System.out.println("Habitantes A: " + habA);
					System.out.println("Taxa A: " + (taxA * 100 - 100) + "%");
					System.out.println("Habitantes B: " + habB);
					System.out.println("Taxa B: " + (taxB * 100 - 100) + "%");
					System.out.println("Anos: " + anos);
				} else {
					System.out.println("É necessário que os habitantes da cidade A sejam de quantidade menor que os habitantes da cidade B e que sua taxa de crescimento exceda a taxa de crescimento da cidade B!");
				}
				
				entrada.nextLine();				
				System.out.print("Quer informar mais dados?");
				flag = entrada.nextBoolean();
			} catch (Exception e) {
				System.out.println("Entrada do dado inválida!");
			}
			
		} while (flag);
		
		entrada.close();		
	}
	
}
