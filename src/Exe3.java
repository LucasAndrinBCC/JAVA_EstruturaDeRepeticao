import java.util.Scanner;
//Faça um programa que leia e valide as seguintes informações:
//	a. Nome: maior que 3 caracteres;
//	b. Idade: entre 0 e 150;
//	c. Salário: maior que zero;
//	d. Sexo: 'f' ou 'm';
//	e. Estado Civil: 's', 'c', 'v', 'd';
public class Exe3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean validacao = false;
		String nome;
		char sexo, estadoCivil;
		int idade;
		float salario;
		
		do {
			
			try {
				System.out.print("Entre com o seu nome: ");
				nome = entrada.nextLine();
				
				System.out.print("Entre com a sua idade: ");
				idade = entrada.nextInt();
				
				System.out.print("Entre com o seu salário: ");
				salario = entrada.nextFloat();
				
				entrada.nextLine();				
				System.out.print("Entre com o seu estado civil: ");
				estadoCivil = entrada.nextLine().charAt(0);
				
				System.out.print("Entre com o seu sexo: ");
				sexo = entrada.nextLine().charAt(0);
				
				if (nome.length() < 3) {
					validacao = true;
					System.out.println("O nome deve ter ao menos 3 caracteres!");
				} else if (idade < 0 || idade > 150) {
					validacao = true;
					System.out.println("Idade deve estar entre 0 - 150 anos!");
				} else if (salario <= 0) {
					validacao = true;
					System.out.println("Salário deve ser maior que 0!");
				} else if (sexo != 'm' && sexo != 'f') {
					validacao = true;
					System.out.println("Sexo deve ser masculino (m) ou feminino (f)!");
				} else if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
					validacao = true;
					System.out.println("Estado civil deve ser: s, c, v, d!");
				}
			} catch (Exception e) {
				System.out.println("Entrada de dados inválida!");
			}
			
		} while (validacao);
		
		System.out.println("Passou!");
		
		entrada.close();
	}

}
