import java.util.Scanner;
/**
 * 
 * @author Lucas Andrin
 * 
 * Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será
 * digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em
 * 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo
 * abaixo:
 * 
 * • Montar a tabuada de: 5
 * Começar por: 4
 * Terminar em: 7
 * Vou montar a tabuada de 5 começando em 4 e terminando em 7:
 * 5 x 4 = 20
 * 5 x 5 = 25
 * 5 x 6 = 30
 * 5 x 7 = 35
 */
public class Exe29 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, inicio, fim, alternancia;
		
		System.out.print("Entre com o número: ");
		numero = entrada.nextInt();
		
		System.out.print("Entre com o inicio: ");
		inicio = entrada.nextInt();
		
		System.out.print("Entre com o fim: ");
		fim = entrada.nextInt();
		
		if (inicio > fim) {
			alternancia = inicio;
			inicio = fim;
			fim = alternancia;
		} else if (inicio == fim) {
			System.out.println("O inicio e o fim não podem ser iguais!");
		} else {
			while (inicio <= fim) {
				
				System.out.println(numero + " x " + inicio + " = " + numero * inicio);
				
				inicio++;
			}
		}
		
		
		entrada.close();		
	}
	
}
