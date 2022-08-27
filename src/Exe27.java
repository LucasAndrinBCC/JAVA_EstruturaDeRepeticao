import java.util.Scanner;
//O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora
//possui uma loja de conveniências. Faça um programa que implemente uma caixa
//registradora rudimentar. O programa deverá receber um número desconhecido de valores
//referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para
//indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o
//valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
//Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima
//compra. A saída deve ser conforme o exemplo abaixo:
//
//• Lojas Tabajara
//Produto 1: R$ 2.20
//Produto 2: R$ 5.80
//Produto 3: R$ 0
//Total: R$ 9.00
//Dinheiro: R$ 20.00
//Troco: R$ 11.00
public class Exe27 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float preco, pagamento, soma = 0;
		do {
			System.out.print("Entre como o preço do produto: ");
			preco = entrada.nextFloat();
			
			soma += preco;
		} while (preco > 0);
		
		System.out.println("Total: " + soma);
		
		System.out.print("Informe o dinheiro pago: ");
		pagamento = entrada.nextFloat();
		
		System.out.println("Troco: " + (pagamento - soma));
		
		entrada.close();		
	}
	
}
