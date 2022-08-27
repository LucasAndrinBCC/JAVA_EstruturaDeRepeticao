import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 *
 *
 * Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o
 * mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que
 * pergunte a cada um dos clientes da academia seu código, sua altura e seu peso. O final da
 * digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao
 * encerrar o programa também deve ser informados os códigos e valores do clente mais alto,
 * do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos
 * clientes.
 */
public class Exe30 {
	
	public int cod;
	public float altura;
	public float peso;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float mediaAlturas, mediaPesos;
		int countClientes = 0;
		boolean first = true;
		
		mediaAlturas = mediaPesos = 0f;
		
		Exe30 clienteMaior = new Exe30();
		Exe30 clienteMenor = new Exe30();
		Exe30 cliente = new Exe30();
		
		do {
			System.out.print("Entre com o código do cliente: ");
			cliente.cod = entrada.nextInt();
			
			if (cliente.cod != 0) {
				System.out.print("Entre com a sua altura: ");
				cliente.altura = entrada.nextFloat();
				
				System.out.print("Entre com o seu peso: ");
				cliente.peso = entrada.nextFloat();
				
				if (first) {
					first = false;
					clienteMaior = clienteMenor = cliente;
				} else {
					if (cliente.altura > clienteMaior.altura) {
						clienteMaior = cliente;
					} else if (cliente.altura < clienteMenor.altura) {
						clienteMenor = cliente;
					}
					
					if (cliente.peso > clienteMaior.peso) {
						clienteMaior = cliente;
					} else if (cliente.peso < clienteMenor.peso) {
						clienteMenor = cliente;
					}
				}
				
				mediaAlturas += cliente.altura;
				mediaPesos += cliente.peso;
				countClientes++;
			}
			
		} while (cliente.cod != 0);
		
		mediaAlturas /= countClientes;
		mediaPesos /= countClientes;
		
		System.out.println("Média de Alturas: " + mediaAlturas);
		System.out.println("Média de Pesos: " + mediaPesos);
		System.out.println("Maior Cliente {");
		System.out.println("	Código: " + clienteMaior.cod);
		System.out.println("	Altura: " + clienteMaior.altura);
		System.out.println("	Peso: " + clienteMaior.peso);
		System.out.println("}");
		System.out.println("Menor Cliente {");
		System.out.println("	Código: " + clienteMenor.cod);
		System.out.println("	Altura: " + clienteMenor.altura);
		System.out.println("	Peso: " + clienteMenor.peso);
		System.out.println("}");
		
		entrada.close();		
	}
}
