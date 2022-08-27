import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * 
 * Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes
 * de trânsito. Foram obtidos os seguintes dados:
 * 
 * a. Código da cidade;
 * b. Número de veículos de passeio (em 1999);
 * c. Número de acidentes de trânsito com vítimas (em 1999).
 * 
 * Deseja-se saber:
 * d. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
 * e. Qual a média de veículos nas cinco cidades juntas;
 * f. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
 */
public class Exe32 {
	public int cod;
	public int numeroPasseio;
	public int numeroVitimas;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean first = true;
		float mediaPasseio, mediaAcidentes;
		
		mediaPasseio = mediaAcidentes = 0f;
		
		Exe32 cidade = new Exe32();
		Exe32 cidadeMaior = new Exe32();
		Exe32 cidadeMenor = new Exe32();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Entre com o codigo da cidade: ");
			cidade.cod = entrada.nextInt();
			
			System.out.print("Entre com o número de veiculos de passeio em 1999: ");
			cidade.numeroPasseio = entrada.nextInt();
			
			System.out.print("Entre com o número de acidentes de transito com vitimas em 1999: ");
			cidade.numeroVitimas = entrada.nextInt();
			
			if (first) {
				
				first = false;
				cidadeMaior = cidadeMenor = cidade;
				
			} else {
				if (cidade.numeroVitimas > cidadeMaior.numeroVitimas) {
					
					cidadeMaior = cidade;
					
				} else if (cidade.numeroVitimas < cidadeMaior.numeroPasseio) {
					
					cidadeMenor = cidade;
					
				}
			}
			
			if (cidade.numeroPasseio < 2000) {
				
				mediaAcidentes += cidade.numeroVitimas;
				
			}
			
			mediaPasseio += cidade.numeroPasseio;
		}
		
		mediaAcidentes /= 5;
		mediaPasseio /= 5;
		
		System.out.println("Maior íncidice de acidentes de trânsito " + cidadeMaior.cod + ": " + cidadeMaior.numeroVitimas);
		
		System.out.println("Menor íncidice de acidentes de trânsito " + cidadeMenor.cod + ": " + cidadeMenor.numeroVitimas);
		
		System.out.println("Média de veículos: " + mediaPasseio);
		
		System.out.println("Média de acidentes: " + mediaAcidentes);
		
		entrada.close();		
	}
	
}
