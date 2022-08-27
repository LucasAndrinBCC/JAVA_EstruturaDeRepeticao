import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 *
 * O cardápio de uma lanchonete é o seguinte:
 * Especificação Código Preço
 * 
 * Cachorro Quente 100 R$ 1,20
 * Bauru Simples 101 R$ 1,30
 * Bauru com ovo 102 R$ 1,50
 * Hambúrguer 103 R$ 1,20
 * Cheeseburguer 104 R$ 1,30
 * Refrigerante 105 R$ 1,00
 */
public class Exe35 {
	
	private static final float[] HOT_DOG = {100f, 1.2f};
	private static final float[] BAURU_SIMPLES = {101f, 1.3f};
	private static final float[] BAURU_OVO = {102f, 1.50f};
	private static final float[] HAMBURGER = {103f, 1.20f};
	private static final float[] CHEESEBURGUER = {104f, 1.30f};
	private static final float[] REFRIGERANTE = {105f, 1f};
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtd;
		float cod, hotDog, bauruSimples, bauruOvo, hamburguer, cheeseburguer, refrigerante;
		
		hotDog = bauruSimples = bauruOvo = hamburguer = cheeseburguer = refrigerante = 0f;
		
		do {
			System.out.print("Entre com o código do produto: ");
			cod = entrada.nextFloat();
			
			System.out.print("Entre com a quantidade do produto: ");
			qtd = entrada.nextInt();
			
			if (cod == HOT_DOG[0]) {
				
				hotDog += HOT_DOG[1] * qtd;
				
			} else if (cod == BAURU_SIMPLES[0]) {
				
				bauruSimples += BAURU_SIMPLES[1] * qtd;
				
			} else if (cod == BAURU_OVO[0]) {
				
				bauruOvo += BAURU_OVO[1] * qtd;
				
			} else if (cod == HAMBURGER[0]) {
				
				hamburguer += HAMBURGER[1] * qtd;
				
			} else if (cod == CHEESEBURGUER[0]) {
				
				cheeseburguer += CHEESEBURGUER[1] * qtd;
				
			} else if (cod == REFRIGERANTE[0]) {
				
				refrigerante += REFRIGERANTE[1] * qtd;
				
			}
			
		} while (cod != 0);
		
		System.out.println("Preco Hot Dogs: R$" + hotDog);
		System.out.println("Preco Bauru Simples: R$" + bauruSimples);
		System.out.println("Preco Bauru Ovo: R$" + bauruOvo);
		System.out.println("Preco Hamburguer: R$" + hamburguer);
		System.out.println("Preco Cheeseburguer: R$" + cheeseburguer);
		System.out.println("Preco Refrigerante: R$" + refrigerante);
		
		entrada.close();		
	}
	
}
