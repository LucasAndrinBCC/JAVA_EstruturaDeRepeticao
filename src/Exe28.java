import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 *
 * O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa
 * que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a
 * maior temperaturas informadas, bem como a média das temperaturas.
 */
public class Exe28 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double temperatura, menor, maior, media;
		boolean first = true;
		int count = 0;
		menor = maior = media = 0;
		
		System.out.println("Entre com um número menor que -273.15 para o programa encerrar!");
		
		do {
			System.out.print("Informe a temperatura: ");
			temperatura = entrada.nextDouble();
			
			if (temperatura > -273.15) {
				media += temperatura;
				
				if (first) {
					maior = menor = temperatura;
					first = false;
				} else {
					if (temperatura > maior) {
						maior = temperatura;
					} else if (temperatura < menor) {
						menor = temperatura;
					}
				}
			}
			
			count++;
		} while (temperatura >= -273.15);
		
		media = media / count;
		
		System.out.println("Maior Temperatura: " + maior);
		System.out.println("Menor Temperatura: " + menor);
		System.out.println("Média de Temperatura: " + media);
		
		entrada.close();		
	}
	
}
