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
		
		Exe30 clienteMaisAlto = new Exe30();
		Exe30 clienteMaisBaixo = new Exe30();
		Exe30 clienteMaisGordo = new Exe30();
		Exe30 clienteMaisMagro = new Exe30();
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
					
					clienteMaisAlto.cod = cliente.cod;
					clienteMaisAlto.altura = cliente.altura;
					clienteMaisAlto.peso = cliente.peso;
					
					clienteMaisBaixo.cod = cliente.cod;
					clienteMaisBaixo.altura = cliente.altura;
					clienteMaisBaixo.peso = cliente.peso;
					
					clienteMaisGordo.cod = cliente.cod;
					clienteMaisGordo.altura = cliente.altura;
					clienteMaisGordo.peso = cliente.peso;
					
					clienteMaisMagro.cod = cliente.cod;
					clienteMaisMagro.altura = cliente.altura;
					clienteMaisMagro.peso = cliente.peso;
				} else {
					if (cliente.altura > clienteMaisAlto.altura) {
						clienteMaisAlto.cod = cliente.cod;
						clienteMaisAlto.altura = cliente.altura;
						clienteMaisAlto.peso = cliente.peso;
					} else if (cliente.altura < clienteMaisBaixo.altura) {
						clienteMaisBaixo.cod = cliente.cod;
						clienteMaisBaixo.altura = cliente.altura;
						clienteMaisBaixo.peso = cliente.peso;
					}
					
					if (cliente.peso > clienteMaisGordo.peso) {
						clienteMaisGordo.cod = cliente.cod;
						clienteMaisGordo.altura = cliente.altura;
						clienteMaisGordo.peso = cliente.peso;
					} else if (cliente.peso < clienteMaisMagro.peso) {
						clienteMaisMagro = cliente;
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
		System.out.println("Mais Alto {");
		System.out.println("	Código: " + clienteMaisAlto.cod);
		System.out.println("	Altura: " + clienteMaisAlto.altura);
		System.out.println("	Peso: " + clienteMaisAlto.peso);
		System.out.println("}");
		System.out.println("Mais Baixo {");
		System.out.println("	Código: " + clienteMaisBaixo.cod);
		System.out.println("	Altura: " + clienteMaisBaixo.altura);
		System.out.println("	Peso: " + clienteMaisBaixo.peso);
		System.out.println("}");
		System.out.println("Mais Gordo {");
		System.out.println("	Código: " + clienteMaisGordo.cod);
		System.out.println("	Altura: " + clienteMaisGordo.altura);
		System.out.println("	Peso: " + clienteMaisGordo.peso);
		System.out.println("}");
		System.out.println("Mais Magro {");
		System.out.println("	Código: " + clienteMaisMagro.cod);
		System.out.println("	Altura: " + clienteMaisMagro.altura);
		System.out.println("	Peso: " + clienteMaisMagro.peso);
		System.out.println("}");
		
		entrada.close();		
	}
}
