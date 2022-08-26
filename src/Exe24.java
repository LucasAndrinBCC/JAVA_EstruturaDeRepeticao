import java.util.Scanner;
/*
 * Faça um programa que calcule o valor total investido por um colecionador em sua
 * coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a
 * quantidade de CDs e o valor para em cada um.
 */
public class Exe24 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de CDs: ");
		int numCds = entrada.nextInt();
		float media = 0f;
		
		for (int i = 0; i < numCds; i++) {
			System.out.print("Entre com o preco do CD");
			media += entrada.nextFloat();
		}
		
		System.out.println("Total Investido: " + media);
		System.out.println("Media por CD: " + media/numCds);
		
		entrada.close();		
	}
	
}
