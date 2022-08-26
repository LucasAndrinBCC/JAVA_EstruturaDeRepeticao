import java.util.Scanner;

//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
//nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
//
public class Exe2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome, senha;
		
		nome = senha = "";
		
		do {
			try {
				System.out.print("Entre com o seu nome: ");
				nome = entrada.nextLine();
				System.out.print("Entre com o sua senha: ");
				senha = entrada.nextLine();
			} catch (Exception e) {
				System.out.println("Nome ou Senha inválidos!");
			}			
		} while (nome == senha);
		
		System.out.println("Nome: " + nome);
		System.out.println("Senha: " + senha);
		
		entrada.close();		
	}
	
}
